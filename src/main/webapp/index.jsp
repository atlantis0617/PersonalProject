<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALTER系统主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The styles -->
    <link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="css/charisma-app.css" rel="stylesheet">
    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='css/jquery.noty.css' rel='stylesheet'>
    <link href='css/noty_theme_default.css' rel='stylesheet'>
    <link href='css/elfinder.min.css' rel='stylesheet'>
    <link href='css/elfinder.theme.css' rel='stylesheet'>
    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='css/uploadify.css' rel='stylesheet'>
    <link href='css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="img/favicon.ico">
</head>
<body>
		<!-- topbar starts -->
    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-inner">
            <button type="button" class="navbar-toggle pull-left animated flip">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp"> <img alt="Charisma Logo" src="img/logo20.png" class="hidden-xs"/>
            <span>ALTER</span></a>

            <!-- user dropdown starts -->
            <div class="btn-group pull-right">
                <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> admin</span>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="login.jsp">注销</a></li>
                </ul>
            </div>
            <!-- 主题 -->
            <div class="btn-group pull-right theme-container animated tada">
                <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-tint"></i><span
                        class="hidden-sm hidden-xs">更换主题</span>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" id="themes">
                    <li><a data-value="classic" href="#"><i class="whitespace"></i> 经典版</a></li>
                    <li><a data-value="cerulean" href="#"><i class="whitespace"></i> 天蓝版</a></li>
                    <li><a data-value="cyborg" href="#"><i class="whitespace"></i> 机械版</a></li>
                    <li><a data-value="simplex" href="#"><i class="whitespace"></i> 精简版</a></li>
                    <li><a data-value="darkly" href="#"><i class="whitespace"></i> 暗黑版</a></li>
                    <li><a data-value="lumen" href="#"><i class="whitespace"></i> 流明版</a></li>
                    <li><a data-value="slate" href="#"><i class="whitespace"></i> 灰石版</a></li>
                    <li><a data-value="spacelab" href="#"><i class="whitespace"></i> 太空版</a></li>
                    <li><a data-value="united" href="#"><i class="whitespace"></i> 联合版</a></li>
                </ul>
            </div>
            <!-- theme selector ends -->

            <!-- <ul class="collapse navbar-collapse nav navbar-nav top-menu">
                <li><a href="#"><i class="glyphicon glyphicon-globe"></i> 访问网站</a></li>
                 <li class="dropdown">
                    <a href="#" data-toggle="dropdown"><i class="glyphicon glyphicon-star"></i> Dropdown <span
                            class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li> 
                <li>
                    <form class="navbar-search pull-left">
                        <input placeholder="Search" class="search-query form-control col-md-10" name="query" type="text">
                    </form>
                </li> 
            </ul> -->
        </div>
    </div>
    <!-- topbar ends -->
	<div class="ch-container">
    <div class="row">
        <!-- left menu starts -->
        <div class="col-sm-2 col-lg-2">
            <div class="sidebar-nav">
                <div class="nav-canvas">
                    <div class="nav-sm nav nav-stacked">
                    </div>
                    <ul class="nav nav-pills nav-stacked main-menu">
                        <li><a class="ajax-link" href="index.jsp"><i class="glyphicon glyphicon-home"></i><span> 主页</span></a>
                        </li>
                        <li class="accordion">
                            <a href="#"><i class="glyphicon glyphicon-plus"></i><span> 基础资料</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li class="accordion">
	                            	<a href="#"><i class="glyphicon glyphicon-plus"></i><span> 产品管理</span></a>
		                            <ul class="nav nav-pills nav-stacked">
		                                <li><a class="ajax-link" href="login.jsp"><i class="glyphicon glyphicon-th"></i>产品管理</a></li>
		                                <li><a class="ajax-link" href="login.jsp"><i class="glyphicon glyphicon-th"></i>用户管理</a></li>
		                            </ul>
                        		</li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!--/span-->
        <!-- left menu ends -->
        <noscript>
            <div class="alert alert-block col-md-12">
                <h4 class="alert-heading">Warning!</h4>

                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
                    enabled to use this site.</p>
            </div>
        </noscript>

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            <!-- <div>
			    <ul class="breadcrumb">
			        <li>
			            <a href="#">Home</a>
			        </li>
			        <li>
			            <a href="#">Dashboard</a>
			        </li>
			    </ul>
			</div> -->
				<div class=" row">
					<div class="col-md-3 col-sm-3 col-xs-6">
						<a data-toggle="tooltip" title="6条处理中" class="well top-block" href="#"> 
							<i class="glyphicon glyphicon-leaf yellow"></i>
							<div>事件处理中总数</div><span class="notification">6</span>
						</a>
					</div>

					<div class="col-md-3 col-sm-3 col-xs-6">
						<a data-toggle="tooltip" title="4条处理成功" class="well top-block" href="#">
						 <i class="glyphicon glyphicon glyphicon-bell green"></i>
							<div>事件处理成功总数</div><span class="notification green">4</span>
						</a>
					</div>

					<div class="col-md-3 col-sm-3 col-xs-6">
						<a data-toggle="tooltip" title="34条处理警告" class="well top-block" href="#"> 
						<i class="glyphicon glyphicon-exclamation-sign yellow"></i>
							<div>事件处理警告</div><span class="notification yellow">34</span>
						</a>
					</div>

					<div class="col-md-3 col-sm-3 col-xs-6">
						<a data-toggle="tooltip" title="12条未读邮件" class="well top-block" href="#"> 
						<i class="glyphicon glyphicon-envelope red"></i>
						   <div>邮件信息</div><span class="notification red">12</span>
						</a>
					</div>
			</div>
		</div>
	</div>
   <!--  <footer class="row">
        <p class="col-md-9 col-sm-9 col-xs-12 copyright">&copy; <a href="http://usman.it" target="_blank">Muhammad
                Usman</a> 2012 - 2015</p>

        <p class="col-md-3 col-sm-3 col-xs-12 powered-by">Powered by: <a
                href="http://usman.it/free-responsive-admin-template">Charisma</a></p>
    </footer> -->

</div><!--/.fluid-container-->

<!-- external javascript -->

<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='bower_components/moment/min/moment.min.js'></script>
<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="js/charisma.js"></script>
</body>
</html>