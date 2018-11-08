package array;


/**
 * @author afeng
 * @date 2018/11/7 8:44
 **/
public class OrderArray
{
    private int[] arr;

    //表示有效数据的长度
    private int elements;


    public OrderArray()
    {
        arr = new int[100];
    }


    public OrderArray(int size)
    {
        arr = new int[size];
    }


    /**
     * 添加数据
     *
     * @param data
     */
    public void insert(int data)
    {
        int i;
        for (i = 0; i < elements; i++)
        {
            if (arr[i] > data)
            {
                break;
            }
        }
        //需要插入元素的所有值向后移动一位
        for (int j = elements; j > i; j--)
        {
            arr[j] = arr[j - 1];
        }
        arr[i] = data;
        elements++;
    }

    /**
     * 遍历数组
     */
    public void display()
    {
        System.out.print("[");
        for (int i = 0; i < elements; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * 查找数据,返回索引
     *
     * @param data
     * @return
     */
    public int search(int data)
    {

        return 0;

    }


    /**
     * 二分查找返回索引
     *
     * @param data
     * @return
     */
    public int binarySearch(int data)
    {


        return 0;
    }


    /**
     * 根据索引查找数据
     *
     * @param index
     * @return
     */
    public int get(int index)
    {

        return 0;
    }


    /**
     * 根据索引删除数据
     *
     * @param index
     */
    public void delete(int index)
    {

    }


    /**
     * 根据索引修改,更新数据
     *
     * @param index
     * @param newData
     */
    public void change(int index, int newData)
    {
        if (index >= elements || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("当前索引不存在!");
        } else
        {
            arr[index] = newData;
        }
    }


}
