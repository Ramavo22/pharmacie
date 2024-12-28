package entity;

import java.sql.Timestamp;

public class Vente {
    private int id;
    private Timestamp dateVente;
    private String name;

    public Vente() {}

    public Vente(int id, Timestamp dateVente, String name) {
        this.id = id;
        this.dateVente = dateVente;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateVente() {
        return dateVente;
    }

    public void setDateVente(Timestamp dateVente) {
        this.dateVente = dateVente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

