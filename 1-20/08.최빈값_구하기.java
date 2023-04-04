import java.util.*;
import java.lang.Integer;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : array)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        int value = 0;
        for(int key : map.keySet())
        {
            if(map.get(key) > value)
            {
                answer = key;
                value = map.get(key);
            }
            else if(map.get(key) == value)
            {
                answer = -1;
            }
        }
        
        return answer;
    }
}

/*

import java.util.*;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
 */