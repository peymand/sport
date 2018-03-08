<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">

        <div class="navbar-header">
            <a class="navbar-brand" href="#">Project Management</a>
        </div>

        <ul class="nav navbar-nav">

            <li><a href="#">Home</a></li>

            <li class="dropdown">

                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button"
                   aria-expanded="false">Projects <span class="caret"></span></a>

                <ul class="dropdown-menu" role="menu">
                    <li><a href="<spring:url value="/project/add"/>">Add</a></li>
                    <li><a href="<spring:url value="/project/find"/>">Find</a></li>
                </ul>

            </li>

            <li class="dropdown">

                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button"
                   aria-expanded="false">Resources <span class="caret"></span></a>

                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Add</a></li>
                    <li><a href="#">Find</a></li>
                </ul>

            </li>

        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
</nav>