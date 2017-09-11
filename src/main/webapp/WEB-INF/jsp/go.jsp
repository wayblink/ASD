<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset=utf-8" />
<title>我的导航</title>
<style type="text/css">
<!-- body { font:normal 14px Tahoma, Simsun; margin:0; padding:25px 0 0; vertical-align:baseline; background:#fff; } h1 { font:bold 26px "微软雅黑", tahoma; margin:0 0 10px; } a { color:#0d63e3; } a:hover { color:#f54; } .header, .links, .footer { width:700px; margin:15px auto; padding:2px; text-align:center; } .search { width:700px; margin:15px auto; padding:8px 4px; text-align:center; background:#f8f8f8; border:2px solid #f2f2f2; } .search form { width:485px; margin:0 auto; } .i { font-size:16px; font-family:Tahoma; width:360px; height:24px; line-height:24px; padding:3px 6px; margin-right:2px; background:#fff url(img/search_bg.png) no-repeat; border:1px solid #b6b6b6; border-color:#7b7b7b #b6b6b6 #b6b6b6 #7b7b7b; display:inline-block; } .btn_wr { width:97px; height:34px; vertical-align:top; _padding-top:1px; background:url(img/search_bg.png) no-repeat -202px bottom; display:inline-block; } .btn { font:normal 14px Tahoma; width:95px; height:32px; padding:0; background:#ddd url(img/search_bg.png) no-repeat 0 -35px; cursor:pointer; border:0; } .btn_h { background-position:-100px -35px; } .description { font-size:12px; color:#888; margin:0; } .hide { display:none; } .linkad { width:712px; margin:10px auto; } .sites { width:700px; margin:15px auto; padding:4px; background:#fff; border:2px solid #f2f2f2; } .sites dl { height:36px; line-height:36px; margin:0; display:block; } .sites dl.alt { background:#f8f8f8; border-top:1px solid #f2f2f2; border-bottom:1px solid #f2f2f2; } .sites dt, .sites dd { text-align:center; display:block; float:left; } .sites dt { width:60px; } .sites dd { width:90px; margin:0; } .footer { font-size:11px; color:#888; margin:15px auto; } .center { text-align:center; font-weight:bold; } .center a { color:#ff3300; } -->
</style>

</head>

<body>
<div class="search">
<form action="http://www.baidu.com/baidu" target="_blank">
<table><tr><td>
<input name="tn" type="hidden" value="baidu" />
<input type="text" class="i" name="word" size="30" />
<span class="btn_wr"><input type="submit" class="btn" value="百度一下" onmousedown="this.className='btn btn_h'" onmouseout="this.className='btn'" /></span>
</td></tr></table>
</form>
</div>

<div class="sites">
<dl>
<dt>技术</dt>
<dd><a href="http://linux.vbird.org/" target="_blank">鸟哥Linux</a></dd>
<dd><a href="http://tools.zhaishidan.cn/" target="_blank">资料推荐</a></dd>
<dd><a href="http://man.linuxde.net/" target="_blank">Linux命令</a></dd>
<dd><a href="https://tech.meituan.com/" target="_blank">美团博客</a></dd>
<dd><a href="http://www.runoob.com/css/css-tutorial.html" target="_blank">菜鸟教程</a></dd>

</dl>

<dl class="alt">
<dt>Java</dt>
<dd><a href=http://www.ganecheng.tech/index.html target="_blank">ganecheng</a></dd>
<dd><a href=http://www.cnblogs.com/skywang12345/ target="_blank">skywang</a></dd>
<dd><a href=http://cmsblogs.com/ target="_blank">死磕Java</a></dd>
<dd><a href="http://ifeve.com/" target="_blank">并发编程网</a></dd>
<dd><a href="http://www.importnew.com/" target="_blank">ImportNew</a></dd>

</dl>

<dl>
<dt>常用</dt>

<dd><a href="https://www.aliyun.com/" target="_blank">阿里云</a></dd>
<dd><a href="http://www.youdao.com" target="_blank">有道词典</a></dd>
<dd><a href="http://www.sjtu.edu.cn/info/1607/31738.htm" target="_blank">校车信息</a></dd>
</dl>

<dl class="alt">
<dt>我的</dt>
<dd><a href="http://blog.csdn.net/picway" target="_blank">我的博客</a></dd>
<dd><a href="https://github.com/wayblink" target="_blank">Github</a></dd>
</dl>

</div>

</body>
</html>