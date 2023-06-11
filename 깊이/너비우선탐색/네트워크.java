class Solution {
    int answer =0;
    int n;
    int[][] computers;
    boolean[] check;
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.n = n;
        this.check = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            if(!check[i])
            {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int i)
    {
        check[i] = true; 
        for(int j = 0 ; j < computers.length; j++)
        {
            if(computers[i][j] ==1 && !check[j])
            {
                dfs(j);
            }
        }
    }
}