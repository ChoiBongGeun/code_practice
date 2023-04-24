import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        Set<Integer> set = new HashSet<>();
        set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(set.size() < max )
        {
            answer = set.size();
        }
        else
        {
            answer = max;
        }
        
        
        return answer;
    }
}

/*
 import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}

 */