package servlet;

import dao.DbConnect;
import entity.Laboratoire;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Traitement")
public class Traitement extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            if ("listLaboratoires".equals(action)) {
                listLaboratoires(request, response);
            } else {
                response.sendRedirect("laboratoire.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Erreur : " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            switch (action) {
                case "saveLaboratoire":
                    saveLaboratoire(request, response);
                    break;
                case "deleteLaboratoire":
                    deleteLaboratoire(request, response);
                    break;
                default:
                    response.sendRedirect("laboratoire.jsp");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Erreur : " + e.getMessage());
        }
    }

    private void saveLaboratoire(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = request.getParameter("id") == null || request.getParameter("id").isEmpty()
                 ? 0 : Integer.parseInt(request.getParameter("id"));
        String label = request.getParameter("label");

        try (Connection con = DbConnect.getConnection()) {
            if (id == 0) {
                // Insertion
                String sql = "INSERT INTO laboratoire (label) VALUES (?)";
                try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                    pstmt.setString(1, label);
                    pstmt.executeUpdate();
                }
            } else {
                // Mise à jour
                String sql = "UPDATE laboratoire SET label = ? WHERE id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                    pstmt.setString(1, label);
                    pstmt.setInt(2, id);
                    pstmt.executeUpdate();
                }
            }
        }
        response.sendRedirect("laboratoire.jsp");
    }

    private void deleteLaboratoire(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));

        try (Connection con = DbConnect.getConnection()) {
            String sql = "DELETE FROM laboratoire WHERE id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
            }
        }
        response.sendRedirect("laboratoire.jsp");
    }

    private void listLaboratoires(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Laboratoire> laboratoires = new ArrayList<>();

        try (Connection con = DbConnect.getConnection()) {
            String sql = "SELECT * FROM laboratoire";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        laboratoires.add(new Laboratoire(rs.getInt("id"), rs.getString("label")));
                    }
                }
            }
        }

        request.setAttribute("laboratoires", laboratoires);
        request.getRequestDispatcher("laboratoire.jsp").forward(request, response);
    }
}
