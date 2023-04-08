class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] numbersList = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0; i < numbersList.length; i++)
        {
            numbers = numbers.replaceAll(numbersList[i],Integer.toString(i));
        }
        answer =  Long.parseLong(numbers);
        return answer;
    }
}

/*
Integer.toString 말고  String.valueOf(i) 또한 존재
 */