<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pharmacie - Gestion</title>
    
    <link href="assets/styles.css" rel="stylesheet">
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Header -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-menu" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Pharmacie</a>
            </div>

            <!-- Menu -->
            <div class="collapse navbar-collapse" id="navbar-menu">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">Accueil</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Insertion/Recherche <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="insertlaboratoire.jsp">Insertion Laboratoire</a></li>
                            <li><a href="insertionTypeProduit.jsp">Insertion Type Produit</a></li>
                            <li><a href="insertionMaladie.jsp">Insertion Maladie</a></li>
                            <li><a href="recherche.jsp">Recherche</a></li>
                        </ul>
                    </li>
                    <li><a href="#">À propos</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Sidebar -->
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
                <div class="list-group">
                    <a href="laboratoire.jsp" class="list-group-item">CRUD Laboratoires</a>
                    <a href="#" class="list-group-item">CRUD Produits</a>
                    <a href="#" class="list-group-item">CRUD Maladies</a>
                </div>
            </div>
            <div class="col-md-9">
                <!-- Main Content -->
                <div class="jumbotron">
                    <h1>Bienvenue à E-Pharmacie</h1>
                    <p>Utilisez le menu en haut pour insérer des données ou effectuer des recherches.</p>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Pharmacie. Tous droits réservés.</p>
    </footer>

    <!-- jQuery -->
    <script src="assets/js/jquery.min.js"></script>

    <!-- Bootstrap JS -->
    <script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
