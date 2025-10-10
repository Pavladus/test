package les_6;

public class l_6 {

    public static void printNumberSign(int num) {
        if (num >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void main(String[] args) {
        printNumberSign(10);
        printNumberSign(-5);
        printNumberSign(0);
    }
}
