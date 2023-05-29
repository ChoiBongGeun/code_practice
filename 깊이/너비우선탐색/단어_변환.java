class Solution {
    int answer = 0;
    boolean[] visited;
    String target;
    String[] words;
    void dfs(String begin,int count)
    {
        if(begin.equals(target))
        {
            answer = count;
            return;
        }
        for(int i = 0; i < words.length; i++)
        {
            if(visited[i])
            {
                continue;
            }
            int diff = 0;
            for(int j = 0; j < words[i].length(); j++)
            {
                if(begin.charAt(j) != words[i].charAt(j))
                {
                    diff++;
                }
                if(diff ==2)
                {
                    break;
                }
            }
            if(diff ==1)
            {
                visited[i] = true;
                dfs(words[i],count+1);
                visited[i] = false;
            }
        }
    }
    public int solution(String begin, String target, String[] words) {
        this.visited = new boolean[words.length];
        this.target = target;
        this.words = words;
        dfs(begin,0);
        return answer;
    }
}