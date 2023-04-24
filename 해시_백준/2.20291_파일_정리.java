import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer>map = new HashMap<>();

        for(int i =0; i< n; i++)
        {
            String s = br.readLine();
            String file  = s.split("[.]")[1];
            if(map.containsKey(file))
            {
                map.put(file,map.get(file)+1);
            }
            else
            {
                map.put(file,1);
            }
        }
        List<String> keyList = new ArrayList<>(map.keySet()); //key set을 list로 변환
        Collections.sort(keyList); // 오름 차순으로 정렬
        for(String s : keyList)
        {
            System.out.println(s+ " "+map.get(s));
        }

    }
}