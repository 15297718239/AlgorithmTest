package Offer;

public class ReplaceSpaces {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "we are happy";
        ReplaceSpaces replaceSpaces = new ReplaceSpaces();
        System.out.println(replaceSpaces.replaceSpace(s));

    }
}
