package lesson2_3;

public class Park {
    class Attraction {
        String name;
        String workingHours;
        double price;

        Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction attraction1 = park.new Attraction("Карусель", "09:00 - 21:00", 150.0);
        Attraction attraction2 = park.new Attraction("Американские горки", "10:00 - 22:00", 300.0);

        attraction1.printInfo();
        System.out.println();
        attraction2.printInfo();
    }
}

