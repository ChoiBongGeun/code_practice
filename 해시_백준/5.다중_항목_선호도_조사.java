import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        String[][] student = new String[n][3];
        for(int i =0; i < n; i++)
        {
            String s = br.readLine();
            String[]sList = s.split(" "); // 배열 말고 다르게 
            student[i] = sList;
        }
        for(int i = 0; i < M; i++)
        {
            String like = br.readLine();
            String[] likeList = like.split(" ");
            int answer = 0;
            for(int j = 0; j < n; j++)
            {
                if(likeList[0].equals(student[j][0]) || likeList[0].equals("-"))
                {
                    if(likeList[1].equals(student[j][1]) || likeList[1].equals("-"))
                    {
                        if(likeList[2].equals(student[j][2]) || likeList[2].equals("-"))
                        {
                            answer++;
                        }

                    }
                }
            }
            System.out.println(answer);
        }
    }
}
/*시간초과 */