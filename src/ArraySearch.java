import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"lan", "cuc", "trang", "ngan", "thu", "thao"};
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.equals(names[i])) {
                System.out.println("Vi tri cua " + name + " la: " + (i+1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Khong tim thay "+name+" trong list");
        }
    }
}
