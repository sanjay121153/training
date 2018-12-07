package Generics;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeExample {

   private List<? super RegularEmployee>  process(List<? super RegularEmployee> list){
        return list;
    }

    private List<? extends Person>  process1(List<? extends Person> list){
        return list;
    }

    public static void main(String as[]){
        SuperTypeExample ex=new SuperTypeExample();
        List<Person> persons=new ArrayList<>();
        List<Employee> employees=new ArrayList<>();
        List<RegularEmployee> regularEmployees=new ArrayList<>();
        List<? super RegularEmployee> list1=ex.process(persons);
        List<? super RegularEmployee> list2=ex.process(employees);
        list1=list2;

        List<? extends  Person> list3=ex.process1(persons);
        List<? extends  Person> list4=ex.process1(employees);

        list3=list4;

    }

}


class Person{

}
class Employee extends Person{

}

class RegularEmployee extends Employee{

}