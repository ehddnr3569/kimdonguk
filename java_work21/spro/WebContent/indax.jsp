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
<script type="text/javascript">
	window.onload = function(){
		document.getElementbyId('idsearch').onclick = function(){
			location.href = 'idsearch.jsp';
	}
	window.onload = function(){
		document.getElementbyId('login').onclick = function(){
			location.href = 'login.jsp';
	}
	window.onload = function(){
		document.getElementbyId('outroom').onclick = function(){
			location.href = 'outroom.jsp';
	}
	window.onload = function(){
		document.getElementbyId('signin').onclick = function(){
			location.href = 'signin.jsp';
	}
</script>
</head>
<body>
	<div class = "container">
		<table>
			<tr>
				<td>아이디</td>
				<td type="text" name="Id"></td>
				<td>비밀번호</td>
				<td type="text" name="pw"></td>
			</tr>
			<tr>
				<td><input type="button" value="ID찾기"></td>
				<td><input type="button" value="로그인"></td>
				<td><input type="button" value="회원가입"></td>
				<td><input type="button" value="퇴실"></td>
			</tr>
		</table>
	</div>
</body>
</html>