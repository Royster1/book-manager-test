package com.example.servelet;

import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;
import com.example.utils.ThymeleafUtil;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/show")
public class ShowServlet extends HttpServlet {

    BookService service;
    @Override
    public void init() throws ServletException {
        service = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        Context context = new Context();
        context.setVariable("book_list", service.findAll());
        ThymeleafUtil.process("show.html", context, resp.getWriter());
    }


}


/*
* BookService service;
    @Override
    public void init() throws ServletException {
        service = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("index.jsp").forward(req,resp);
        Context context = new Context();
        context.setVariable("book_list", service.findAll());
        ThymeleafUtil.process("show.html", context, resp.getWriter());
    }
*
* */