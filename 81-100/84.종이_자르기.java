class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = N*M-1;
        return answer;
    }
}

/*
 가로 방향으로 N-1 만큼 자르기
 그중 하나만 세로 방향으로 잘랐을 경우 M-1 만큼 자른다 
 N개가 존재 하기 때문에 N(M-1)
 따라서 N-1 + N(M-1)
 N-1 + NM-N
 NM-1
 */
