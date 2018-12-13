package com.java.collection.test;

import java.util.*;

/**
 * first sort the emp objects based on first name.
 * if first name is empty or null sort all the objects based on lastname.
 * <p>
 * but first all the values should come for the first name then only lastName should be coming.
 */

public class SortEmployee {
    public static void main(String as[]) {
        List<Employee1> list = new ArrayList<>();
        Employee1 e1 = new Employee1("A", "B");
        Employee1 e2 = new Employee1("B", "C");
        Employee1 e3 = new Employee1("R", "T");
        Employee1 e4 = new Employee1("", "");
        Employee1 e5 = new Employee1("", "Y");
        Employee1 e6 = new Employee1("B", "");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        Comparator<Employee1> comparator = (emp1, emp2) -> {

            if (!emp1.getLastName().isEmpty() && !emp2.getLastName().isEmpty()) {
                return emp1.getLastName().compareTo(emp2.getLastName());
            } else if (emp1.getLastName().isEmpty()) {
                return 1;
            } else if (emp2.getLastName().isEmpty()) {
                return -1;
            } else {
                return emp2.getFirstName().compareTo(emp1.getFirstName());

            }
        };
        Collections.sort(list, comparator);

        System.out.println(list);

    }

}

class Employee1 {
    private String firstName;
    private String lastName;


    public Employee1(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "lastName='" + lastName + '\'' +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
