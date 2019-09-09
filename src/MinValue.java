public class MinValue {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 56, 7, 4, 6, 8, 34};
        int index = minValue(array);
        System.out.println("Minium value of array index:" + index);
    }
}
