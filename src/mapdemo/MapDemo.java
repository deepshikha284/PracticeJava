package mapdemo;
import java.util.*;
import java.util.Map.*;

public class MapDemo
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));


        hm.put(4,"E");
        hm.put(5,"F");
        //retrive all values from map
        for(Map.Entry<Integer,String> entry : hm.entrySet()){
           int k = entry.getKey();
           String v = entry.getValue();
           System.out.println(k + " " + v);

        }

        //retrieve first key value from map
        Iterator<Map.Entry<Integer,String>> itr = hm.entrySet().iterator();
        Map.Entry<Integer,String> entry = itr.next();
        int k = entry.getKey();
        String v = entry.getValue();
        System.out.println("\nFirst key value pairs : "+k + " " + v);
    }
}
