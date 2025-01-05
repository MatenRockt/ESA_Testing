package testing;

import java.util.ArrayList;
import java.util.List;


public class ShoppingList {
    private List<String> items;

    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    // Fügt ein Item zur Einkaufsliste hinzu
    public void addItem(String item) {
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Das Item darf nicht leer oder null sein.");
        }
        items.add(item);
    }

    // Entfernt ein Item von der Einkaufsliste
    public void removeItem(String item) {
        if (!items.contains(item)) {
            throw new IllegalArgumentException("Das Item '" + item + "' ist nicht in der Liste.");
        }
        items.remove(item);
    }

    // Gibt alle Items der Einkaufsliste zurück
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    // Verdoppelt alle Items in der Einkaufsliste
    public void verdoppeleItems() {
        
    }
}
