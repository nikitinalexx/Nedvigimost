<%--
  Created by IntelliJ IDEA.
  User: Bohdan
  Date: 26.03.16
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" ng-app="NgApp">
<head>
    <title>Create user | Agenstvo</title>
    <jsp:include page="head.jsp"/>
</head>
<body>
<jsp:include page="navigation.jsp"/>

<div class="container">
    <div class="col-sm-6">
        <div class="jumbotron">
            <h2>Створення користувача</h2>
            <form>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" placeholder="Email'я">
                </div>
                <div class="form-group">
                    <label for="password">Пароль</label>
                    <input type="text" class="form-control" id="password" placeholder="Пароль">
                </div>
                <div class="form-group">
                    <label for="first_name">Ім'я</label>
                    <input type="text" class="form-control" id="first_name" placeholder="Ім'я">
                </div>
                <div class="form-group">
                    <label for="second_name">Прізвище</label>
                    <input type="text" class="form-control" id="second_name" placeholder="Прізвище">
                </div>
                <div class="form-group">
                    <label for="middle_name">Побатькові</label>
                    <input type="text" class="form-control" id="middle_name" placeholder="Побатькові">
                </div>
                <div class="form-group">
                    <label for="middle_name">Роль</label><br/>

                    <!-- Single button -->
                    <div class="btn-group">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Виберіть роль <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#">Адміністратор</a></li>
                            <li><a href="#">Ріелтор</a></li>
                        </ul>
                    </div>


                </div>
                <button type="submit" class="btn btn-default">Зберегти</button>
            </form>
        </div>
    </div>
</div> <!-- /container -->

<jsp:include page="footer.jsp"/>
</body>
</html>
