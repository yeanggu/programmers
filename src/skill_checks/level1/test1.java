package skill_checks.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }

    static void solution(String s) {
        String answer;

        String[] strArr = s.split("");

        if (strArr.length % 2 == 1) {
            answer = strArr[(strArr.length) / 2];
        } else {
            answer = strArr[(strArr.length / 2) - 1] + strArr[(strArr.length / 2)];
        }

        System.out.println(answer);
    }

}
