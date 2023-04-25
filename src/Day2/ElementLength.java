package Day2;

import java.util.Arrays;

public class ElementLength {
    public static void main(String[] args) {
        String[] arr  = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(String[] strlist) {

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}


// 반복문으로 strlist를 순회하면서 새로운 배열에 첫 번째 인덱스부터 strlist.length를 채운다