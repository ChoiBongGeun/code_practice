class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int[] answerList = new int[2];
        String[] polynomialList = polynomial.split("[ + ]");
        for(String x : polynomialList)
        {
            if(x.contains("x"))
            {
                if(x.replaceAll("x","").equals(""))
                {
                    answerList[0] += 1;
                }
                else
                {
                    answerList[0] +=Integer.parseInt(x.replaceAll("x",""));
                }
            }
            else if(!x.equals(""))
            {
                answerList[1] +=Integer.parseInt(x);
            }
        }
        if(answerList[1] == 0)
        {
            if(answerList[0] ==0)
            {
                return "0";
            }
            else if(answerList[0]==1)
            {
                return "x";
            }
            else
            {
                return answerList[0]+"x";
            }
        }
        else if (answerList[0] ==0)
        {
            return answerList[1]+"";
        }
        else
        {
            if(answerList[0] ==1)
            {
                return "x + "+answerList[1]+"";
            }
            else
            {
                return answerList[0]+"x + " +answerList[1]+"";
            }
        }
    }
}