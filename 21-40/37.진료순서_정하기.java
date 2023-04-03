import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortList= emergency;
        Arrays.sort(sortList);
        for(int i = 0; i < emergency.length; i++)
        {
            for(int x =0; i<sortList.length; x++)
            {
                if(emergency[i]==sortList[x])
                {
                    answer[i] =sortList.length-x;
                    break;
                }
            }
        }
        return answer;
    }
}
/*수정필요 */