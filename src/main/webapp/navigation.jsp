<!-- Fixed navbar -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Agenstvo</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">Головна</a></li>
                <li><a href="search_building.jsp">Пошук</a></li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Додати <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="add_building.jsp">Будинок</a></li>
                        <li class="active"><a href="add_user.jsp">Користувача системи</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Перегляд <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Всі будинки</a></li>
                        <li><a href="usersList.jsp">Всі користувачі</a></li>
                        <li><a href="#">Історія</a></li>
                        <li><a href="#">Статистика</a></li>
                    </ul>
                </li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <%--<li><a href="../navbar/">Default</a></li>--%>
                <%--<li><a href="../navbar-static-top/">Static top</a></li>--%>
                <li class="active"><a href="login.jsp">Вхід</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>