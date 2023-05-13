package skill_checks.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }

    static void solution(String s) {
        String[] strArr = s.split("");
        int[] answer = new int[strArr.length];

        answer[0] = -1;

        for (int i = 1 ; i <= strArr.length - 1 ; i++) {
            for (int j = i-1 ; j >= 0 ; j-- ) {
                if (strArr[i].equals(strArr[j])) {
                    answer[i] = i-j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }

}
