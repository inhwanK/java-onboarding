package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] result = new int[9];

        while (money != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (money >= arr[i]) {
                    money -= arr[i];
                    result[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            answer.add(result[i]);
        }

        return answer;
    }
}
