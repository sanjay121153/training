package com.java.collection.test;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] as){
        TreeSet<Employee> treeSet=new TreeSet<>();
        treeSet.add(new Employee(1,"A"));
        treeSet.add(new Employee(2,"B"));
        treeSet.add(new Employee(3,"C"));
        treeSet.add(new Employee(4,"D"));

        System.out.print(treeSet);
    }
}

class Employee{
    private int id;
    private String name;

    public Employee(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
