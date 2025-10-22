public class Kot extends Zhivotnoe {
    private static int countKotov = 0;
    private final int maxRunDistance = 200;
    private final int maxSwimDistance = 0;
    private boolean satiety = false;

    public Kot(String name) {
        super(name);
        countKotov++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Miska miska, int amount) {
        if (!satiety && miska.getFoodAmount() >= amount) {
            miska.decreaseFood(amount);
            satiety = true;
        }
    }

    public static int getCountKotov() {
        return countKotov;
    }
}

