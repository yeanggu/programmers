package algorithm_practice_kit.hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class practice_42577 {
    // 전화번호 목록

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(parse(input)));
    }

    static String[] parse(String phone_book) {
        String[] strings = phone_book.split(",");
        return strings;
    }

    static boolean solution(String[] phone_book) {
        HashSet<String> numsSet = new HashSet<>();

        for (String phone : phone_book) {
            numsSet.add(phone);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (numsSet.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
