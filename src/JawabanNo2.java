public class JawabanNo2 {

    public static String ReverseString(String str){
        int word = str.length();
        int word2 = word - 1;
        String s = "";
        for (int a = 0; a < word; a++){
            s = s + str.charAt(word2);
            word2--;
        }
        return s.replaceAll("(?i)[aiueo]","*");
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("halo ges"));
        System.out.println(ReverseString("halo ges"));
    }
}
