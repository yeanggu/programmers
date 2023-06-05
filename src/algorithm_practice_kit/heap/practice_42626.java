package algorithm_practice_kit.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class practice_42626 {
    //더 맵게
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(arr, K));
    }

    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int aScoville : scoville) {
            heap.add(aScoville);
        }

        while (heap.peek() < K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            heap.add(a + (b * 2));
            answer ++;
        }
        return answer;

    }
}
