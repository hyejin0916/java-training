package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 2;

        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액 없음");
        } else {
            System.out.println("환전할 금액: " + dollar * 1300 + "원");
        }
    }
}
