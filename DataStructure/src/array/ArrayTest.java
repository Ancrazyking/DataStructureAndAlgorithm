package array;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Arrays;

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
        System.out.println("OrderArray");
        System.out.println("###################");


        OrderArray orderArray=new OrderArray();
        orderArray.insert(1);
        orderArray.insert(5);
        orderArray.insert(2);
        orderArray.insert(4);
        orderArray.insert(3);
        orderArray.display();  // 1 2 3 4 5

        System.out.println(orderArray.binarySearch(3));//2

        orderArray.delete(2);
        orderArray.display();

        orderArray.delete(3);
        orderArray.display();

        orderArray.delete(5);


    }


}
