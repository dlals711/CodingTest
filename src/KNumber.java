import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNumber {
    /**
     * array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구함
     */
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        System.out.println(solution(array, commands).toString());
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] strArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(strArr);

            answer[i] = strArr[commands[i][2]-1];
        }

        return answer;
    }
}
