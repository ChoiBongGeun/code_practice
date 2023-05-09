import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < players.length;i++)
        {
            map.put(players[i],i);
        }
        for(String a : callings)
        {
            int cu = map.get(a);
            String before = players[cu-1];
            players[cu-1] = a;
            players[cu] = before;
            map.put(a,cu-1);
            map.put(before,cu);
        }
        
        return players;
    }
}

/*시간 초과  
이유 설명 https://velog.io/@ljs0429777/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%8B%AC%EB%A6%AC%EA%B8%B0-%EA%B2%BD%EC%A3%BC

배열 시간 복잡도 O(n)
Hash를 이용하면 O(1)

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        for(String a : callings)
        {
            for(int i =0; i < players.length; i++)
            {
                if(players[i].equals(a))
                {
                    String a1 = players[i];
                    String a2 = players[i-1];
                    players[i] = a2;
                    players[i-1] = a1;
                    break;
                }
            }
        }
        return players;
    }
}
 */