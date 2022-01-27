import java.util.ArrayList;

public class MathGiveUp {
    /**
     * 1번 수포자가 찍는 방식 : 1 2 3 4 5  1 2 3 4 5
     * 2번 수포자가 찍는 방식 : 2 1 2 3 2 4 2 5 2 1 2 3 2 4 2 5
     * 3번 수포자가 찍는 방식 : 3 3 1 1 2 2 4 4 5 5 3 3 1 1 2 2 4 4 5 5
     */
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(solution(answers));
    }

    private static int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%one.length]) {
                score[0]++;
            }

            if(answers[i] == two[i%two.length]) {
                score[1]++;
            }

            if(answers[i] == three[i%three.length]) {
                score[2]++;
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        ArrayList<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
