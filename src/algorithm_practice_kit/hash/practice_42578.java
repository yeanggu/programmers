package algorithm_practice_kit.hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class practice_42578 {
    // 의상

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[][] arr = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        System.out.println(solution(arr));
    }

    static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int count = 1;

        while (it.hasNext()) {
            count *= it.next().intValue() + 1;
        }

        return count - 1;
    }
}
