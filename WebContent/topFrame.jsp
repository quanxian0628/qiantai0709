<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="css/topFrame.css" />
<script src="js/jquery.min.js"></script>
<script src="js/topFrame.js"></script>
</head>
<body>
	<div class="div1">XXX管理系统</div>
	<div class="div2">
		欢迎您：${sessionScope.uName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
			href="javascript:void(0)" class="exit">注销</a>
	</div>
</body>
</html>
