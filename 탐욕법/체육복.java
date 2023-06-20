import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> setLost = 
            Arrays.stream(lost).boxed().collect(Collectors.toSet()); // 중복 및 remove를 위해 set으로 변경
        Set<Integer> setLostRemove = 
            Arrays.stream(lost).boxed().collect(Collectors.toSet()); 
            // setLost를 먼저 remove 해주면 setLost에서 setReserve랑 중복된게 사라져서 setReserve 에서 중복된 값을 삭제 하지 못하기 때문에 하나 더 만들어준다
        Set<Integer> setReserve = 
            Arrays.stream(reserve).boxed().collect(Collectors.toSet());
        setLost.removeAll(setReserve);
        setReserve.removeAll(setLostRemove);
        for(int i : setReserve)
        {
            if(setLost.contains(Integer.valueOf(i-1)))
            {
                setLost.remove(Integer.valueOf(i-1));
            }
            else if(setLost.contains(Integer.valueOf(i+1)))
            {
                setLost.remove(Integer.valueOf(i+1));
            }
        }
        answer = n - setLost.size();
        return answer;
    }
}