package kopas;

public class kopas {
        static StringBuffer reverseStringBuffer (String s) {
            StringBuffer sb=new StringBuffer(s);
            StringBuffer result=sb.reverse();
            return result;
        }

        static StringBuilder reverseStringBuilder (String s) {
            StringBuilder sb=new StringBuilder(s);
            StringBuilder result=sb.reverse();
            return result;
        }

        static String charArrayMethod (String s) {
            char[] c=s.toCharArray();
            String result="";
            for(int i=c.length-1;i>=0;i--) {
                result=result+c[i];
            }
            return result;
        }

        static String charAtMethod (String s) {
            int lent=s.length();
            String result="";
            for(int i=lent-1;i>=0;i--) {
                result=result+s.charAt(i);
            }
            return result;
        }
        static String reverseRecursion (String s) {
            if(s.length()<2) {
                return s;
            }

            return reverseRecursion(s.substring(1))+s.charAt(0);
        }
        public static void main(String[] args) {
            String s="Java Program";
            System.out.println("Using StringBuffer reverse() method:"+reverseStringBuffer(s));
            System.out.println("Using StringBuilder reverse() method:"+reverseStringBuilder(s));
            System.out.println("Using charArray() method:"+charArrayMethod(s));
            System.out.println("Using charAt() method:"+charAtMethod(s));
            System.out.println("Using reverseRecursion() method:"+reverseRecursion(s));

        }


    }

