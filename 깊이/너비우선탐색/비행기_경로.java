import java.util.*;

class Solution {

    static ArrayList<String> list = new ArrayList<>();
    static boolean travel[];

    public String[] solution(String[][] tickets) {
        travel = new boolean[tickets.length];

        dfs(0, "ICN", "ICN", tickets);

        Collections.sort(list); // 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 찾기 위해

        return list.get(0).split(",");
    }

    static void dfs(int depth, String now, String path, String[][] tickets){
        if (depth == tickets.length) {
            list.add(path); //가능한 경로 추가
            return;
        }

        for (int i = 0; i < travel.length; i++) {
            if (!travel[i] && now.equals(tickets[i][0])) {
                travel[i] = true;
                //이중list 정렬보다 ,로 일단 path에 저장후 정렬 하는게 더 간단해 보여서 ,를 기준으로 저장
                dfs(depth+1, tickets[i][1], path + "," +tickets[i][1], tickets);
                travel[i] = false;
            }
        }
    }
}