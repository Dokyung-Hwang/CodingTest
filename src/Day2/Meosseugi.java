package Day2;

import java.util.Arrays;

public class Meosseugi {
    public static void main(String[] args) {
        int[] arr = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(arr, height));
    }

    public static int solution(int[] array, int height) {

        int count = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }
        }
        return count;
    }
}
/*
Q.
input: 배열, 머쓱이 키
output: 배열 요소 중 머쓱이보다 키 큰 요소 갯수 반환

S.
1. array 배열 정렬
2. 머쓱이 보다 키 큰 요소 카운트 해 줄 int 변수 선언 및 0으로 초기화
3. 반복문과 제어문으로 입력받은 배열 순회하면서 머쓱이 보다 키 큰 요소 카운트
   if (array[i] > 머쓱이키) 카운트++;
4. 카운트 반환

* */
