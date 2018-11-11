package linkedlist;

/**
 * 双向循环链表
 *
 * @author afeng
 * @date 2018/11/11 20:49
 **/
public class DoubleCircularLinkedList
{
    private Node head;
    private Node tail;

    //初始化双向循环链表
    public DoubleCircularLinkedList()
    {
        head = null;
        tail = null;
    }


    public static class Node
    {
        private int data;
        private Node previous;
        private Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
}
