$(document).ready(function () {

	loadMenu();

	//加载菜单
	function loadMenu() {

		$.post("SelectMenuServlet", "", function (json) {
			if (json != "") {
				$(json).each(function () {
					var pin = '<div class=""><img alt="图标加载失败" src="img/jiahao.png" title="点击扩展" /> <a href="' + this.mURL + '" target="mainFrame">' + this.mName + '</a></div>';
					$(".max .hr1").append(pin);
				});
			} else {
				alert("您没有任何权限！");
			}
		}, "json");
	}

});