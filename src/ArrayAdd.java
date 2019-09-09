public class ArrayAdd {
    public static int[] AdditionArray(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] array3 = new int[size];
        int temp = array1.length;

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++, temp++) {
            array3[temp] = array2[j];
        }
        return array3;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 23, 3, 4, 5, 6};
        int[] arr2 = {6, 5, 3, 7, 44, 5, 8, 4, 10};
        int[] arr3 = AdditionArray(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
