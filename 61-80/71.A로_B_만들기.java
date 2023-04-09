class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeString = before.split("");
        String[] afterString = after.split("");
        for(int i =0 ; i < beforeString.length; i++)
        {
            for(int j =0; j< afterString.length; j++)
            {
                if(beforeString[i].equals(afterString[j]))
                {
                    afterString[j]="";
                    break;
                }
            }
        }
        if(String.join("",afterString).equals(""))
        {
            answer =1;
        }
        return answer;
    }
}

/*
 import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
 */