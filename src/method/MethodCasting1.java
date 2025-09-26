package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // 컴파일 오류(int 타입에 double을 넣으려고 해서)
        printNumber((int) number); // int로 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
