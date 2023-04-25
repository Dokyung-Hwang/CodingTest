package Day2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] testcase1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(testcase1)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int count = num_list.length - 1;
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[count];
            count--;
        }
        return answer;
    }
}
