import java.util.HashSet;

public class SchoolExerciseUniform {
    /**
     * 학생들의 번호는 체격 순
     * 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음
     * 전체 학생수 n
     * 체육복을 도난당한 학생들의 번호가 담긴 배열 lost
     * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve
     * 주어졌을 때 최댓값 return
     *
     * 전체 학생의 수는 2명 이상 30명 이하
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하 중복되는 번호x
     * 여벌의 체육복을 가져온 학생의 수는 1명이상 n명 이하 중복되는 번호x
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있음
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있음.
     * 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른
     * 학생에게는 체육복을 빌려줄 수 없음.
     */
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};

        System.out.println(solution(n, lost, reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        System.out.println(answer);
        HashSet<Integer> ko = new HashSet<Integer>();

        for(int k : reserve) {
            ko.add(k);
        }

        for(int i = 0; i < lost.length; i++) {
            if(ko.contains(lost[i])) {
                answer++;
                ko.remove(lost[i]);
                lost[i] = -1;
            }
        }

        for(int i = 0; i < lost.length; i++) {
            if(ko.contains(lost[i]-1)) {
                answer++;
                ko.remove(lost[i]-1);
            } else if(ko.contains(lost[i]+1)) {
                answer++;
                ko.remove(lost[i]+1);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
