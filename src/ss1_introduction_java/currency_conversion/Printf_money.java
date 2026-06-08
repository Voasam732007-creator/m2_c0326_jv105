package ss1_introduction_java.currency_conversion;

import java.util.Scanner;

public class Printf_money {
    public static void main ( String[] arga) {
        double vnd = 23000;
        double usd;
        Scanner ac = new Scanner(System.in);
        System.out.printf("Mời nhập số tiền USD: ");
        usd = ac.nextDouble();
        double quydoi= usd * 23000;
        System.out.print("Giá trị VND: "+ quydoi);

    }

}
