package linkedlist;

/**
 * 1)单链表的插入 删除 查找 操作
 * 2)链表中存储的int类型的数据
 *
 * @author afeng
 * @date 2018/11/10 8:43
 **/
public class SingleLinkedList
{

    private Node head = null;

    /**
     * 按值查找
     *
     * @param value
     * @return Node对象节点
     */
    public Node findByValue(int value)
    {
        //current临时指针
        Node current = head;
        while (current != null && current.data != value)
        {
            current = current.next;
        }
        return current;
    }

    /**
     * 按索引查找
     *
     * @param index
     * @return Node对象节点
     */
    public Node findByIndex(int index)
    {
        int pos = 0;//用于记录索引的位置
        Node current = head;
        while (current != null && pos != index)
        {
            current = current.next;
            pos++;
        }
        return current;
    }

    /**
     * 头节点后插入
     *
     * @param data int类型数据
     */
    public void insertAfterHead(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /***
     * 头节点后插入
     * @param newNode Node类型节点
     */
    public void insertAfterHead(Node newNode)
    {
        if (newNode == null)
        {
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    /**
     * 头节点后删除
     */
    public Node deleteAfterHead()
    {
        //要删除的节点
        Node temp = head;
        head = temp.next;
        return temp;
    }


    /**
     * 根据指定的值删除节点
     *
     * @param value
     * @return Node节点对象
     */
    public Node deleteByValue(int value)
    {
        Node current = head;
        Node previous = head;
        while (current.data != value)
        {
            if (current == null)
            {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == head)
        {
            head = head.next;
        } else
        {
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 遍历链表
     */
    public void display()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }

    }


    /**
     * 链表节点,静态内部类
     */
    public static class Node
    {
        private int data;
        private Node next;

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public Node(int data)
        {
            this.data = data;
        }

        public int getData()
        {
            return data;
        }
    }
}
