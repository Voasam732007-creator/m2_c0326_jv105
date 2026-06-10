package ss1_introduction.Currency_conversion;

import java.util.Scanner;

public class Currency_conversion {
    public static void main (String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.printf("Giá trị USD: "+ quydoi);
    }
}
