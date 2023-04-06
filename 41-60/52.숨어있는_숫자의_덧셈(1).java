class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] a = my_string.replaceAll("[^0-9]", "").trim().split("");
        for(String b : a)
        {
            if(!b.equals(" ") && !b.equals(""))
            {
                answer += Integer.parseInt(b);
            }
        }
        return answer;
    }
}
