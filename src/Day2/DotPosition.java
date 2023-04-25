package Day2;

public class DotPosition {
    public static void main(String[] args) {
        int[] dot = {0, 0};
        System.out.println(solution(dot));

    }

    public static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) answer = 1;
        else if (dot[0] < 0 && dot[1] > 0) answer = 2;
        else if (dot[0] > 0 && dot[1] < 0) answer = 3;
        else answer = 4;

        return answer;
    }
}

/*
* Questions. 단순 제어문
* input: 좌표
* output: n 사분면
*
* Restrictions
* 1. -500 <= dot 원소 <= 500
* 2. dot의 원소 != 0
* 3. dot의 길이 = 2
* 4. dot[0] = x / dot[1] = y(좌표)
*
* Solutions
* if ~ if else ~ else
* */
