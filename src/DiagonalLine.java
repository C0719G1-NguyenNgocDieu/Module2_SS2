import java.util.Scanner;

public class DiagonalLine {
    public static int[][] ArrayCreat(int[][] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array " + i + " " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int Add_Diagonal(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        size = scanner.nextInt();

        int[][] array = new int[size][size];
        ArrayCreat(array);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int result = Add_Diagonal(array);
        System.out.println("Result: " + result);
    }

}
