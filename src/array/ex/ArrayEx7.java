package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + "점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int k = 0; k < scores.length; k++) {
            int total = 0;
            double average = 0;
            for (int score: scores[k]) {
                total += score;
            }
            average = (double) total / 3;
            System.out.println((k + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
