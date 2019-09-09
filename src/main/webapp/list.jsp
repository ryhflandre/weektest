<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#btn").click(function() {
		var all = $("form").serialize();
		$.post("check.do",all,function(da){
			if(da){
				alert("验证成功");
			}else{
				alert("验证失败，内容为空")
			}
		},"json");
	});
});
</script>
<link rel="stylesheet" style="text/css" href="css.css">
<title>Insert title here</title>
</head>
<body>
<form action="#">
	<table>
		<tr>
			<td>信息</td>
			<td>
				<textarea rows="5" cols="50" name="context">
				
				
				</textarea>
			</td>
		</tr>
		<tr>
			<td>电话号:</td>
			<td><input type="text" name="phone"></td>
		</tr>
		<tr>
			<td>邮箱:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td colspan="100">
				<input type="button" value="验证" id="btn">
			</td>
		</tr>
	</table>
</form>
</body>
</html>