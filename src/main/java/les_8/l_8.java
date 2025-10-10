package les_8;

public class l_8 {

    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printStringMultipleTimes("Привет!", 3);
        printStringMultipleTimes("Java", 5);
    }
}
