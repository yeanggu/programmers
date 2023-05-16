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
        int num = Integer.parseInt(s);

        int size = 0;
        for (int i = num ; i > 0 ; i--) {
            size += i;
        }

        int[] answer = new int[size];

        int index = 0;
        int count = 1;
        int temp = num;
        int floor = num;
        int floorTemp;
        int startFloor = 1;

        while (temp != 0) {

            // 아래로 내려가는 로직
            for (int i = startFloor; i <= floor ; i++) {
                answer[index] = count;

                if (i == floor) {
                    break;
                }

                index += startFloor;
                startFloor += 1;
                count += 1;
            }

            // 오른쪽으로 직진하는 로직
            temp -= 1;
            if (temp == 0) break;
            for (int i = 0 ; i < temp ; i++) {
                count += 1;
                index += 1;
                answer[index] = count;
            }

            // 위로 올라가는 로직
            temp -= 1;
            if (temp == 0) break;
            floorTemp = floor;
            for (int i = 0 ; i < temp ; i++) {
                index -= floorTemp;
                count += 1;
                answer[index] = count;
                floorTemp -= 1;
            }

            temp -= 1;
            floor -= 1;
            count += 1;
            index += floorTemp;
            startFloor = floorTemp + 1;

        }

        System.out.println(Arrays.toString(answer));
    }




}
