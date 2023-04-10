import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Arrays.sort(numlist);
        for(int i = numlist.length-1; i>=0; i--)
        {
            ArrayList<Integer> list = new ArrayList<>();
            int abs = Math.abs(numlist[i]-n);
            if(map.containsKey(abs))
            {
                list = map.get(abs);
                list.add(numlist[i]);
                map.put(abs, list);
            }
            else
            {
                list.add(numlist[i]);
                map.put(abs,list);
            }
        }
        List<Integer> keyList = new ArrayList<>(map.keySet()); //key set을 list로 변환
        Collections.sort(keyList); // 오름 차순으로 정렬
        int index =0;
        for(int i : keyList)
        {
            for(int j =0; j< map.get(i).size(); j++)
            {
                answer[index] = map.get(i).get(j);
                index++;
            }
        }
        return answer;
    }
}