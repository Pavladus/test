public class Sobaka extends Zhivotnoe {
    private static int countSobak = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Sobaka(String name) {
        super(name);
        countSobak++;
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
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getCountSobak() {
        return countSobak;
    }
}
