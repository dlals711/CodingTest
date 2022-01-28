public class MakeDemicalNum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(isDemical(nums[i] + nums[j] + nums[k])) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;

    }

    public static boolean isDemical(int num) {
        int count = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i++) {
            if(num % i == 0) {
                count += 1;
            }
        }
        return count == 1;
    }
}
