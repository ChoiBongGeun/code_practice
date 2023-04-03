class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rsplist = rsp.split("");
        for(String a : rsplist)
        {
            if(a.equals("2"))
            {
                answer +="0";
            }
            else if(a.equals("0"))
            {
                answer +="5";
            }
            else
            {
                answer +="2";
            }
        }
        return answer;
    }
}