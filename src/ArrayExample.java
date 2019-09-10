import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatArray() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatArray();

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhap chi so mot phan tu bat ky: ");
        int x = sc.nextInt();
        try {
            System.out.println("Gia tri cua phan tu thu " + x + " la: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.printf("Chi so vuot qua phan tu mang");
        }
    }
}
