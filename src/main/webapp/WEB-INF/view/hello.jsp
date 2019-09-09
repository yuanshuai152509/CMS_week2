<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/jquery-3.2.1.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resource/mystyles.css" type="text/css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- (3)创建一个带页<textarea>多行文本框的表单页面。（4分）
(4)输入多行带分段的文本，提交到后台Controller控制器中。 -->
<form action="/hello" method="post">
	内容：<textarea rows="10" cols="25" name="content"></textarea>
		<button type="submit">提交</button>
		
</form>
</body>
</html>