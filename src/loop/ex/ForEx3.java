package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int i, sum, max;

        for (i = 1, sum = 0, max = 50; i <= max; i++) {
            sum += i;
        }
        System.out.println("max= " + max);
        System.out.println(sum);

        // 정답
//        int max = 100;
//        int sum = 0;
//        for (int i = 1; i <= max; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
    }
}
