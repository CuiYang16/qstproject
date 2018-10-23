/**
 * 
 */
//返回顶部
//当网页向下滑动 20px 出现"返回顶部" 按钮
window.onscroll = function() {scrollFunction()};
 
function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("right-nav").style.display = "block";
    } else {
        document.getElementById("right-nav").style.display = "none";
    }
}

function returntop(){
	document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}