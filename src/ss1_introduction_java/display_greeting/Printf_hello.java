package ss1_introduction_java.display_greeting;

import java.util.Scanner;

public class Printf_hello {
    static void main() {
        System.out.printf("Nhập tên");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("hello :"+name);

    }
}
