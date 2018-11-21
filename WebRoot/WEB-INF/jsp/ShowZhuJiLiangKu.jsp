<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/11
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<table border="1px solid blue">
    <tr>
        <td>毛重</td>
        <td>皮重</td>
        <td>净重</td>
        <td>毛重计量员</td>
        <td>毛重日期</td>
        <td>毛重时间</td>
        <td>品种 	</td>
        <td>计量方式</td>
        <td>供货单位</td>
        <td>收货单位</td>
        <td>编号 	</td>
        <td>车号 	</td>
        <td>日期时间</td>
        <td>卡号 	</td>
        <td>运输单位</td>
        <td>皮重计量员</td>
        <td>皮重日期 </td>
        <td>皮重时间 </td>
        <td>皮重差 </td>
        <td>出入库 	</td>
    </tr>
    <c:forEach var="everyOne" items="${zhujiliangku}">
    <tr>
        <td>${everyOne.maoZhong}</td>
        <td>${everyOne.piZhong}</td>
        <td>${everyOne.jingZhong}</td>
        <td>${everyOne.maoZhongJiLiangYuan}</td>
        <td>${everyOne.maoZhongRiQi}</td>
        <td>${everyOne.maoZhongShiJian}</td>
        <td>${everyOne.pinZhong}</td>
        <td>${everyOne.jiLiangFangShi}</td>
        <td>${everyOne.gongHuoDanWei}</td>
        <td>${everyOne.shouHuoDanWei}</td>
        <td>${everyOne.bianHao}</td>
        <td>${everyOne.cheHao}</td>
        <td>${everyOne.riQiShiJian}</td>
        <td>${everyOne.kaHao}</td>
        <td>${everyOne.yunShuDanWei}</td>
        <td>${everyOne.piZhongJiLiangYuan}</td>
        <td>${everyOne.piZhongRiQi}</td>
        <td>${everyOne.piZhongShiJian}</td>
        <td>${everyOne.piZhongCha}</td>
        <td>${everyOne.chuRuKu}</td>
    </tr>
    </c:forEach>

</body>
</html>
