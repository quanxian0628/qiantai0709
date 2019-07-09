$(document).ready(function () {
	$("form").submit(function () {
		var uName = $("input[type=text]").val().trim();
		var uPwd = $("input[type=password]").val().trim();

		var json = { "uName": uName, "uPwd": uPwd };

		$.post("LoginServlet2", json, function (data) {
			if (data > 0) {
				location.href = "index.jsp";
			} else {
				alert("登录失败！");
			}
		});
		return false;
	});
});