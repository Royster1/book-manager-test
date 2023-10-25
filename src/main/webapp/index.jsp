<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
</h1>
<body>
<h1>图书信息系统</h1>
<form method="post" action="login">
    <hr>
    <div>
        <label>
            <input type="text" placeholder="书名" name="bookname">
        </label>
    </div>
    <div>
        <label>
            <input type="text" placeholder="单价" name="bookprice">
        </label>
    </div>
    <div>
        <label>
            <input type="text" placeholder="数量" name="booknum">
        </label>
    </div>
    <hr>
    <div>
        <button>添加数据</button>
    </div>
</form>
<form method="get" action="show">
    <button>查看提交数据</button>
</form>
</body>
</body>
</html>