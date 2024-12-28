package entity;

public class MedicamentMaladie {
    private String id;
    private int maladieId;
    private int medicamentId;

    public MedicamentMaladie() {}

    public MedicamentMaladie(String id, int maladieId, int medicamentId) {
        this.id = id;
        this.maladieId = maladieId;
        this.medicamentId = medicamentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaladieId() {
        return maladieId;
    }

    public void setMaladieId(int maladieId) {
        this.maladieId = maladieId;
    }

    public int getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(int medicamentId) {
        this.medicamentId = medicamentId;
    }
}
