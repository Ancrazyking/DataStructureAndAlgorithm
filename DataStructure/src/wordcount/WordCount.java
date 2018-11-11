package wordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author afeng
 * @date 2018/11/8 19:07
 **/
public class WordCount
{
    public static void main(String[] args) throws Exception
    {

        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/wordcount.txt"));
        String firstLine = bufferedReader.readLine();
        list.add(firstLine);
        while (firstLine != null)
        {
            String[] line = bufferedReader.readLine().split(" ");
            for (String word : line)
            {
                list.add(word);
            }
            firstLine = bufferedReader.readLine();
        }

        System.out.println(list);
        for(String word:list){
            if(hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }else{
                hashMap.put(word,1);
            }
        }

        System.out.println(hashMap);

    }

}
