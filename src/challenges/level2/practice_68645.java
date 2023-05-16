package challenges.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class practice_68645 {
    //삼각 달팽이

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }

    static void solution(String s) {
        int n = Integer.parseInt(s);

        int[] answer = new int[(n*(n+1))/2];

        int index = 0;
        int count = 1;
        int repeatCount = n;
        int floor = n;
        int floorTemp;
        int startFloor = 1;

        while (repeatCount != 0) {

            // 아래로 내려가는 로직
            for (int i = startFloor; i <= floor ; i++) {
                answer[index] = count;

                if (i == floor) {
                    break;
                }

                index += startFloor;
                startFloor ++;
                count ++;
            }

            // 오른쪽으로 직진하는 로직
            repeatCount -= 1;
            if (repeatCount == 0) break;
            for (int i = 0 ; i < repeatCount ; i++) {
                count ++;
                index ++;
                answer[index] = count;
            }

            // 위로 올라가는 로직
            repeatCount -= 1;
            if (repeatCount == 0) break;
            floorTemp = floor;
            for (int i = 0 ; i < repeatCount ; i++) {
                index -= floorTemp;
                count ++;
                answer[index] = count;
                floorTemp --;
            }

            repeatCount --;
            floor --;
            count ++;
            index += floorTemp;
            startFloor = floorTemp + 1;

        }

        System.out.println(Arrays.toString(answer));
    }




}
