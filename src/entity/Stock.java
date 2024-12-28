package entity;

public class Stock {
    private String id;
    private String dateMouvement;
    private int entree;
    private int sortie;
    private int medicamentId;

    public Stock() {}

    public Stock(String id, String dateMouvement, int entree, int sortie, int medicamentId) {
        this.id = id;
        this.dateMouvement = dateMouvement;
        this.entree = entree;
        this.sortie = sortie;
        this.medicamentId = medicamentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateMouvement() {
        return dateMouvement;
    }

    public void setDateMouvement(String dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public int getEntree() {
        return entree;
    }

    public void setEntree(int entree) {
        this.entree = entree;
    }

    public int getSortie() {
        return sortie;
    }

    public void setSortie(int sortie) {
        this.sortie = sortie;
    }

    public int getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(int medicamentId) {
        this.medicamentId = medicamentId;
    }
}

