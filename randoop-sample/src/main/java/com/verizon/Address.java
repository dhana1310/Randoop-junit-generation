package com.verizon;

public class Address {
    String address1;
    String zipCode;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String address1, String zipCode) {
        this.address1 = address1;
        this.zipCode = zipCode;
    }

    public boolean isValidateAddress(Address address) {
        if(address.getZipCode().length() == 5) {
            return true;
        }
        return false;
    }
}
