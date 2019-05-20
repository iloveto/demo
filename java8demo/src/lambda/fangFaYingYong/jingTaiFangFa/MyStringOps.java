package lambda.fangFaYingYong.jingTaiFangFa;

public class MyStringOps {
    public static String strReverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
