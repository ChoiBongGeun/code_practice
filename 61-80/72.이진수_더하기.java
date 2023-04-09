class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1to10 = Integer.parseInt(bin1,2);
        int bin2to10 = Integer.parseInt(bin2,2);
        int answerto10 = bin1to10 + bin2to10;
        answer = Integer.toBinaryString(answerto10);
        return answer;
    }
}
/*
String binaryString = Integer.toBinaryString(i); //2진수
String octalString = Integer.toOctalString(i);   //8진수
String hexString = Integer.toHexString(i);       //16진수
Integer.parseInt(String s, int n진수);
 */