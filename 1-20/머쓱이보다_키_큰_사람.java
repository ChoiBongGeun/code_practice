import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i ++)
        {
           if(height < array[i])
           {
               answer = array.length -i;
               break;
           }
        }
        return answer;
    }
}

/*
 sort 불필요 for문으로 전체 리스트 확인 하는게 시간 덜 걸림 
 class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i: array){
            answer += (i>height) ? 1 : 0;
        }
        return answer;
    }
}
 */