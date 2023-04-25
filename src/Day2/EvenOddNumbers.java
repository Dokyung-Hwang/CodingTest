package Day2;

import java.util.Arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        answer[0] = evenCount;
        answer[1] = oddCount;

        return answer;
    }
}
