<%--
  Created by IntelliJ IDEA.
  User: Bohdan
  Date: 26.03.16
  Time: 17:46
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
            <h2>Пошук будинку</h2>
            <form>
                <div class="form-group">
                    <label for="idBuilding">Пошук будівлі</label><br/>

                    <!-- Single button -->
                    <div class="btn-group">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Виберіть тип будівлі <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#">Будинок</a></li>
                            <li><a href="#">Квартира</a></li>
                        </ul>
                    </div>

                </div>

                <div class="form-group">
                    <label for="email_owner">Тип дії</label><br/>
                    <!-- Single button -->
                    <div class="btn-group">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Виберіть тип будинку <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#">Будинок</a></li>
                            <li><a href="#">Квартира</a></li>
                        </ul>
                    </div>
                </div>


                <div class="form-group">
                    <label for="num_of_floors">Кількість поверхів</label>
                    <div class="input-group spinner">
                        <input type="text" class="form-control" value="1">
                        <div class="input-group-btn-vertical">
                            <button class="btn btn-default" type="button"><i class="fa fa-caret-up"></i></button>
                            <button class="btn btn-default" type="button"><i class="fa fa-caret-down"></i></button>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="num_of_rooms">Кількість кімнат</label>
                        <div class="input-group spinner">
                            <input type="text" class="form-control" id="num_of_rooms" value="1">
                            <div class="input-group-btn-vertical">
                                <button class="btn btn-default" type="button"><i class="fa fa-caret-up"></i></button>
                                <button class="btn btn-default" type="button"><i class="fa fa-caret-down"></i></button>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="num_of_baths">Кількість ванних кімнат</label>
                            <div class="input-group spinner">
                                <input type="text" class="form-control" id="num_of_baths" value="1">
                                <div class="input-group-btn-vertical">
                                    <button class="btn btn-default" type="button"><i class="fa fa-caret-up"></i></button>
                                    <button class="btn btn-default" type="button"><i class="fa fa-caret-down"></i></button>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="living_area">Загальна площа</label>
                                <input type="text" class="form-control" id="living_area" placeholder="Загальна площа">
                            </div>
                            <div class="form-group">
                                <label for="living_area">Вільна площа</label>
                                <input type="text" class="form-control" id="living_area" placeholder="Площа двору">
                            </div>
                            <div class="form-group">
                                <label for="court_area">Площа двору (лише для будинків)</label>
                                <input type="text" class="form-control" id="court_area" placeholder="Площа двору">
                            </div>

                            <div class="form-group">
                                <label for="distance_to_metro">Хвилин до метро (0 - немає метро)</label>
                                <div class="input-group spinner">
                                    <input type="text" class="form-control" id="distance_to_metro" value="0">
                                    <div class="input-group-btn-vertical">
                                        <button class="btn btn-default" type="button"><i class="fa fa-caret-up"></i></button>
                                        <button class="btn btn-default" type="button"><i class="fa fa-caret-down"></i></button>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="address">Адреса</label>
                                    <input type="text" class="form-control" id="address" placeholder="Адреса">
                                </div>

                                <div class="form-group">
                                    <label for="animals_allowed">Можна тримати домашніх улюбленців?</label><br />
                                    <div class="btn-group" role="group">
                                        <button type="button" class="btn btn-default">Так</button>
                                        <button type="button" class="btn btn-default">Ні</button>
                                    </div>
                                </div>



                                <br /><button type="submit" class="btn btn-default">Пошук</button>
            </form>
        </div>
    </div>














</div> <!-- /container -->

<jsp:include page="footer.jsp"/>
</body>
</html>

