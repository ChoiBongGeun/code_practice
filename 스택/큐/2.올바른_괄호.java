class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int parenthesis = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                parenthesis++;
            }
            else
            {
                parenthesis--;
            }
            if(parenthesis < 0)
            {
                return false;
            }
        }
        if(parenthesis ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
/* 시간 초과 split 시간 초과

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int parenthesis = 0;
        String[] sArray = s.split("");
        for(String a : sArray)
        {
            if(a.equals("("))
            {
                parenthesis++;
            }
            else
            {
                parenthesis--;
            }
            if(parenthesis < 0)
            {
                return false;
            }
        }
        if(parenthesis ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
 */