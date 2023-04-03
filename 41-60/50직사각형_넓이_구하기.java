class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];
        for(int i = 1; i < 4; i++)
        {
            if(dots[i][0]>maxX)
            {
                maxX = dots[i][0];
            }
            else if(dots[i][0] < minX)
            {
                minX = dots[i][0];
            }
            if(dots[i][1] > maxY)
            {
                maxY = dots[i][1];
            }
            else if (dots[i][1] < minY)
            {
                minY = dots[i][1];
            }
        }
        
        return (maxX-minX)*(maxY-minY);
    }
}

/*
Math.abs??

 class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
}
 */