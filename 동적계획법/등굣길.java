class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1]; //지도 만들기
        for(int i = 0; i < puddles.length; i++) {
            map[puddles[i][1]][puddles[i][0]] = -1;  //웅덩이로 인해 갈수 없는곳 -1로 표시
        }
        
        map[1][1] = 1; //집 좌표
        /*
        [0, 0, 0, 0, 0]
        [0, 1, 1, 1, 1]
        [0, 1, -1, 1, 2]
        [0, 1, 1, 2, 4]
        [0, 1, 1, 2, 4]
        */
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(map[i][j] == -1)
                {
                    continue;
                }
                if(map[i - 1][j] > 0)
                {
                    map[i][j] += map[i - 1][j] % 1000000007; // 효율성 실패로 인해 추가
                }
                if(map[i][j - 1] > 0)
                 {
                    map[i][j] += map[i][j - 1] % 1000000007; // 효율성 실패로 인해 추가
                 }
            }
        }
        return map[n][m] % 1000000007;
    }
}
