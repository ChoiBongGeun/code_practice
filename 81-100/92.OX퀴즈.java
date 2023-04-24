class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++)
        {
            String[] x = quiz[i].split(" ");
            if(x[1].equals("-"))
            {
                if(Integer.parseInt(x[0]) - Integer.parseInt(x[2]) 
                   ==Integer.parseInt(x[4]))
                {
                    answer[i] = "O";
                }
                else
                {
                    answer[i] = "X";
                }
            }
            else
            {
                if(Integer.parseInt(x[0]) + Integer.parseInt(x[2]) 
                   ==Integer.parseInt(x[4]))
                {
                    answer[i] = "O";
                }
                else
                {
                    answer[i] = "X";
                }
            }
            
        }
        return answer;
    }
}
/*
 class Solution {
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}
 */