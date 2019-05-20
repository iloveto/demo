package lambda.fangFaYingYong.jingTaiFangFa;

public class Test {
    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "abcdefghijklmnopqrstuvwxyz";
        String newStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(newStr);
    }
}
