import java.util.ArrayList;
import java.util.List;

public class AddNoNumber {
    /**
     * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers
     * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(String.valueOf(solution(numbers)));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int[] sum = {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < sum.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(sum[i] == numbers[j]) {
                    sum[i] -= numbers[j];
                }
            }
            System.out.println(sum[i]);
            answer += sum[i];
        }
        return answer;
    }
}
