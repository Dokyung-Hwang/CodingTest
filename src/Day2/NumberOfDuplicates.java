package Day2;

public class NumberOfDuplicates {
    public static void main(String[] args) {
        int[] testcase = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solution(testcase, n));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) answer++;
        }
        return answer;
    }
}
