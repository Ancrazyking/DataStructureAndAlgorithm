package queue;

/**
 * 基于数组的顺序队列
 *
 * @author afeng
 * @date 2018/11/3 21:07
 **/
public class ArrayQueue
{
    private int[] arr;
    private int head;//头指针
    private int tail;//尾指针


    /**
     * 默认队列大小
     */
    public ArrayQueue()
    {
        arr = new int[100];
        head = 0;
        tail = -1;

    }

    /**
     * 自定义队列大小
     *
     * @param size
     */
    public ArrayQueue(int size)
    {
        arr = new int[size];
        head = 0;
        tail = -1;
    }

    /**
     * 入队
     * 从队尾入队
     *
     * @param data
     */
    public void enqueue(int data)
    {
        arr[++tail] = data;
    }

    /**
     * 出队
     * 从队头出队
     *
     * @return
     */
    public int dequeue()
    {
        return arr[head++];
    }

    /**
     * 返回队头元素
     *
     * @return
     */
    public int peek()
    {
        return arr[head];
    }

    /**
     * 判断队列是否满
     * ?有问题
     *
     * @return
     */
    public boolean isFull()
    {
        return tail + head == arr.length - 1;
    }


    /**
     * 判断队列是否为空
     *
     * @return
     */

    public boolean isEmpty()
    {
        boolean isEmpty = (tail + 1 == head);
        if (isEmpty)
        {
            tail = -1;
            head = 0;
        }
        return isEmpty;
    }
}
