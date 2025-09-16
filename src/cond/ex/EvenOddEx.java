package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 105;
        String eventOdd = (x % 2 == 1) ? "홀수" : "짝수";

        System.out.println(x + "는 " + eventOdd);
    }
}
