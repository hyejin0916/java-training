package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 100;

        // while
        while(i <= max) { // count <= 10
            sum += i;
            i++;
        }
        System.out.println("max= " + max);
        System.out.println(sum);
    }
}
