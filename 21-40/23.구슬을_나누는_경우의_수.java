import java.math.BigInteger;

class Solution {
public static int solution(int balls, int share) {
            int answer = 0;
            BigInteger n = new BigInteger("1");
            BigInteger m = new BigInteger("1");
            for(int i =balls; i > share; i--)
            {
                BigInteger x = new BigInteger(i+"");
                n=n.multiply(x);
            }

            for(int i = 1; i<=balls-share; i++)
            {
                BigInteger x = new BigInteger(i+"");
                m=m.multiply(x);
            }
            answer = n.divide(m).intValue();
            return answer;
        }
}

/*
 long 으로 풀었으나 범위가 넘어서 검색 후 BigInteger로 변환 해서 풀이
 밑에 풀이로 long 사용해서 풀이가능
 class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
풀이 참조 : https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
 */