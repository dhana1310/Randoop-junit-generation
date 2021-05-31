package com.verizon;

import com.verizon.multiply.RandoopMultiply;

public class Randoop {

    public static void main(String[] args) {
        RandoopAddition randoopAddition = new RandoopAddition();
        randoopAddition.add(1, 2, 3);
        RandoopMultiply rm = new RandoopMultiply();
        Class cls = rm.getClass();

        // returns the canonical name of the underlying class if it exists
/*
        System.out.println("Class = " + cls.getCanonicalName());
        System.out.println("Class = " + cls.getName());
        System.out.println("Class = " + cls.getSimpleName());
        System.out.println("Class = " + cls.getTypeName());
        System.out.println("Class = " + cls.getPackage().getName());
*/
        Person p = new Person("dhana", "sharma", 26);
        p.setAddress(new Address("111", "12345"));
        System.out.println(p.getAddress().isValidateAddress(p.getAddress()));
    }
}
