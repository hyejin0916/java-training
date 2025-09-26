package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // double이 int보다 큰 범위이기 때문에 컴파일 오류 발생 X -> 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
