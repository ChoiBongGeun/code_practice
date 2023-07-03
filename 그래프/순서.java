class Solution {
    public static int solution(int n, int[][] results) {
        int answer = 0;
        int[][] game = new int[n+1][n+1];

        for(int i = 0; i < results.length; i++){
            game[results[i][0]][results[i][1]] = 1;
            game[results[i][1]][results[i][0]] = -1;
        }

        // A > B, B> C =>  A>C
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(game[i][k] == 1 && game[k][j] == 1){
                        game[i][j] = 1;
                        game[j][i] = -1;
                    }
                    if(game[i][k] == -1 && game[k][j] == -1){
                        game[i][j] = -1;
                        game[j][i] = 1;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++)
        {
            int count = 0;
            for(int j = 1; j <= n; j++)
            {
                if(game[i][j] != 0)
                {
                    count++;//지든 이기든 경기의 결과를 알고 있기 때문에 count++
                }
            }
            if(count == n-1) //자기 자신 빼고 모든 경기의 결과를 알고 있기 때문에 answer ++
            {
                answer++;
            }
        }

        return answer;
    }
}
