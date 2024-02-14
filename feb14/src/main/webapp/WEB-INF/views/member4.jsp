<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
   <table>
      <thead>
         <tr>
            <th>회원번호</th>
            <th>회원등급</th>
            <th>ID</th>
            <th>회원이름</th>
            <th>가입날짜</th>
         </tr>
      </thead>
      
      <tbody>
         <c:forEach items="${list }" var="row1">
            <tr>
               <td>${row1.mno }</td>
               <td>${row1.mgrade }</td>
               <td>${row1.mid }</td>
               <td>${row1.mname }</td>
               <td>${row1.mdate }</td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
</body>
</html>