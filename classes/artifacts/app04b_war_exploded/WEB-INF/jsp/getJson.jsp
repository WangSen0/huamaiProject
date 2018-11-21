<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/15
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript">
    function requestJson() {
        $.ajax({
            type : "post",
            url : "${pageContext.request.contextPath}/items/requestJson.action",
            contentType : "application/json;charset=utf-8",
            data : '{"name":"水杯", "id":"101"}',
            success : function(data) {
                alert(data.name);
            }
        });
    }
</script>
</head>
<body>
    <input type="button" value="发送json请求" onclick="requestJson()">
</body>
</html>

