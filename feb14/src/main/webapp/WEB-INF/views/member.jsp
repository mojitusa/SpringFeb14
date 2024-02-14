<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			
		</thead>
		<tbody>
			<c:forEach items="${list }" var="list" >
				<tr>
					<td>${list.mno }</td>
					<td>${list.mid }</td>
					<td>${list.mname }</td>
					<%-- <td>${list.mdate }</td> --%>
					<td>
					<fmt:formatDate value="${list.mdate }" pattern="yyyy-MM-dd HH-mm-ss" var="newDate"/>
					${newDate }
					</td>
					<td>${list.mgrade }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>