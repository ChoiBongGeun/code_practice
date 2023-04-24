class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total /num;
        int indexM = 0;
        if(num%2 != 0)
        {
            indexM = num /2;
        }
        else
        {
            indexM = num /2 -1;
        }
        answer[indexM] = middle;
        int d = 1;
        while(true)
        {
            if(indexM-d >=0)
            {
                answer[indexM-d] = middle -d;
            }
            if(indexM + d < num)
            {
                answer[indexM+d] = middle +d;
            }
            if(indexM-d <= 0 && indexM+d >= num)
            {
                break;
            }
            d++;
        }
        return answer;
    }
}

/*
 class Solution {
        public int[] solution(int num, int total) {
                int[] answer = new int[num];
                int check = num*(num+1) / 2;
                int start = (total - check) / num + 1;
                for (int i = 0; i < answer.length; i++) {
                        answer[i] = start + i ;
                }
                return answer;
        }
}
 */