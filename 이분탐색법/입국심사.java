import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long min = 0;
        long max = times[times.length-1] * (long)n; //모든 사람이 가장 느리게 심사받음
        
        while(min <= max) {
            long mid = (min + max) / 2;
            long complete = 0;
            for (int i = 0; i < times.length; i++)
                complete += mid / times[i];
            if (complete < n) // 해당 시간에는 모든 사람이 검사받을 수 없다.
                min = mid + 1;
            else {
                max = mid - 1;
                answer = mid; // 모두 검사받았으나, 더 최솟값이 있을 수 있다.
            }
        }  
        return answer;
    }
}