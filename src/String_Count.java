import java.util.Scanner;

public class String_Count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char a='n';
        String name="nguyen ngoc dieu";
        int count=0;
        for (int i=0;i<name.length();i++){
            char result=name.charAt(i);
            if (a==result){
                count++;
            }
        }
        System.out.println("Result: " + count);
    }
}