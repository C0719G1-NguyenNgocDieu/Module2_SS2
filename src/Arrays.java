import java.util.Scanner;

public class Arrays {

    public static int[][] ArrayCreat(int[][] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value of element " + i + " " + j);
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static int Max(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int row, column, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        row = sc.nextInt();
        System.out.println("Enter column: ");
        column = sc.nextInt();

        int[][] array = new int[row][column];
        ArrayCreat(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        max = Max(array);
        System.out.println("Max in array is: " + max);
    }
}
