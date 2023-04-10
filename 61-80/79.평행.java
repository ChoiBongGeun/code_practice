
import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if((double) (dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]) == 
           (double) (dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]))
        {
            return 1;
        }
        else if((double) (dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]) == 
                (double) (dots[1][1]-dots[3][1])/(dots[1][0]-dots[3][0]))
        {
            return 1;
        }
        else if((double) (dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]) ==
               (double) (dots[1][1]-dots[2][1])/(dots[1][0]-dots[2][0]))
        {
            return 1;
        }
        return answer;
    }
}

/*
틀린 풀이 [a-b, c-d],[a-c, b-d],[a-d, b-c]
import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList list = new ArrayList<Double>();
        for(int i =0; i<4; i++)
        {
            for(int j =i+1;j <4; j++)
            {
                double slope = (double) (dots[i][1]-dots[j][1])/(dots[i][0]-dots[j][0]);
                if(list.contains(slope))
                {
                    return 1;
                }
                else
                {
                    list.add(slope);
                }            
            }
        }
        return answer;
    }
}
 */