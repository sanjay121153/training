package com.java.collection.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SortEnumsTest {
    public static void  main(String[] as){
        TreeSet<Ranks> set=new TreeSet<>();
        set.addAll(Arrays.asList(Ranks.values()));



        System.out.println(set);


        TreeSet<Ranks> set2=new TreeSet<>(new RankComparator());
        set2.addAll(Arrays.asList(Ranks.values()));

        System.out.println(set2);

        System.out.println(2<<5);
        System.out.println(123345767>>>16);
    }
}

class RankComparator implements Comparator<Ranks>{
    public int compare(Ranks r1, Ranks r2){

        return r1.getRank()-r2.getRank();
    }
}
