import java.util.Scanner;

public class StudentPassing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter array size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Enter array size again");
            }
        } while (size > 30);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value index " + i);
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("List of mask");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of student passing the exam is " + count);
    }
}
