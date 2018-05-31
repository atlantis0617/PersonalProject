<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 包含头部信息用于适应不同设备 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 包含 bootstrap 样式表 -->
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
    <script src="../../js/jquery-3.1.0.min.js"></script>
    <!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
    <script src="../../js/bootstrap.min.js"></script>
<title>商品显示</title>
</head>
<body>
	<table cellpadding="10" cellspacing="0" border="1" align="center" class="table">
		<thead>
			<tr>
				<td>商品序号</td>
				<td>商品名称</td>
				<td>商品价格</td>
			</tr>
		</thead>
		<tbody>
            <s:iterator value="#request.pros">
                <tr class="danger">
                    <td>${pid}</td>
                    <td>${pname}</td>
                    <td>${price}</td>
                    <td><a href="addProduct.jsp">新增</a></td>
                    <td><a href="emp-delete?employeeId=${pid}">Delete</a></td>
                </tr>
            </s:iterator>
        </tbody>
	</table>
</body>
</html>