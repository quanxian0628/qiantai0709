$(document).ready(function () {
	$(".exit").click(function () {
		var answer=confirm("您确定要退出吗？");
		if(answer==true){
			window.parent.location.href="ExitServlet";
		}
	});
});