package lesson_2.les_5;

public class l_5 {

    public static boolean checkSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println(checkSum(5, 7));
        System.out.println(checkSum(10, 15));
        System.out.println(checkSum(3, 4));
        System.out.println(checkSum(8, 9));

    }
}
