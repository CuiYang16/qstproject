/**
 * 轮播图
 */
function carouselImg() {
	
	var iwidth = document.body.clientWidth;
	var iheight = document.body.clientHeight;
	var carouselimg = document.getElementById("carouselimg");
	var img = carouselimg.getElementsByTagName("img");
	for(var i=0;i<img.length;i++){
		img[i].style.height = iheight * 0.7 + "px";
		img[i].style.width = iwidth * 1 + "px";
	}
}