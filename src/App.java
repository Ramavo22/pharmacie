import java.util.List;

import entity.TypeProduit;

public class App {
    public static void main(String[] args) {
        List<TypeProduit> typeProduits = TypeProduit.getAll();
        for (TypeProduit typeProduit : typeProduits) {
            System.out.println(typeProduit.getId() + " " + typeProduit.getLabel());
        }
    }
}
