package linkedlist;

/**
 * 双向链表
 * 每个节点包含一个前驱指针previous和一个后继指针next
 *
 * @author afeng
 * @date 2018/11/11 20:21
 **/
public class DoubleLinkedList
{

    private Node head;

    //双向链表初始化
    public DoubleLinkedList()
    {
        head = null;
    }


    /**
     * 头节点后进行插入
     *
     * @param data
     */
    public void insertAfterHead(int data)
    {
        Node newNode = new Node(data);

        if (head != null)
        {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * 头节点后删除一个节点
     *
     * @return
     */
    public Node deleteAfterHead()
    {
        Node current = head;
        if (current == null)
        {
            return null;
        } else
        {   //设置头指针指向的第一个节点后的第二个节点的前驱为null
            head.next.previous = null;
            //将第二个节点指向head
            head = current.next;
        }
        return current;
    }

    /**
     * 显示方法
     */
    public void display()
    {
        Node current = head;
        while (current.next != null)
        {
            System.out.println(current.data + "\t");
            current = current.next;
        }
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
