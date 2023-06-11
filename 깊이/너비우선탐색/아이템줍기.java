import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        int start_x=characterX*2;
        int start_y=characterY*2;
        int end_x=itemX*2;
        int end_y=itemY*2;
        
        boolean[][] map= new boolean[100][100]; 
        /*
         모든 좌표값이 50이하라고 문제에 제한사항이 있는데 100으로 map을 만든 이유는 좌표로만 갈수 있는 길을 표시하기 때문에
         죄표 차이가 1이고 길이 없는 경우 길인줄 알고 가기 때문에 전부다 2 늘려줘서 갈수 없게 해준다 
         ex) ㄷ 자 모양을 ㅁ으로 착가함
         예시 그림 및 자세한 설명은
         https://taehoung0102.tistory.com/95 참고
         100 런타임 에러 나옴
         101 런타임 에러
         질문에 보면 101까지 가질수 있다고 하는데 왜 그런지 모르겠음
         102 해결??
         */
        
        /*    
            테두리만 true 만드는 법을 모르겠어서 테두리 포함해서 내부까지 전부 true로 만든 다음
            내부를 false로 변경 해주었다
         */
        for(int[] shapes:rectangle){
            for(int i=shapes[1]*2;i<=shapes[3]*2;i++){
              for(int j=shapes[0]*2;j<=shapes[2]*2;j++){
                    map[i][j]=true;
                  
              }  
            }
        }
        
        for(int[] shapes:rectangle){
            for(int i=shapes[1]*2+1;i<shapes[3]*2;i++){
              for(int j=shapes[0]*2+1;j<shapes[2]*2;j++){
                    map[i][j]=false;
              }  
            }
        }
    
        //bfs 탐색
        Stack<Integer[]> stack = new Stack<>();
        
        // 시작점 설정
        Integer[] start = {start_x,start_y};
        stack.add(start);
        
        List<Integer> result =new ArrayList<>();
        int cnt=0;
        
        while(true){       
            if(stack.isEmpty()){
                result.add(cnt);
                break;
            }
            Integer[] path=stack.pop();
            int x=path[0];
            int y=path[1]; 
           
            //도착하면 갯수 저장
            if(x==end_x&&y==end_y){
                result.add(cnt);         
            }
            
            //지났으면 지난자리 false               
            map[y][x]=false; //map[x][y]가 아니라 map[y][x] 값이다 
            
            if(map[y+1][x]==true) stack.add(new Integer[]{x,y+1});
            if(map[y][x+1]==true) stack.add(new Integer[]{x+1,y});
            if(map[y-1][x]==true) stack.add(new Integer[]{x,y-1});
            if(map[y][x-1]==true) stack.add(new Integer[]{x-1,y});
            
            cnt++;
            
        }
        
        answer=Math.min(result.get(0)/2,result.get(1)/2-result.get(0)/2);      
        return answer;
    }
    
}