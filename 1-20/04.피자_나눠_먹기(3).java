class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice ==0)
        {
            answer = n/slice;
        }
        else
        {
            answer = n/slice +1;
        }
        return answer;
    }
}


/*
class Solution {
    public int solution(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
*/