import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        usd = sc.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Result: " + exchange);
    }
}
