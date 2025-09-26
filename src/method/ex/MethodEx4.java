package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();

            if (option == 1) {
                balance = deposit(balance, scanner);
            } else if (option == 2) {
                balance = withdraw(balance, scanner);
            } else if (option == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 접근입니다.");
                break;
            }
        }
    }

    public static int deposit(int money, Scanner scanner) {
        System.out.print("입금액을 입력하세요: ");
        int amount = scanner.nextInt();
        money += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + money + "원");
        return money;
    }

    public static int withdraw(int balance, Scanner scanner) {
        System.out.print("출금액을 입력하세요: ");
        int amount = scanner.nextInt();
        if (balance < amount) {
            System.out.println(amount + "를 출금하려고 했으나 잔액이 부족합니다.");
            return balance;
        }
        balance -= amount;
        System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
}
