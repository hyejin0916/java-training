package method;

public class OverLoading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));
    }

    /* public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    } */
    // 1번 호출에서 해당 메서드가 없어도 double 타입의 add를 호출할 수 있음

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
