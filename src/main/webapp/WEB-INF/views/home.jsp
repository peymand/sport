<%--
  Created by IntelliJ IDEA.
  User: Peyman
  Date: 3/7/2018
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="<spring:url value="/resources/css/main.css"/>" type="text/css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>
<script src="<spring:url value="/resources/js/resource.js"/>"></script>


<html>
<head>
    <title>Home</title>
</head>
<body>
        <jsp:include page="../views/fragments/header.jsp"></jsp:include>

        <div class="container">

            <h2>Current Project</h2>
            <ul class="list-group">
                <li class="list-group-item"><label>Project Name:</label><span>${currentProject.name }</span></li>
                <li class="list-group-item"><label>Sponsor:</label><span>${currentProject.sponsor.name }</span></li>
                <li class="list-group-item"><label>Description:</label><br/><span>${currentProject.description }</span></li>
            </ul>

        </div>
</body>
</html>
