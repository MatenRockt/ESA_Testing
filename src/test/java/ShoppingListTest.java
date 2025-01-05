
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testing.ShoppingList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    private ShoppingList shoppingList;


     // Initialisiert eine neue ShoppingList Instanz vor jedem Test
    @BeforeEach
    void setUp() {
        shoppingList = new ShoppingList();
    }

    // Testet das Hinzufügen eines gültigen Items
    @Test
    void testAddItem() {
        shoppingList.addItem("Milch");
        List<String> items = shoppingList.getItems();
        assertTrue(items.contains("Milch"), "Die Einkaufsliste sollte 'Milch' enthalten.");
    }

    @Test
    void testAddInvalidItem() {
         // Testet das Hinzufügen eines ungültigen Items (leerer String)
        assertThrows(IllegalArgumentException.class, () -> shoppingList.addItem(""),
                "Das Hinzufügen eines leeren Items sollte eine Ausnahme auslösen.");
         // Testet das Hinzufügen eines ungültigen Items (null)
        assertThrows(IllegalArgumentException.class, () -> shoppingList.addItem(null),
                "Das Hinzufügen eines null-Items sollte eine Ausnahme auslösen.");
    }

    @Test
    void testRemoveItem() {
        // Testet das Entfernen eines vorhandenen Items
        shoppingList.addItem("Eier");
        shoppingList.removeItem("Eier");
        List<String> items = shoppingList.getItems();
        assertFalse(items.contains("Eier"), "Die Einkaufsliste sollte 'Eier' nicht mehr enthalten.");
    }

    @Test
    void testRemoveItemNotInList() {
        // TEstet das Entfernen eines nicht vorhandenen Items
        assertThrows(IllegalArgumentException.class, () -> shoppingList.removeItem("Brot"),
                "Das Entfernen eines nicht vorhandenen Items sollte eine Ausnahme auslösen.");
    }

    @Test
    void testGetItems() {
        // Testet die Ausgabe von Items
        shoppingList.addItem("Banane");
        shoppingList.addItem("Apfel");
        List<String> items = shoppingList.getItems();
        assertEquals(2, items.size(), "Die Einkaufsliste sollte 2 Items enthalten.");
        assertTrue(items.contains("Banane"), "Die Einkaufsliste sollte 'Banane' enthalten.");
        assertTrue(items.contains("Apfel"), "Die Einkaufsliste sollte 'Apfel' enthalten.");
    }
}
