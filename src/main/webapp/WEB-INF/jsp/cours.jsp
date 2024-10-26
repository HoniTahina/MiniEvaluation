<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 04/10/2024
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<div>
    <jsp:include page="./welcome.jsp" />
    <div class="container mt-5">
        <div class="row">
            <div class="col-sm-6">
                <div class="card border border-info shadow-0 mb-3" >
                    <div class="card-header">Liste des Cours</div>
                    <div class="card-body">
                        <table class="table table-striped table-hover">
                            <thead>
                            <tr>
                                <th>Id</th>
                                <th>Matières</th>
                                <th>Prof</th>
                                <th>Classe</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${coursList}" var="cours">
                                <tr>
                                    <td>${cours.id}</td>
                                    <td>${cours.matiere}</td>
                                    <td>${cours.prof}</td>
                                    <td>${cours.classe}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="card border border-info shadow-0 mb-3">
                    <div class="card-header">Ajout d'un cours</div>
                    <div class="card-body">
                        <form action="cours" method="post">
                            <div class="mb-3">
                                <label for="matiere" class="form-label">Matière</label>
                                <input type="text" name="matiere" class="form-control" id="matiere">
                            </div>
                            <div class="mb-3">
                                <label for="prof" class="form-label">Professeur</label>
                                <input type="text" name="prof" class="form-control" id="prof">
                            </div>
                            <div class="mb-3">
                                <label for="classe" class="form-label">Classe</label>
                                <input type="text" name="classe" class="form-control" id="classe">
                            </div>
                            <button type="submit" class="btn btn-primary">Ajouter Classe</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
