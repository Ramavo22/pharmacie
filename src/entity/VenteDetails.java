package entity;

public class VenteDetails {
    private int id;
    private int qte;
    private int produitId;
    private int venteId;

    public VenteDetails() {}

    public VenteDetails(int id, int qte, int produitId, int venteId) {
        this.id = id;
        this.qte = qte;
        this.produitId = produitId;
        this.venteId = venteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getVenteId() {
        return venteId;
    }

    public void setVenteId(int venteId) {
        this.venteId = venteId;
    }
}

