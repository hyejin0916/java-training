package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();;
        printFooter();
    }

    public static void printHeader() {
        System.out.println("=프로그램을 시작합니다=");
//        return; // 반환 타입이 void라면 return 생략 가능
    }

    public static void printFooter() {
        System.out.println("=프로그램을 종료합니다=");
//        return;
    }
}
