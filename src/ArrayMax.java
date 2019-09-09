import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("mang qua lon");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter index " + i);
            array[i] = sc.nextInt();
        }

        System.out.println("Show Array");
        for (int x : array) {
            System.out.print(x + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index += 1;
            }
        }
        System.out.println("gia tri lon nhat " + max + " tai vi tri: " + index);
    }
}
