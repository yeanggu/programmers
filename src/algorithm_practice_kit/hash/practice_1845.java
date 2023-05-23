package algorithm_practice_kit.hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class practice_1845 {
    // 폰켓몬

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(parseInt(input)));
    }

    static int[] parseInt(String s) {
        String[] strings = s.split(",");
        int[] nums = new int[strings.length];
        for (int i = 0 ; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        return nums;
    }

    static int solution(int[] nums) {
        int selectNum = nums.length / 2;

        HashSet<Integer> numsSet = new HashSet<>();

        // 중복제거
        for (int num : nums) {
            numsSet.add(num);
        }

        // 선택할 수 있는 숫자보다 클 수는 없음.
        if (numsSet.size() > selectNum) {
            return selectNum;
        } else {
            return numsSet.size();
        }

    }
}
