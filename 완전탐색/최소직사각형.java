class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_width = 0;
        int max_height = 0;
        //가로 세로 비교 해서 큰수를 무조건 가로 작은 수를 세로 놓고 가로중 가장 큰수 세로중 가장 큰수 곱해준다
        for(int i =0; i < sizes.length; i++)
        {
            if (sizes[i][0] < sizes[i][1])
            {
                if(max_width < sizes[i][1])
                {
                    max_width = sizes[i][1];
                }
                if(max_height < sizes[i][0])
                {
                    max_height = sizes[i][0];
                }
            }
            else
            {
                if(max_width < sizes[i][0])
                {
                    max_width = sizes[i][0];
                }
                if(max_height < sizes[i][1])
                {
                    max_height = sizes[i][1];
                }
            }
        }
        return max_height * max_width;
    }
}