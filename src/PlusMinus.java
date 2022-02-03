public class PlusMinus {
    /**
     * 정수들의 절댓값을 담은 배열 absolutes
     * 이 정수들의 부호를 담은 배열 signs
     * absolutes의 길이는 1 이상 1,000 이하
     * absolutes의 모든 수는 각각 1 이상 1,000 이하
     * signs의 길이는 absolutes의 길이와 같다.
     * signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미
     */
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};

        System.out.println(solution(absolutes, signs));
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] reserve = new int[absolutes.length];

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                reserve[i] = absolutes[i];
            } else {
                reserve[i] = absolutes[i] * (-1);
            }
        }

        for(int i = 0; i < reserve.length; i++) {
            answer += reserve[i];
        }

        return answer;
    }
}
