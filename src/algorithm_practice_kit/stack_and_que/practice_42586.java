package algorithm_practice_kit.stack_and_que;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class practice_42586 {
    // 기능개발

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = {93, 30, 55};
        int[] arr2 = {1, 30, 5};

        solution(arr, arr2);
    }

    static int[] solution(int[] arr, int[] arr2) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0 ; i < arr.length; i++) {
            int day = (100 - arr[i]) / arr2[i];
            if ((100 - arr[i]) % arr2[i] != 0) {
                day++;
            }
            queue.add(day);
        }

        int count = 1;
        int now = queue.poll();
        ArrayList<Integer> daysCount = new ArrayList<>();

        while(!queue.isEmpty()){
            int next = queue.poll();
            if (now >= next) {
                count++;
            } else {
                daysCount.add(count);
                now = next;
                count = 1;
            }
        }
        daysCount.add(count);

        int[] answer = new int[daysCount.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = daysCount.get(i);
        }

        return answer;
    }
}
