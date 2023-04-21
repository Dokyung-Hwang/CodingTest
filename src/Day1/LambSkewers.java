package Day1;

public class LambSkewers {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + ((k - (n/10)) * 2000);
        return answer;
    }
}

/* Q. 요구사항
   1. 양꼬치 1인분: 12000원 / 콜라 1개당: 2000원
   2. 양꼬치 10인분 당 콜라 1개 서비스
   3. 총 가격 반환
   Input parameter(n:양꼬치, k: 콜라)

   Solution
   1. (양꼬치 * n) + (콜라 * k)
   2. But, 콜라 총 가격은 콜라 개수 - 양꼬치10개당1
* */
