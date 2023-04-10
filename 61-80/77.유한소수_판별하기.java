class Solution {
    public int solution(int a, int b) {
  int answer = 0;
            int x =0;
            for(int i =1; i <b; i++)
            {
                if(a%i ==0 && b%i==0)
                {
                    x =i;
                }
            }
            b /=x;
            while(b%2==0)
            {
                b/=2;
            }
            while(b%5==0)
            {
                b/=5;
            }
            if(b==1)
            {
                answer =1;
            }
            else
            {
                answer =2;
            }
            return answer;
    }
}

/*
class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        for (;b%2 == 0;) {
            b = b/2;
        }
        for (;b%5 == 0;) {
            b = b/5;
        }

        if ((a/(double)b)%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
 */