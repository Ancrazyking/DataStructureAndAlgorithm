package array;


/**
 * @author afeng
 * @date 2018/11/7 8:44
 **/
public class OrderArray
{
    private int[] arr;

    //表示数组的有效数据的长度
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
     * 遍历有效数据得到比
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
     * 按值查找,返回索引
     *
     * @param data
     * @return
     */
    public int search(int data)
    {
        int i;
        //遍历有效数据,如果有返回索引
        for (i = 0; i < elements; i++)
        {
            if (data == arr[i])
            {
                return i;
            }
        }
        //数组无该元素返回-1
        return -1;

    }

    /**
     * 二分查找返回索引
     *
     * @param data
     * @return
     */
    public int binarySearch(int data)
    {
        //中间索引
        int middle = 0;
        //起始索引
        int start = 0;
        //结束索引
        int end = elements - 1;

        //循环条件  当起始<=结束
        while (start <= end)
        {
            middle = (start + end) / 2;

            if (data > arr[middle])
            {
                start = middle + 1;
            } else if (data < arr[middle])
            {
                end = middle - 1;
            } else
            {
                return middle;
            }
        }
        //查找不到,返回-1
        return -1;
    }


    /**
     * 根据索引查找数据
     *
     * @param index
     * @return
     */
    public int get(int index)
    {

        return arr[index];
    }


    /**
     * 根据索引删除数据
     *
     * @param index
     */
    public void delete(int index)
    {
        if (index >= elements || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("当前索引不存在!");
        }
        for (int i = index; i < elements - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        elements--;
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
