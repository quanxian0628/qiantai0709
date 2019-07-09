<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		 <link rel="shortcut icon" href="img/lock_24px.ico" type="image/x-icon" />
		<title>xxx管理系统</title>
	</head>
	<frameset rows="16%,*" border="3">
		<frame src="topFrame.jsp" scrolling="no" noresize="noresize" />
		<frameset cols="14%,*" border="1">
			<frame src="leftFrame.jsp" scrolling="no" noresize="noresize" />
			<frame src="welcome.jsp" name="mainFrame" scrolling="no" noresize="noresize" />
		</frameset>
	</frameset>
</html>
