package audition;

import java.util.Scanner;

/**
 * @author DreamMaster
 */
public class BianChen {
    public static void main(String[] args) {
        System.out.println("请输入序号：");
        Scanner s = new Scanner(System.in);
        switch (s.nextInt()) {
            //1 兔子问题
            case 1:rabbit();break;
            //2 求素数
            case 2:primeNumber();break;
            //3 水仙花数
            case 3:water();break;
            //4 最大公约数与最小公倍数
            case 4:greatestCommonDivisor();break;
            default:
                System.out.println("123");
        }
    }

    /**
     * 兔子问题
     * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
     * 假如兔子都不死，问每个月的兔子对数为多少？
     * 兔子的规律为数列1,1,2,3,5,8,13,21....
     */
    static void rabbit(){
        System.out.println("请输入月份：");
        Scanner s = new Scanner(System.in);
        int num = f(s.nextInt());
        System.out.println(num);
    }

    static int f(int month){
        int num = 0;
        if(month>=3){
            num = f(month-1)+f(month-2);
        }else if(month<=3&& month>0){
            num = 1;
        }
        return num;
    }

    /**
     * 题目：判断101-200之间有多少个素数，并输出所有素数。
     * 解析：素数：只能被1或本身整除的数，如：3,5,7,11,131...
     * 求素数
     */
    static void primeNumber() {
        int count = 0;
        loop:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
//                System.out.println("i:"+i+",j:"+j+",i % j ="+(i % j) +",Math.sqrt(i):"+Math.sqrt(i));
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.println(i+"是素数");
            count++;
        }
        System.out.println(count);
    }

    /**
     * 打印出所有的"水仙花数"
     */
    static void water(){
        for (int i = 100; i < 999; i++) {
            int a = i/100;
            int b = (i-a*100)/10;
            int c = i-a*100-b*10;
            if (i == (a * a * a + b * b*b + c*c*c)) {
                System.out.println(i);
            }
        }
    }

    /**
     * 正整数分解质因数,例如：输入90,打印出90=2*3*3*5。
     */
    static void fenJieZhiYinShu() {

    }

    /**
     * 最大公约数和最小公倍数。 求最小公倍数，先求最大公约数
     * 设两数为a、b(b<a)，求它们最大公约数(a、b)的步骤如下：用a/b，得a/b=q......r1(0≤r)。若r1=0，则(a，b)=b；
     * 若r1≠0，则再用b/r1，得b/r1=q......r2 (0≤r2).若r2=0，则(a，b)=r1，若r2≠0，则继续用r1/r2,……如此下去，直到能整除为止。其最后一个非零余数即为(a，b)。
     */
    static void greatestCommonDivisor(){
        System.out.println("请输入a：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入b：");
        int b = new Scanner(System.in).nextInt();
        int max = divide(a,b);
        System.out.println("最小公倍数:"+a*b/max);
    }

    static int divide(int a, int b) {
        int r1= a%b ;
        int r2;
        int max = 0;
        if (r1 == 0) {
            System.out.println(b+"是最大公约数");
            max = b;
        } else {
            r2 = b%r1;
            if (r2 == 0) {
                System.out.println(r1+"是最大公约数");
                max = r1;
            }else{
                max = divide(r1, r2);
            }
        }
        return max;
    }

    /**
     * 输入一行字符串，统计出它的字母、数字、空格、其他字符的数量
     */
    static void count(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

    }
}
