package lesson2_3;

public class Main {
    public static void main(String[] args) {
        Tovar[] productsArray = new Tovar[5];

        productsArray[0] = new Tovar("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, "Забронирован");
        productsArray[1] = new Tovar("Apple iPhone 15", "15.09.2023", "Apple Inc.", "USA", 79999, "Свободен");
        productsArray[2] = new Tovar("LG OLED TV", "10.05.2024", "LG Electronics", "South Korea", 120000, "Забронирован");
        productsArray[3] = new Tovar("Dell XPS 13", "20.07.2023", "Dell Inc.", "USA", 150000, "Свободен");
        productsArray[4] = new Tovar("Sony PlayStation 5", "12.11.2020", "Sony", "Japan", 49999, "Забронирован");

        for (Tovar product : productsArray) {
            product.printInfo();
            System.out.println();
        }
    }
}