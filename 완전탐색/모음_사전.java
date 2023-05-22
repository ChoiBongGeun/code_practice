import java.util.*;
class Solution {
	public int solution(String word) {
        String[] wordList = word.split("");
		HashMap<String, Integer> map = new HashMap<>();
        map.put("A",0);
        map.put("E",1);
        map.put("I",2);
        map.put("O",3);
        map.put("U",4);
		int[] x = {781,156,31,6,1}; // 자리수 변화 할때 마다 증가하는 수 5*전 자리수+1
		int length = 0;
        int answer = wordList.length;
		for(int i=0;i<wordList.length;i++){
			length = map.get(wordList[i]);
			answer+=x[i]*length;
		}
		return answer;
	}
}