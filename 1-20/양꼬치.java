class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        k = k-n/10;
        answer = 12000*n + 2000*k;
        return answer;
    }
}
/*
  서비스로 받은 음료를 모두 마신다라고 문제에 정의 되어 있으므로 k가 0일때는 신경 쓰지 않음
  만약 서비스로 받은 음료를 모두 마신다라는 문구가 없다면 밑에 처럼 음료 값이 -가 되는 부분을 신경써서 풀어야 함
  
  class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(k >= k-n/10)
        {
            k = k-n/10;
        }
        answer = 12000*n + 2000*k;
        return answer;
    }
}

 */