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
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.bno}</td>
				<td><a href="/board/get?bno=${list.bno}">${list.title}</a></td>
				<td>${list.contents}</td>
				<td>${list.updatedate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>