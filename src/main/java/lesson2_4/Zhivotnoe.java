package lesson2_4;

public class Zhivotnoe {
    protected String name;
    protected static int countAllAnimals = 0;

    public Zhivotnoe(String name) {
        this.name = name;
        countAllAnimals++;
    }

    public void run(int distance) {}

    public void swim(int distance) {}

    public static int getCountAllAnimals() {
        return countAllAnimals;
    }
}


