package lesson2_4;

public class Main {
    public static void main(String[] args) {
        Kot[] kots = {
                new Kot("Мурзик"),
                new Kot("Барсик"),
                new Kot("Васька"),
                new Kot("Пушок"),
                new Kot("Рыжик")
        };

        Miska miska = new Miska(30);

        for (Kot kot : kots) {
            kot.eat(miska, 10);
        }

        for (Kot kot : kots) {
            System.out.println(kot.name + " сытость: " + kot.isSatiety());
        }

        System.out.println("Остаток еды в миске: " + miska.getFoodAmount());

        System.out.println("Создано животных: " + Zhivotnoe.getCountAllAnimals());
        System.out.println("Создано собак: " + Sobaka.getCountSobak());
        System.out.println("Создано котов: " + Kot.getCountKotov());
    }
}






}
