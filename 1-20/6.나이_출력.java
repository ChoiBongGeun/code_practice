class Solution {
    public int solution(int age) {
        int answer = 2022 - age +1;  //나이가 2022년 기준
        return answer;
    }
}

/*
문제에서 2022로 기준을 줘서 불필요해 보이지만 현재 년도로 문제가 나왔을 경우 유용해 보임
import java.time.*;
class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now(); 
        return today.getYear() - age + 1;
    }
}
 */