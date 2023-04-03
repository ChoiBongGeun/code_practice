class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [][] newB =  new int [board.length][board[0].length];

        //위험지대 표시
        for(int i =0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j] == 1)
                {
                    newB[i][j]=1;
                    if(i-1 >=0)
                    {
                        if(j-1 >=0)
                        {
                            newB[i-1][j-1] =1;
                        }
                        newB[i-1][j] = 1;
                        if(j+1 < board[i].length )
                        {
                            newB[i-1][j+1]=1;
                        }
                    }
                    if(j+1 < board[i].length)
                    {
                        newB[i][j+1]=1;
                        if(i+1 < board.length)
                        {
                            newB[i+1][j+1]=1;
                        }
                    }
                    if(i+1 < board.length)
                    {
                        newB[i+1][j]=1;
                    }
                    if(j-1 >= 0)
                    {
                        if(i+1 < board.length)
                        {
                            newB[i+1][j-1]=1;
                        }
                        newB[i][j-1]=1;
                    }
                }
            }
        }
        // 안전지대 
        for(int i =0; i<newB.length; i++)
        {
            for(int j=0; j<newB[i].length; j++)
            {
                if(newB[i][j] == 0)
                {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}