<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type = "text/css">
	.container{
	width : 800px;
	height: 500px;
	margin: 0 outo;
	background-color: #ccc;
	padding: 150px 100px;
	box-sizing: border-box;
	}
</style>
</head>
<body>
	<div class = "container">
	<!-- get 방식은 주소줄에 뭘 가져가는지 보여주는 방식 -->
		<from action = "signproc.jsp" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type = "text" name ="id"/></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type = "text" name ="pw"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type = "text" name ="name"/></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type = "text" name ="phone"/></td>
				</tr>
			</table>
			<input type = "submit" value ="회원가입"/>
		</from>
	</div>
</body>
</html>