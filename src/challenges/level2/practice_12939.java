package challenges.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class practice_12939 {
    //최댓값과 최솟값

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }

    static String solution(String s) {
        String[] arr = s.split(" ");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numbers);

        return numbers[0] + " " + numbers[numbers.length-1];

    }




}
