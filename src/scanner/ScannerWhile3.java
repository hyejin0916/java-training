package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 프로그램은 종료됩니다.");
        while(true) {
            System.out.print("더할 숫자을 입력하세요: ");
            int i = input.nextInt();

            if (i == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += i;
        }
        System.out.println("숫자의 합은 " + sum + "입니다.");
    }
}
