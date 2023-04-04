class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String key : keyinput)
        {
            if(key.equals("left"))
            {
                if(board[0]/2*-1 != answer[0])
                {
                    answer[0]--;
                }
            }
            else if(key.equals("right"))
            {
                if(board[0]/2 != answer[0])
                {
                    answer[0]++;
                }
            }
            else if(key.equals("down"))
            {
                if(board[1]/2 *-1 != answer[1])
                {
                    answer[1]--;
                }
            }
            else
            {
                if(board[1]/2 != answer[1])
                {
                    answer[1]++;
                }
            }
        }
        return answer;
    }
}