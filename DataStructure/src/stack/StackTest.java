package stack;

import java.util.Stack;

/**
 * @author afeng
 * @date 2018/11/3 21:02
 **/
public class StackTest
{

    public static void main(String[] args)
    {
        ArrayStack stack = new ArrayStack();
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());


        ArrayStack stack1 = new ArrayStack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.isFull());

    }


}
