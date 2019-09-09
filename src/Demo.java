import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {12, 3, 4, 3, 2, 5, 2, 23, 45, 6, 34, 3,0,0};
        System.out.println("Enter value delete: ");
        int value = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
