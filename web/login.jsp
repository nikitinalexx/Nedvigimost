<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" ng-app="NgApp">
<head>
    <title>Authorization | Agenstvo</title>
    <jsp:include page="head.jsp"/>
</head>
<body>
<jsp:include page="navigation.jsp"/>

<div class="container">
    <div class="col-sm-6">
        <div class="jumbotron">
            <h1>Вхід</h1>
            <form>
                <div class="form-group">
                    <label for="email">Email address</label>
                    <input type="email" class="form-control" id="email" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" placeholder="Пароль">
                </div>
                <button type="submit" class="btn btn-default">Увійти</button>
            </form>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>