<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to REsultSheet</h2>
<%
	out.println("Name:"+request.getParameter("tbName"));
	out.println("<br>");
	out.println("Math:"+request.getParameter("tbMath"));
	out.println("<br>");
	out.println("Phy:"+request.getParameter("tbPhy"));
	out.println("<br>");
	out.println("Chem:"+request.getParameter("tbChem"));
	out.println("<br>");
	out.println("Total:"+request.getAttribute("sum"));
	out.println("<br>");
	out.println("Percentage:"+request.getAttribute("Percentage"));	
	out.println("<br>");
	out.println("Grade:"+request.getAttribute("Grade"));
	
	

%>
</body>
</html>