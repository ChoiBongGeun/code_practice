import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<Integer>();
        for(int i = 0, len = score.length; i < len; i++)
        {
            scoreList.add(score[i][0]+ score[i][1]);
        }
        Collections.sort(scoreList);
        for(int j = 0; j <scoreList.size(); j++)
        {
            answer[j] = 
                scoreList.size()-scoreList.lastIndexOf(score[j][0]+ score[j][1]);// indexof는 처음 일치 lastindex는 마지막 일치
        }
        return answer;
    }
}