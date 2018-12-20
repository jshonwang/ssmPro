<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%
	String path = (request.getServletContext().getContextPath());
%>


<script type="text/javascript">
	alert("<%=request.getServletContext().getContextPath() %>");
</script>
</head>
<body>
	<form action="<%=path%>/save" method="post">
		<table>
			<tr>
				<td><span>姓名：</span><input id="username" name = "username" placeholder="请输入用户名" type="text"/></td>
			</tr>
			<tr>
				<td><span>密码：</span><input id="password" name = "password" placeholder="请输入密码" type="text"/></td>
			</tr>
			<tr>
				<td><span>详细：</span><input id="detail" name = "detail" placeholder="请输入详细内容" type="text"/></td>
			</tr>
			<tr>
				<td><input type="submit" name = "but"/>提交</td>
			</tr>
		</table>
	</form>

</body>
</html>