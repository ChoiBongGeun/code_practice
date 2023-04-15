class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int decision1 = common[1] - common[0];
        int decision2 = common[2] - common[1];
        if(decision1 == decision2)
        {
            answer = decision1 + common[common.length-1];
        }
        else
        {
            decision1 = common[1] / common[0]; // 1,2,4 등비 중
            answer = common[common.length-1] * decision1;
        }
        return answer;
    }
}