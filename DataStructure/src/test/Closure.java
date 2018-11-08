package test;

/**
 * @author afeng
 * @date 2018/11/7 22:02
 **/
public class Closure
{

    private static int s=1;

    public static int adds(int x){
        return x+s;
    }

    public static void display(String... args){

        for(String arg :args){
            System.out.println(arg);
        }

    }


}
