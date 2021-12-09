package com.github.vasiljeu95.tmslesson5;

import java.util.Scanner;

public class TMSLesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();
        B b = new B();
        A ab = new B();
        A abc = new A();
        //B abcd = new A();
        a.print();
        b.print();
        ab.print();
        abc.print();
    }
}

class A {
    public String text = "text_text_text";
    public void print() {
        System.out.println(5);
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println(text);
        System.out.println(10);
    }
}

