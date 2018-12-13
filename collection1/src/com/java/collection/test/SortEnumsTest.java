package com.java.collection.test;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class SortEnumsTest {
    public static void  main(String[] as){
        List<Ranks> set=new ArrayList<>();
        set.addAll(Arrays.asList(Ranks.values()));


        System.out.println(set);
        Collections.sort(set);
        System.out.println(set);

        TreeSet<Ranks> set2=new TreeSet<>(new RankComparator());
        set2.addAll(Arrays.asList(Ranks.values()));

        System.out.println(set2);

        List<Ranks> list=Arrays.asList(Ranks.values());
        Comparator<Ranks> comparator=(Ranks r1,Ranks r2)->r1.name().compareTo(r2.name());
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}

class RankComparator implements Comparator<Ranks>{
    public int compare(Ranks r1, Ranks r2){

        return r1.getRank()-r2.getRank();
    }
}


