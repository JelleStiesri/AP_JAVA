import java.util.Scanner;

public class TestClass {
}
class testing {
    public static void main(String[ ] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        str1 = "Test1";
        str2 = "Test2";
        int num1 = 4, num2 =  3;
        double num3 = 3.5;
        int som = num1 + num2;
        //String inpoet = scan.nextLine();

        if(num1 != num2) {
            System.out.println("Foutje");
        }else {
            System.out.println("Helemaal goed");
        }
        System.out.println(str2);
        System.out.println(num1);
    }
}
