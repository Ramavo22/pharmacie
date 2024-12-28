package entity;

public class Produit {
    private int id;
    private String label;
    private int enStock;
    private int typeProduitId;
    private int laboId;

    public Produit() {}

    public Produit(int id, String label, int enStock, int typeProduitId, int laboId) {
        this.id = id;
        this.label = label;
        this.enStock = enStock;
        this.typeProduitId = typeProduitId;
        this.laboId = laboId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getEnStock() {
        return enStock;
    }

    public void setEnStock(int enStock) {
        this.enStock = enStock;
    }

    public int getTypeProduitId() {
        return typeProduitId;
    }

    public void setTypeProduitId(int typeProduitId) {
        this.typeProduitId = typeProduitId;
    }

    public int getLaboId() {
        return laboId;
    }

    public void setLaboId(int laboId) {
        this.laboId = laboId;
    }
}
 
