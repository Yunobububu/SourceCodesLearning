package com.lvjinke.bit;

public class Test {

    public static void main(String[] args){

        ArrayList<Integer> array = new ArrayList<>(10);
        int size = array.size();
        System.out.println(size);
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(3);
        array.add(1);
        size = array.size();
        System.out.println(size);
    }
}
