package week3.dsa_stack_queue.ex_tree_map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args){
        String str = "hello. Words hello, the. words, ";
        str = str.replace(",","");
        str = str.replace(".","") ;
        String[] arr = str.split(" ");
        String key="";
        int value;
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            key = arr[i].toLowerCase();
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value+1);
            } else{
                map.put(key, 1);
            }
        }
       // duyet in tree
        Object obj = new Object();
        Set set = map.keySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            key=(String)i.next();
            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
        }
    }
}
