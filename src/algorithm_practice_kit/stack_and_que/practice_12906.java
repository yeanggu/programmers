package algorithm_practice_kit.stack_and_que;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class practice_12906 {
    // 같은 숫자는 싫어

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = {1,1,3,3,0,1,1};

        solution(arr);
    }

    static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for (int i = 1 ; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = answer.length-1 ; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
