import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}

/*
0.58 -> 0.55
시프트 연산
2>>1 이란 
비트 열 00000010 =2 오른쪽으로 1만큼 시프트 00000001 = 1  나누기 2와 비슷하다??

검색 결과
2진수 정수의 특성상 왼쪽으로 한칸씩 비트열을 움직이면 2의 배수곱으로 오른쪽으로 한칸씩 이동시키면 2의 배수 나눗샘이 되게 된다.
해당 내용이 중요한 이유는 곱셈 및 나눗셈 처리시에 CPU 부담을 줄일 수 있다는 것에 있다.
참고 : https://chans-note.tistory.com/3

 import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}
 */