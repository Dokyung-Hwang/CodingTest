package Day2;

import java.util.Arrays;

public class CutArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(solution(arr, num1, num2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}
