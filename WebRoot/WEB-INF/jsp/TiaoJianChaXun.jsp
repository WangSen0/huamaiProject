<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/12
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索</title>
</head>
<body>
<form action="/showZhuJiLiangKu/result" method="post">
    <table border="1px solid blue">
        <tr>
            <td>品种:</td>
            <td><input type="text" name="pinZhong"></td>
        </tr>
        <tr>
            <td>供货单位:</td>
            <td><input type="text" name="gongHuoDanWei"></td>
        </tr>
        <tr>
            <td>车号:</td>
            <td><input type="text" name="cheHao"></td>
        </tr>
        <tr>
            <td>日期时间:</td>
            <td><input type="text" name="riQiShiJian"></td>
        <tr>
            <td>出入库:</td>
            <td><input type="text" name="chuRuKu"></td>
        </tr>

        <input type="submit" value="submit">

    </table>
</form>
</body>
</html>
