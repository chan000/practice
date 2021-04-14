<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/delete" method="post">
		<input type="hidden" name="bno" value="${get.bno}">
		<table border="1">
			<tr>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
			</tr>
			<tr>
				<td>${get.title }</td>
				<td>${get.contents }</td>
				<td>${get.writer }</td>
			</tr>

		</table>
		<input type="submit" value="삭제">
	</form>
</body>
</html>