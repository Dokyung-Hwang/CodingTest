package Day1;

public class Protractor {
    public static void main(String[] args) {

    }

    public static int solution(int angle) {
        int answer = 0;
        if (angle < 90)
            answer = 1;
        else if (angle == 90)
            answer = 2;
        else if (angle < 180)
            answer = 3;
        else
            answer = 4;
        return answer;
    }
}
