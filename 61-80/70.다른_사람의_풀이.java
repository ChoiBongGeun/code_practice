class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x = i; x <= j; x++)
        {
            String stringToInt = String.valueOf(x);
            if(stringToInt.contains(k+""))
            {
                for(int y = 0; y< stringToInt.length(); y++)
                {
                    if((stringToInt.charAt(y)+"").equals(k+""))
                    {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
/*
 class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
}
 */