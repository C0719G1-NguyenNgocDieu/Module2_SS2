import java.util.Scanner;

public class ValueAdd {
    public static void main(String[] args) {
        int index = 0;
        int value = 0;
        int[] array = {1, 2, 7, 4, 2, 4, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index add:");
        index = sc.nextInt();
        System.out.println("Enter value add:");
        value = sc.nextInt();
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

