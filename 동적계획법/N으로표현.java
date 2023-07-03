import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        Set<Integer>[] setList = new Set[9]; // 8개의 통을 만든다
        setList[1] = new HashSet<>(); // 초기값 설정
        setList[1].add(N); //5
        int init = N; //55
        for(int i = 2; i < 9; i++) {
            init = init*10+N ; //5555555555
            setList[i] = new HashSet<>();
            setList[i].add(init);
        }//2부터 N이 5일때 5 55 555 이런식으로 늘려줘서 setList에 넣어줌
        for(int i = 2; i < 9; i++) {
            for(int j = 1; j < i; j++) {
                for(Integer a : setList[j]) {
                    for(Integer b : setList[i - j]) {
                        setList[i].add(a + b);
                        setList[i].add(a - b); //음수가 될수도 있기 때문에 a-b b-a 다 해줌
                        setList[i].add(b - a);
                        setList[i].add(a * b);
                        //분모가 0이면 안되기 때문에 0이 아닐때만 
                        if(b != 0) {
                            setList[i].add(a / b);
                        }
                        if(a != 0) {
                            setList[i].add(b / a);
                        }
                    }
                }
            }
        }
        for(int i = 1; i < 9; i++) {
            if(setList[i].contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}