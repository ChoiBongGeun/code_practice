class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = 0;
        int max =0;
        if(sides[0] > sides[1])
        {
            min = sides[1];
            max = sides[0];
        }
        else
        {
            min = sides[0];
            max = sides[1];
        }
        return 2*min -1;
    }
}

/*
max가 진짜 긴 경우 max-(max-min+1)+1 = min
새로운게 긴 경우 max+min-1 - (max+1) +1  = min-1
 */