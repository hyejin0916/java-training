package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("5개의 정수를 입력하세요.");
        while (i < numbers.length) {
            int number = scanner.nextInt();
            numbers[i] = number;
            i++;
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]);
            if (j != numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
