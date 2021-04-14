<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/board/register" method="post">
		<div class="form">
			제목 <input name="title"><br>
			내용 <input name="contents"><br>
			작성자 <input name="writer">
		</div>
		
		<input type="submit" value="제출">
	</form>

</body>
</html>