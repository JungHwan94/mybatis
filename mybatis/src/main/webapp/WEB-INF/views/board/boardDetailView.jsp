<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp" />
	<div class="outer">
		<h2>게시판 상세보기</h2>
		<table>
			<tr>
				<td>글번호</td>
				<td>${board.boardNo}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${board.boardTitle}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${board.boardWriter}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${board.boardcount}</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>${board.createDate}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>${board.boardContent}</td>
			</tr>
		</table>
	</div>
</body>
</html>