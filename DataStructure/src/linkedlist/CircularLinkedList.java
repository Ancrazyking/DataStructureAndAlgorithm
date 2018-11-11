package linkedlist;

/**
 * 循环链表(首尾相连的链表) 头节点与尾节点相连
 * 尾节点的指针指向头节点
 *
 * @author afeng
 * @date 2018/11/10 11:05
 **/
public class CircularLinkedList
{

    private Node head;//头节点
    private Node tail;//尾节点

    //链表初始化
    public CircularLinkedList()
    {
        head = null;
        tail = null;
    }


    /**
     * 判断循环链表是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return (head == null);
    }

    /**
     * 插入一个节点,头节点后进行插入
     * 尾节点指针指向头节点
     *
     * @param data
     */
    public void insertAfterHead(int data)
    {
        Node newNode = new Node(data);
        //如果该链表是空,则将尾节点赋予头节点
        //将头节点指向该newNode
        if (isEmpty())
        {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }


    /**
     * 插入一个节点,尾节点后进行插入
     *
     * @param data
     */
    public void insertAfterTail(int data)
    {
        Node newNode = new Node(data);
        if (isEmpty())
        {
            head = newNode;
        } else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }


    /**
     * 遍历链表
     */
    public void display()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + "/t");
            current = current.next;
        }
    }

    /**
     * 删除头节点后的一个节点
     *
     * @return
     */
    public Node deleteAfterHead()
    {
        Node current = head;
        //如果头节点后只有一个节点,当删除该节点时,则链表为空
        if (head.next == null)
        {
            tail = null;
        }
        head = current.next;
        return current;
    }

    /**
     * 按值查找
     *
     * @param data
     * @return
     */
    public Node find(int data)
    {
        Node current = head;
        while (current.data != data)
        {

            if (current.next == null)
            {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 根据值来删除节点
     *
     * @param data
     * @return
     */
    public Node delete(int data)
    {
        Node current = head;
        Node previous = head;
        while (current.data != data)
        {
            if (current.next == null)
            {
                return null;
            }
            previous = current;
            current = current.next;
        }
        //如果要删除的节点是头节点的
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
     * 链表节点,静态内部类
     */
    public static class Node
    {
        private int data;
        private Node next;

        public Node(int data, Node node)
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
