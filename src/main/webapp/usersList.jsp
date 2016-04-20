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
    <h2>Користувачі</h2>
    <jsp:useBean id="allUsers" type="java.util.ArrayList" scope="session" />
    <table class="table table-condensed">
        <thead>
        <tr>
            <th>Ім'я</th>
            <th>Прізвище</th>
            <td>Логін</td>
            <td>Тип</td>
            <td>Редагувати</td>
        </tr>
        </thead>
        <tbody>
        <% for(int i = 0; i < allUsers.size(); i+=1) { %>
        <tr>
            <td>${allUsers.get(i).getName()}</td>
            <td>${allUsers.get(i).getSurName()}</td>
            <td>${allUsers.get(i).getLogin()}</td>
            <td>${allUsers.get(i).getType()}</td>
            <td>${allUsers.get(i).getEditButton()}</td>
        </tr>
        <% } %>
        </tbody>
    </table>

</div>

<jsp:include page="footer.jsp"/>
</body>
</html>