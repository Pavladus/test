package les_14;

public class l_14 {
    public static void main(String[] args) {
        int[] array = createArray(5, 42);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

