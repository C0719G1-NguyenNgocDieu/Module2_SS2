import java.util.Scanner;

public class ArrayConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] array;
        int temp;

        do {
            System.out.println("Enter Array size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Array too large. Enter array size");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array index: " + i);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
