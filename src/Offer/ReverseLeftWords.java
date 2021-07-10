package Offer;

public class ReverseLeftWords {
    //    public  static String reverseLeftWords(String s, int n) {
//        return s.substring(n, s.length()) + s.substring(0, n);
//    }
//
//    public static void main(String[] args) {
//        String s="abcdefg";
//        int n=4;
//        System.out.println(reverseLeftWords(s,4));
//    }
    public static String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for (int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();
    }

}
