package ss1_introduction.ReadNumber;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ones = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        String[] teens = {
                "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {
            System.out.println(ones[number]);
        } else if (number < 20) {
            System.out.println(teens[number - 10]);
        } else if (number < 100) {
            int ten = number / 10;
            int one = number % 10;

            System.out.println(
                    tens[ten] + (one != 0 ? " " + ones[one] : "")
            );
        } else {
            int hundred = number / 100;
            int remain = number % 100;

            String result = ones[hundred] + " hundred";

            if (remain != 0) {
                result += " and ";

                if (remain < 10) {
                    result += ones[remain];
                } else if (remain < 20) {
                    result += teens[remain - 10];
                } else {
                    int ten = remain / 10;
                    int one = remain % 10;

                    result += tens[ten];

                    if (one != 0) {
                        result += " " + ones[one];
                    }
                }
            }

            System.out.println(result);
        }
    }
}
