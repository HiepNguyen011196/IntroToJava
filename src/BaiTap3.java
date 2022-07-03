import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dollar");
        usd = scanner.nextDouble();
        double result = usd * 23000;
        System.out.println(usd);
    }
}
