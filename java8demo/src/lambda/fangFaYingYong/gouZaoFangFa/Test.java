package lambda.fangFaYingYong.gouZaoFangFa;

public class Test {

    public static void main(String[] args) {
        //太奇怪了！！！！ MyFunc1与MyClass 任何关系都没有 ，但是可以MyClass的实例可以转型为MyFunc1
        MyFunc1 myClassCons = MyClass :: new;
        MyClass mc = myClassCons.func(100);
        System.out.println("val in mc is: " + mc.getValue());
    }
}
