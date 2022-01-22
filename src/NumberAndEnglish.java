import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberAndEnglish {
    public static void main(String[] args) {
        /**
         * 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 원래 숫자를 찾는 게임
         * 1478 -> "one4seveneight"
         * 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바꾸지 않고 그대로인 문자열 s
         * s가 의미하는 원래숫자를 return
         */
        String number = "one4seveneight";

        System.out.println(solution(number));
    }

    private static int solution(String number) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            number = number.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(number);
    }
}
