import java.util.Scanner;

public class Column_Sum {
    public static int[][] ArrayCreat(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array " + i + " " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int columnSumArray(int[][] array, int column) {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j][column];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;

        System.out.println("Enter row: ");
        row = scanner.nextInt();
        System.out.println("Enter column: ");
        column = scanner.nextInt();

        int[][] array = ArrayCreat(row, column);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = columnSumArray(array, 1);
        System.out.println("Column Sum: " + sum);
    }
}
