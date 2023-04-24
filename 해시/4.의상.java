import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hashclothes = new HashMap<String,Integer>();
        for(int i = 0; i<clothes.length; i++){
            if(hashclothes.containsKey(clothes[i][1])){
                hashclothes.put(clothes[i][1], hashclothes.get(clothes[i][1])+1);
            }
            else{
                hashclothes.put(clothes[i][1],1);
            }
        int a=1;
        for(String key : hashclothes.keySet()){ 
            a = a * (hashclothes.get(key)+1);
        }
        answer = a-1;
            
        }
        return answer;
    }
}
/*
 예를들어 얼굴 a,b 상의 c가 존재 할때
 1.a, 없음
 2.b, 없음
 3.없음,c
 4.a,c
 5.b,c
 위의 경우 대로 없는 경우를 포함 해야 하므로 *기를 할때 +1을 해주고 둘다 없는 경우를 빼주기 위해 -1을 해준다.


 import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}

 */