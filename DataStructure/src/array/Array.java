package array;

/**
 * @author afeng
 * @date 2018/11/7 8:39
 **/
public class Array
{

    private int[] arr;
    //数组的有效长度
    private int elements;


    public Array()
    {
        arr = new int[100];
    }

    public Array(int size)
    {
        arr = new int[size];
    }


    /**
     * 插入数据
     *
     * @param data
     */
    public void insert(int data)
    {
        arr[elements++] = data;
    }

    /**
     * 遍历数组
     */
    public void display()
    {
        for (int i = 0; i < elements; i++)
        {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }


    /**
     * 查找数据,根据值查找,返回索引
     *
     * @param data
     * @return
     */
    public int search(int data)
    {


        for (int i = 0; i < elements; i++)
        {
            if (arr[i] == data)
            {
                return i;
            }
        }
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
        if (index >= elements || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("当前索引不存在");
        } else
        {
            return arr[index];
        }

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
            throw new ArrayIndexOutOfBoundsException("当前索引不存在");
        } else
        {
            for (int i = index; i < elements - 1; i++)
            {
                arr[i] = arr[i + 1];
            }
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
            throw new ArrayIndexOutOfBoundsException("当前索引不存在");
        } else
        {
            arr[index] = newData;
        }

    }


}
