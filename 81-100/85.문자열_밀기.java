class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String Aduplicate = A;
        while(true)
        {
            if(Aduplicate.equals(B))
            {
                break;
            }
            answer++;
            Aduplicate = Aduplicate.charAt(Aduplicate.length()-1)
                +Aduplicate.substring(0,Aduplicate.length()-1);
            
            if(A.equals(Aduplicate))
            {
                answer =-1;
                break;
            }
        }
        return answer;
    }
}
/*
A hello
B elloh 일때
B+B = ellohello 이기 때문에 하나씩 밀었을 때의 모든 경우가 안에 포함 되어있다

 class Solution {
    public int solution(String A, String B) {

        return (B+B).indexOf(A);
    }
}
 */