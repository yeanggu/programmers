package algorithm_practice_kit.stack_and_que;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class practice_42587 {
    // 프로세스

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = {2, 1, 3, 2};
        int location = 2;

        solution(arr, location);
    }

    static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer prior : priorities) {
            pq.add(prior);
        }

        int answer = 0;

        while(!pq.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }

        return -1;
    }
}
