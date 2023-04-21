package Day1;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(num));
    }
    public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }
}
