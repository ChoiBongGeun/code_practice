import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] bridge = new int[bridge_length];
        List<Integer> bridgeList = new ArrayList<>(); // 다리 현재 진행 상황
        List<Integer> truckList = new ArrayList<>(); // 대기 트럭
        // remove를 위한 List에 넣기
        for(int A : bridge)
        {
            bridgeList.add(A);
        }
        for(int B : truck_weights)
        {
            truckList.add(B);
        }

        int sum = 0;
        while(bridgeList.size() >0)
        {
            answer++;
            sum -= bridgeList.get(0);
            bridgeList.remove(0);

            if(truckList.size() >0)
            {
                if(sum+truckList.get(0) > weight)
                {
                    bridgeList.add(0);
                }
                else
                {
                    int truck = truckList.get(0);
                    truckList.remove(0);
                    bridgeList.add(truck);
                    sum += truck;
                }
            }
        }
        return answer;
    }
}