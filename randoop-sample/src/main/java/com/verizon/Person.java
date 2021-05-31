package com.verizon;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayName() {
        System.out.println(this.firstName + this.lastName);
//        this.address.isValidateAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String f, String l, Address address) {
        this.lastName = l;
        this.firstName = f;
        address.isValidateAddress(address);
        System.out.println(address.getAddress1() + address.getZipCode());
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
