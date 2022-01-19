public class Lotto {
    public static void main(String[] args) {
        /**
         * 로또 1등 : 6개 번호 모두 일치
         * 로또 2등 : 5개 번호 일치
         * 로또 3등 : 4개 번호 일치
         * 로또 4등 : 3개 번호 일치
         * 로또 5등 : 2개 번호 일치
         * 6(낙첨) : 그 외
         *
         * 로또 산 민우는 당첨 발표일 기다림
         * 민우의 동생이 로또에 낙서하여 일부 번호를 지움
         * 당첨 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알고 싶음
         *
         * 민우가 구매한 로또 번호를 담은 배열 lottos
         * 당첨 번호를 담은 배열 win_nums가 매개변수
         * 이때 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return
         *
         * 제한사항
         * lottos는 길이 6인 정수 배열입니다.
         * lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
         * 0은 알아볼 수 없는 숫자를 의미합니다.
         * 0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
         * lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
         * win_nums은 길이 6인 정수 배열입니다.
         * win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
         * win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
         * win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다
         */
        int lottos[] = new int[6];
        int win_nums[] = new int[6];

        // 로또 당첨 번호 생성
        for(int i = 0; i < 6; i++) {
            win_nums[i] = (int)(Math.random() * 45) + 1;

            // 중복 제거
            for(int j = 0; j < i; j++) {
                if (win_nums[i] == win_nums[j]) {
                    i--;
                    break;
                }
            }
        }

        // 로또 구입 번호 생성
        for(int i = 0; i < 6; i++) {
            lottos[i] = (int)(Math.random() * 46);

            // 중복 제거
            for(int j = 0; j < i; j++) {
                if(lottos[i] != 0) {
                    if (lottos[i] == lottos[j]) {
                        i--;
                        break;
                    }
                }
            }
        }

        // 최고 순위, 최저 순위
        int maxNum = 0; // 맞춘 개수
        int minNum = 0;
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                maxNum++;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        maxNum++;
                        minNum++;
                    }
                }
            }
        }

        System.out.print("민우가 산 로또 번호 : ");
        for(int i = 0; i < 6; i++) {
            System.out.print(lottos[i] + " ");
        }

        System.out.println();
        System.out.print("당첨 번호 : ");

        for(int i = 0; i < 6; i++) {
            System.out.print(win_nums[i] + " ");
        }
        System.out.println();
        System.out.print("최고 순위 번호 : " + maxNum + "개 번호 일치, ");
        if(maxNum > 1) {
            System.out.println(7 - maxNum + "등");
        } else {
            System.out.println("낙첨");
        }
        System.out.print("최저 순위 번호 : " + minNum + "개 번호 일치, ");
        if(minNum > 1) {
            System.out.println(7 - minNum + "등");
        } else {
            System.out.println("낙첨");
        }
    }

}
