package Collections_demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_Hashset {
    public static void main(String[] args) {
        System.out.println("Hash Set");

//        HashSet hs=new HashSet();
        HashSet<Integer> hs=new HashSet<Integer>();
        HashSet<Integer> hs1=new HashSet<Integer>();
       hs.add(34);
       hs.add(45);
       hs.add(1);
       hs.add(2);
       hs.add(null);

        System.out.println(hs);

        hs1.add(324);
        hs1.add(425);
        hs1.add(1);
        hs1.add(22);
        hs1.add(null);
        System.out.println(hs1);
//hs.remove(2);
hs.retainAll(hs1);

        System.out.println(hs);
//        System.out.println(hs);
//        hs.contains(1);
//        System.out.println(hs.contains(2));

        Iterator itr= hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        for(Object o:hs1){
//            System.out.println(o);
//        }
    }


}
