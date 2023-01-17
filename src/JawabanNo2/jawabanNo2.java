package JawabanNo2;

public class jawabanNo2 {
    static String ReverseString (String str) {
        char[] c=str.toCharArray();
        String kalimat="";
        for(int i=c.length-1;i>=0;i--) {
            kalimat=kalimat+c[i];
        }
        return kalimat.replaceAll("(?i)[aiueo]", "*");
    }


    public static void main(String[] args) {
        System.out.println(ReverseString("a b cd ef"));
        System.out.println(ReverseString("contoh kalimat"));

    }
}
