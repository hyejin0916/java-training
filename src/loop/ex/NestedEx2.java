package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // println(): 줄바꿈, print(): 줄바꿈 X
            }
            System.out.println();
        }
    }
}
