package entity;

public class MedicamentMaladieNonCompatible {
    private int id;
    private int medicamenId;
    private int maladieId;

    public MedicamentMaladieNonCompatible() {}

    public MedicamentMaladieNonCompatible(int id, int medicamenId, int maladieId) {
        this.id = id;
        this.medicamenId = medicamenId;
        this.maladieId = maladieId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicamenId() {
        return medicamenId;
    }

    public void setMedicamenId(int medicamenId) {
        this.medicamenId = medicamenId;
    }

    public int getMaladieId() {
        return maladieId;
    }

    public void setMaladieId(int maladieId) {
        this.maladieId = maladieId;
    }
}

