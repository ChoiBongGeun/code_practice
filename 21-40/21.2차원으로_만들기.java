class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int y = 0;
        for(int i = 0; i<num_list.length/n; i++)
        {
            for(int x = 0; x<n; x++)
            {
                answer[i][x] = num_list[y];
                y++;
            }
        }
        return answer;
    }
}

/*
나누기 나머지
 class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
}
 */