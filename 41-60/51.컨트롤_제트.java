class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sList = s.split(" ");
        int before = 0;
        for(String x : sList)
        {
            if(x.equals("Z"))
            {
                answer -= before;
            }
            else
            {
                answer += Integer.parseInt(x);
                before = Integer.parseInt(x);
            }
        }
        return answer;
    }
}