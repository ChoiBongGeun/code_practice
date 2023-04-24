class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        for(String ba : babbling)
        {
            for(String word : words)
            {
                if(ba.contains(word))
                {
                    ba = ba.replaceFirst(word,"/");
                }
            }
            ba= ba.replaceAll("/","");
            if(ba.equals(""))
            {
                answer++;
            }
        }
        
        return answer;
    }
}


/*
정규식 공부
 class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }
}
 */