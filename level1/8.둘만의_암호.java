class Solution {
    public String solution(String s, String skip, int index) {
    String answer = "";

    char[] chArr = s.toCharArray();
    for(int i=0; i<chArr.length; i++) {
        for(int j=0; j<index; j++) {
            chArr[i]++; //알파벳 하나씩 증가
            if(chArr[i] > 'z') { //z이면 A로 다시 돌아가서 시작
                chArr[i] -= 26;
            }
            while(skip.contains(String.valueOf(chArr[i]))) { // skip에 들어있으면 하나씩 증가
                chArr[i]++;
            }
        }
    }
    answer = String.valueOf(chArr);
    return answer;
    }
}