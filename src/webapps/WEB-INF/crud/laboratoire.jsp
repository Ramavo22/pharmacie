<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
 java.util.List<entity.Laboratoire> laboratoires = (java.util.List<entity.Laboratoire>) session.getAttribute("laboratoires");
 %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD Laboratoire</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Gestion des Laboratoires</h1>
        <a href="ajouterLaboratoire.jsp" class="btn btn-primary my-3">Ajouter un Laboratoire</a>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Label</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Exemple de récupération des données (remplacez par vos DAO)
                    if (laboratoires != null) {
                        for (entity.Laboratoire labo : laboratoires) {
                %>
                <tr>
                    <td><%= labo.getId() %></td>
                    <td><%= labo.getLabel() %></td>
                    <td>
                        <a href="modifierLaboratoire.jsp?id=<%= labo.getId() %>" class="btn btn-warning btn-sm">Modifier</a>
                        <a href="supprimerLaboratoire?id=<%= labo.getId() %>" class="btn btn-danger btn-sm">Supprimer</a>
                    </td>
                </tr>
                <% }} else { %>
                <tr>
                    <td colspan="3">Aucun laboratoire trouvé.</td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>
