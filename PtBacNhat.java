import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        if (a!=0){
            double result = (c-b)/a;
            System.out.println("Result is: " + result);
        }else if (b!=0){
            System.out.println("No result");
        }else {
            System.out.println("Result is all x");
        }
    }
}

