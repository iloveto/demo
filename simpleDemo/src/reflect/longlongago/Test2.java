package reflect.longlongago;

import java.util.Random;

    class Initable

    {

        static final int staticFinal = 47;

        static final int staticFinal1 = Test2.rand.nextInt(1000);

        static

        {

            System.out.println("Initializing Initable");

        }

        public Initable()

        {

            System.out.println("Create Initable");

        }

    }



    class Initable2

    {

        static  int staticNonFinal = 74;

        static

        {

            System.out.println("Initializing Initable2");

        }

        public Initable2()

        {

            System.out.println("Create Initable2");

        }

    }



    class Initable3

    {

        static  int staticNonFinal = 255;

        static

        {

            System.out.println("Initializing Initable3");

        }

        public Initable3()

        {

            System.out.println("Create Initable3");

        }

    }



    public class Test2

    {

        public static Random rand = new Random(47);

        public static void main(String[] str) throws Exception

        {

            Class initable = Initable.class;

            System.out.println("after Create Initable ref");

            System.out.println(Initable.staticFinal);

            System.out.println(Initable.staticFinal1);

            System.out.println(Initable2.staticNonFinal);



//            Class initable3 = Class.forName("reflect.Initable3");//一定要带上完整的包路径

            System.out.println("after Create Initable3 ref");

            System.out.println(Initable3.staticNonFinal);



        }

    }

