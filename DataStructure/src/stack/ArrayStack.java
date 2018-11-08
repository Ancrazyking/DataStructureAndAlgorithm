package stack;

/**
 * 基于数组的顺序栈
 *
 * @author afeng
 * @date 2018/11/3 20:56
 **/
public class ArrayStack
{
    private int[] arr;
    private int top;//栈顶指针

    /**
     * 默认栈大小为100
     * 指针指向-1
     */
    public ArrayStack()
    {
        arr = new int[100];
        top = -1;
    }

    /**
     * 自定义栈大小
     *
     * @param size
     */
    public ArrayStack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    /**
     * 压栈
     *
     * @param data
     */
    public void push(int data)
    {
        arr[++top] = data;
    }

    /**
     * 弹栈
     *
     * @return
     */
    public int pop()
    {

        return arr[top--];
    }

    /**
     * 获取栈顶元素
     *
     * @return
     */
    public int peek()
    {
        return arr[top];
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return top == -1;
    }

    /**
     * 判断栈是否满了
     *
     * @return
     */
    public boolean isFull()
    {
        return top == arr.length - 1;
    }


}
