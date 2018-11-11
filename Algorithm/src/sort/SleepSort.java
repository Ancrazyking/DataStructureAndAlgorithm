package sort;

/**
 * 一种很有意思的排序方式: 睡眠排序
 *
 *
 * @author afeng
 * @date 2018/11/9 14:11
 **/
public class SleepSort implements Runnable
{

    private String num;

    public SleepSort(int num)
    {
        this.num = num+"";
    }

    public static void main(String[] args)
    {
        int[] num = {10,9,8,7,6,5,4,3,2,1};
        for (int n : num)
        {
            new Thread(new SleepSort(n)).start();
        }
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(Integer.parseInt(num));
            System.out.print(num+"\t");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
