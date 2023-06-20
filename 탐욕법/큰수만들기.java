import java.util.*;
import java.util.stream.Stream;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int[] numberList = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        List<Integer> answerList = new ArrayList<>();
        
        for(int n : numberList)
        {
            while(answerList.size() >0 && answerList.get(answerList.size()-1) < n && k >0) 
            //answerList 리스트 크기가 0보다 크고 answerList의 마지막 수가 n과 비교 했을때 작으면 하나 제거 하고 k를 줄인다
            {
                k --;
                answerList.remove(answerList.size()-1);
            }
            answerList.add(n);
        }
        if(k!=0)//끝까지 다 돌았는데 k가 남아있으면 더 제거 해줘야 하므로 뒤에 수 부터 제거 해준다
        {
            answerList = answerList.subList(0, answerList.size()-k);
        }
        for(int i : answerList)
        {
            answer += String.valueOf(i);
        }
        return answer;
    }
}