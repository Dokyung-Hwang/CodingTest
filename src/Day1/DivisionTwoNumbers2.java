package Day1;

public class DivisionTwoNumbers2 {
    public static void main(String[] args) {

    }

    public static int solution(int num1, int num2) {
        double division = (double)num1 / num2;
        int answer = (int)(division * 1000);
        return answer;
    }
}
