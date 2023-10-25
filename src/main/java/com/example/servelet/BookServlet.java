package com.example.servelet;


import com.example.entity.Book;
import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;
import com.example.utils.ThymeleafUtil;
import org.thymeleaf.context.Context;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class BookServlet extends HttpServlet {

    BookService service;
    @Override
    public void init() throws ServletException {
        service = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置一下响应类型
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        // 获取POST请求携带的表单数据
        String bookname = req.getParameter("bookname");
        String bookprice = req.getParameter("bookprice");
        String booknum = req.getParameter("booknum");

        // 判断表单是否完整
        if(!bookname.isEmpty() && !bookprice.isEmpty() && !booknum.isEmpty()){
            service.insertBook(new Book(bookname, Double.parseDouble(bookprice), Integer.parseInt(booknum)));
            resp.sendRedirect("success.jsp");
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }
}

//
