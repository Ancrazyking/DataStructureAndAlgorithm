package wordcount;

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

    public static void main(String[] args){
        int i;
        int[] arr={1,2,3,4,5};
        for(i=0;i<arr.length;i++){
            if(6==arr[i]){
                break;
            }
            System.out.println(i);
        }
        System.out.println("###################");
        System.out.println(i);

    }


}
