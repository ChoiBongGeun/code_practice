class Solution {
	// answer target numbers 선언
    int answer = 0;
    int target;
    int[] numbers;
    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
    	// 2. dfs 함수 실행.
        dfs(0,0);
        return answer;
    }
    
    public void dfs( int i, int sum){
    	// 3. 배열 마지막 노드까지 탐색이 끝났는지 체크
        if(i == numbers.length)
        {
        	// 4. 합계와 타겟 값이 같으면 answer을 1 증가 시킴.
            if(sum == target) 
            {
                answer++;
            } 
        }
        else
        {
        	//5. 해당 노드 값을 더하고 다음 값 탐색
            dfs(i+1, sum+numbers[i]);
           // 6. 해당 노드 값을 빼고 다음 값 탐색
            dfs(i+1, sum-numbers[i]);
        }   
    }
}
