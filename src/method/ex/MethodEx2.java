package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage(3);
        System.out.println();
        printMessage(5);
        System.out.println();
        printMessage(7);
    }

    public static void printMessage(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Hello, world!");
        }
    }
}