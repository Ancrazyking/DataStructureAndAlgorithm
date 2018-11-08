package array;

/**
 * @author afeng
 * @date 2018/11/7 9:33
 **/
public class ArrayTest
{
    public static void main(String[] args)
    {
        Array array = new Array();
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);

        array.display();


        array.delete(0);
        System.out.println("###################");

        array.display();

        System.out.println(array.get(0));


        array.change(0,1);
        System.out.println("###################");
        array.display();

    }


}
