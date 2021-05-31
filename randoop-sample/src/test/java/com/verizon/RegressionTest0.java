package com.verizon;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.verizon.RandoopSubtraction randoopSubtraction0 = new com.verizon.RandoopSubtraction();
        java.lang.Class<?> wildcardClass1 = randoopSubtraction0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        java.lang.String str4 = address2.getAddress1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.verizon.RandoopSubtraction randoopSubtraction0 = new com.verizon.RandoopSubtraction();
        int int3 = randoopSubtraction0.subtract((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65) + "'", int3 == (-65));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.verizon.Person person3 = new com.verizon.Person("", "hi!", (java.lang.Integer) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        java.lang.String str4 = person3.getFirstName();
        person3.displayName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        com.verizon.Address address6 = new com.verizon.Address("hi!", "");
        address6.setZipCode("");
        person3.setAddress(address6);
        address6.address1 = "hi!";
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        com.verizon.Address address6 = new com.verizon.Address("", "hi!");
        java.lang.String str7 = address6.getAddress1();
        boolean boolean8 = address2.isValidateAddress(address6);
        java.lang.String str9 = address2.getAddress1();
        address2.setZipCode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setAge((java.lang.Integer) (-1));
        java.lang.String str6 = person3.getFirstName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address6 = person3.getAddress();
        java.lang.String str7 = person3.getFirstName();
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address6 = person3.getAddress();
        java.lang.String str7 = person3.getLastName();
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.verizon.Address address2 = new com.verizon.Address("hi!", "");
        address2.setZipCode("");
        java.lang.String str5 = address2.getAddress1();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address10 = new com.verizon.Address("", "hi!");
        java.lang.String str11 = address10.address1;
        address10.setAddress1("");
        person3.setName("hi!", "", address10);
        person3.setFirstName("");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        java.lang.String str4 = address2.getZipCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        com.verizon.Address address9 = new com.verizon.Address("", "hi!");
        java.lang.String str10 = address9.address1;
        com.verizon.Address address13 = new com.verizon.Address("", "hi!");
        java.lang.String str14 = address13.getAddress1();
        boolean boolean15 = address9.isValidateAddress(address13);
        java.lang.String str16 = address9.getAddress1();
        person3.setName("", "hi!", address9);
        com.verizon.Person person21 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str22 = person21.getLastName();
        com.verizon.Address address27 = new com.verizon.Address("", "hi!");
        java.lang.String str28 = address27.address1;
        com.verizon.Address address31 = new com.verizon.Address("", "hi!");
        java.lang.String str32 = address31.getAddress1();
        boolean boolean33 = address27.isValidateAddress(address31);
        java.lang.String str34 = address27.getAddress1();
        person21.setName("", "hi!", address27);
        com.verizon.Address address38 = new com.verizon.Address("hi!", "");
        address38.setZipCode("");
        java.lang.String str41 = address38.zipCode;
        person21.setAddress(address38);
        com.verizon.Address address45 = new com.verizon.Address("", "hi!");
        java.lang.String str46 = address45.address1;
        com.verizon.Address address49 = new com.verizon.Address("", "hi!");
        java.lang.String str50 = address49.getAddress1();
        boolean boolean51 = address45.isValidateAddress(address49);
        address45.zipCode = "";
        person21.setAddress(address45);
        person3.setAddress(address45);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        com.verizon.Address address4 = person3.getAddress();
        person3.displayName();
        com.verizon.Address address8 = new com.verizon.Address("", "hi!");
        java.lang.String str9 = address8.getAddress1();
        person3.setAddress(address8);
        java.lang.String str11 = person3.getLastName();
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.verizon.RandoopSubtraction randoopSubtraction0 = new com.verizon.RandoopSubtraction();
        int int3 = randoopSubtraction0.subtract((int) (short) 100, (-65));
        int int6 = randoopSubtraction0.subtract(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 165 + "'", int3 == 165);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.verizon.Address address2 = new com.verizon.Address("", "");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.verizon.RandoopSubtraction randoopSubtraction0 = new com.verizon.RandoopSubtraction();
        int int3 = randoopSubtraction0.subtract((int) (byte) -1, (int) (short) -1);
        int int6 = randoopSubtraction0.subtract((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.verizon.RandoopAddition randoopAddition0 = new com.verizon.RandoopAddition();
        int int4 = randoopAddition0.add((-1), (int) (short) -1, (int) (short) 1);
        int int8 = randoopAddition0.add(10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 108 + "'", int8 == 108);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        com.verizon.Address address6 = new com.verizon.Address("", "hi!");
        java.lang.String str7 = address6.getAddress1();
        boolean boolean8 = address2.isValidateAddress(address6);
        java.lang.String str9 = address6.zipCode;
        address6.setAddress1("hi!");
        com.verizon.Address address14 = new com.verizon.Address("hi!", "");
        address14.setZipCode("");
        address14.setZipCode("hi!");
        boolean boolean19 = address6.isValidateAddress(address14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        com.verizon.Address address9 = new com.verizon.Address("", "hi!");
        java.lang.String str10 = address9.address1;
        com.verizon.Address address13 = new com.verizon.Address("", "hi!");
        java.lang.String str14 = address13.getAddress1();
        boolean boolean15 = address9.isValidateAddress(address13);
        java.lang.String str16 = address9.getAddress1();
        person3.setName("", "hi!", address9);
        com.verizon.Address address20 = new com.verizon.Address("hi!", "");
        address20.setZipCode("");
        java.lang.String str23 = address20.zipCode;
        person3.setAddress(address20);
        java.lang.String str25 = address20.address1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        com.verizon.Address address9 = new com.verizon.Address("", "hi!");
        java.lang.String str10 = address9.address1;
        com.verizon.Address address13 = new com.verizon.Address("", "hi!");
        java.lang.String str14 = address13.getAddress1();
        boolean boolean15 = address9.isValidateAddress(address13);
        java.lang.String str16 = address9.getAddress1();
        person3.setName("", "hi!", address9);
        com.verizon.Address address20 = new com.verizon.Address("hi!", "");
        address20.setZipCode("");
        java.lang.String str23 = address20.zipCode;
        person3.setAddress(address20);
        address20.address1 = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.getAddress1();
        address2.zipCode = "hi!";
        java.lang.String str6 = address2.address1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address6 = person3.getAddress();
        person3.setLastName("hi!");
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        com.verizon.Address address4 = person3.getAddress();
        java.lang.String str5 = person3.getLastName();
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.displayName();
        person3.setAge((java.lang.Integer) (-1));
        com.verizon.Address address9 = new com.verizon.Address("hi!", "");
        address9.setZipCode("");
        person3.setAddress(address9);
        com.verizon.Address address15 = new com.verizon.Address("hi!", "");
        address15.setZipCode("hi!");
        boolean boolean18 = address9.isValidateAddress(address15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.verizon.Person person3 = new com.verizon.Person("", "", (java.lang.Integer) (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        address2.setAddress1("");
        java.lang.String str6 = address2.address1;
        address2.zipCode = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.verizon.Person person3 = new com.verizon.Person("", "hi!", (java.lang.Integer) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        java.lang.String str4 = person3.getFirstName();
        com.verizon.Address address7 = new com.verizon.Address("", "hi!");
        java.lang.String str8 = address7.address1;
        com.verizon.Address address11 = new com.verizon.Address("", "hi!");
        java.lang.String str12 = address11.getAddress1();
        boolean boolean13 = address7.isValidateAddress(address11);
        address7.zipCode = "";
        address7.setZipCode("hi!");
        person3.setAddress(address7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        java.lang.String str5 = person3.getLastName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.verizon.RandoopAddition randoopAddition0 = new com.verizon.RandoopAddition();
        int int4 = randoopAddition0.add(0, (int) (byte) -1, 0);
        int int8 = randoopAddition0.add((int) (byte) 10, (-1), 100);
        int int12 = randoopAddition0.add((int) (byte) -1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 109 + "'", int8 == 109);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        address2.setAddress1("");
        java.lang.String str6 = address2.address1;
        java.lang.String str7 = address2.address1;
        address2.setAddress1("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.displayName();
        person3.setAge((java.lang.Integer) (-1));
        com.verizon.Address address9 = new com.verizon.Address("hi!", "");
        address9.setZipCode("");
        person3.setAddress(address9);
        address9.setZipCode("");
        java.lang.Class<?> wildcardClass15 = address9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.verizon.Person person3 = new com.verizon.Person("", "", (java.lang.Integer) (-65));
        person3.setFirstName("hi!");
        com.verizon.Address address8 = new com.verizon.Address("hi!", "");
        address8.setZipCode("");
        java.lang.String str11 = address8.zipCode;
        person3.setAddress(address8);
        address8.zipCode = "";
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.getAddress1();
        java.lang.String str4 = address2.getZipCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address6 = person3.getAddress();
        person3.setFirstName("hi!");
        java.lang.String str9 = person3.getFirstName();
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        com.verizon.Address address9 = new com.verizon.Address("", "hi!");
        java.lang.String str10 = address9.address1;
        com.verizon.Address address13 = new com.verizon.Address("", "hi!");
        java.lang.String str14 = address13.getAddress1();
        boolean boolean15 = address9.isValidateAddress(address13);
        java.lang.String str16 = address9.getAddress1();
        person3.setName("", "hi!", address9);
        com.verizon.Address address20 = new com.verizon.Address("hi!", "");
        address20.setZipCode("");
        java.lang.String str23 = address20.zipCode;
        person3.setAddress(address20);
        com.verizon.Address address27 = new com.verizon.Address("", "hi!");
        java.lang.String str28 = address27.address1;
        com.verizon.Address address31 = new com.verizon.Address("", "hi!");
        java.lang.String str32 = address31.getAddress1();
        boolean boolean33 = address27.isValidateAddress(address31);
        address27.zipCode = "";
        person3.setAddress(address27);
        person3.setFirstName("");
        person3.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        person3.setLastName("hi!");
        com.verizon.Address address10 = new com.verizon.Address("", "hi!");
        java.lang.String str11 = address10.address1;
        address10.setAddress1("");
        person3.setName("hi!", "", address10);
        address10.setZipCode("hi!");
        address10.zipCode = "";
        java.lang.String str19 = address10.zipCode;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        com.verizon.Address address6 = new com.verizon.Address("", "hi!");
        java.lang.String str7 = address6.getAddress1();
        boolean boolean8 = address2.isValidateAddress(address6);
        address2.zipCode = "";
        address2.setZipCode("hi!");
        address2.address1 = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        address2.setAddress1("");
        address2.zipCode = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        person3.displayName();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        com.verizon.Address address6 = new com.verizon.Address("", "hi!");
        java.lang.String str7 = address6.getAddress1();
        boolean boolean8 = address2.isValidateAddress(address6);
        address2.zipCode = "";
        address2.setZipCode("hi!");
        java.lang.String str13 = address2.zipCode;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.verizon.RandoopSubtraction randoopSubtraction0 = new com.verizon.RandoopSubtraction();
        int int3 = randoopSubtraction0.subtract((int) (short) 100, (-65));
        int int6 = randoopSubtraction0.subtract((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 165 + "'", int3 == 165);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.verizon.Address address2 = new com.verizon.Address("", "hi!");
        java.lang.String str3 = address2.address1;
        com.verizon.Address address6 = new com.verizon.Address("", "hi!");
        java.lang.String str7 = address6.getAddress1();
        boolean boolean8 = address2.isValidateAddress(address6);
        address2.setZipCode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "", (java.lang.Integer) (-1));
        java.lang.String str4 = person3.getLastName();
        com.verizon.Address address9 = new com.verizon.Address("", "hi!");
        java.lang.String str10 = address9.address1;
        com.verizon.Address address13 = new com.verizon.Address("", "hi!");
        java.lang.String str14 = address13.getAddress1();
        boolean boolean15 = address9.isValidateAddress(address13);
        java.lang.String str16 = address9.getAddress1();
        person3.setName("", "hi!", address9);
        com.verizon.Address address20 = new com.verizon.Address("hi!", "");
        address20.setZipCode("");
        java.lang.String str23 = address20.zipCode;
        person3.setAddress(address20);
        person3.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.verizon.Person person3 = new com.verizon.Person("hi!", "hi!", (java.lang.Integer) 10);
        com.verizon.Address address6 = new com.verizon.Address("hi!", "");
        address6.setZipCode("");
        person3.setAddress(address6);
        address6.zipCode = "hi!";
    }
}

