import java.util.ArrayList;
import java.util.List;

public class BoardReport {
    public static void main(String[] args) {
        /**
         * 게시판 불량 이용자 신고 처리결과를 메일로 발송
         * 각 유저는 한 번에 한명의 유저 신고
         * 한 유저를 여러 번 신고 가능, 동일한 유저에 대한 신고 횟수는 1회로 처리
         * k번 이상 신고된 유저는 게시판 이용 정지
         * 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송
         * 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지 메일 발송
         */

        String[] id_list = new String[] {
                "muzi", "frodo", "apeach", "neo"
        };

        String[] report = new String[] {
                "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"
        };

        int k = 2;

        solution(id_list, report, k);

    }

    private static void solution(String[] id_list, String[] report, int k) {
        // key: 신고당한 사람 value : 몇명한테 당했는지
        Map<String,>
    }
}
