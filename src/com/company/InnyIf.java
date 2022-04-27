package com.company;

import org.w3c.dom.ls.LSOutput;

public class InnyIf {

    public static void main(String[] args) {

        InnyIf innyIf = new InnyIf();
        int x = 1;

//        if (x < 5) System.out.println("x<5");
//        else System.out.println("x>5");
//
//        System.out.println("********");
//
//        String str = (x < 5) ? "x<5" : "x>5";
//        System.out.println(str);
//
//        System.out.println("********");
//
//        System.out.println((x < 5) ? "x<5" : "x>5");
//
//        System.out.println("********");
//
//        System.out.println((x < 5) ? innyIf.metoda1() : innyIf.metoda2());
//
//        System.out.println("********");
//
//        String str2 = innyIf.metoda3((x < 5) ? "x<5" : "x>5");
//        System.out.println("Metoda 3: " + str2);
//
//        System.out.println("********");
//
//        System.out.println(innyIf.metoda4(8));
//    }
//
//    public String metoda1() {
//        return "x<5";
//    }
//
//    public String metoda2() {
//        return "x>5";
//    }
//
//    public String metoda3(String str) {
//        return str;
//    }
//
//    public String metoda4(int x) {
//        return (x < 5) ? "x<5" : "x>5";
//    }
        String str = null;
        String nowyStr = (str != null) ? str : "Java";
        System.out.println(nowyStr);
    }
}
