package entity;

import java.util.ArrayList;

public class TypeProduit {
    int id;
    String label;

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

    public TypeProduit(int id, String label) {
        setId(id);
        setLabel(label);
    }


    public TypeProduit() {
    }

    public static ArrayList<TypeProduit> getAll() {
        ArrayList<TypeProduit> typeProduits = new ArrayList<>();
        typeProduits.add(new TypeProduit(1, "Fruit"));
        typeProduits.add(new TypeProduit(2, "Légume"));
        typeProduits.add(new TypeProduit(3, "Viande"));
        return typeProduits;
    }



    
}
