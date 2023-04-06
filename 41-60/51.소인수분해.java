import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList<Integer> ();
        for(int i = 2; i <= n; i++)
        {
            while(n%i ==0)
            {
                n/=i;
                if(!answer.contains(i))
                {
                    answer.add(i);
                }
            }
        }
        return answer;
    }
}

/*
 import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        int[] answer = factorList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

 */