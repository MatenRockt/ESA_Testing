package testing.esa;

import java.util.Scanner;

import testing.ShoppingList;

public class Main {
   public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Artikel ein:");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Geben Sie einen Artikel ein:");
            String item = scanner.nextLine();
            shoppingList.addItem(item);
        }

        System.out.println("Einkaufsliste:");
        for (String item : shoppingList.getItems()) {
            System.out.println(item);
        }

        scanner.close();
    }

}