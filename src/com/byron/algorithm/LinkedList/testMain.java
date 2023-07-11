package com.byron.algorithm.LinkedList;

import java.util.ArrayList;

public class testMain<T> {
    public static void main(String[] args) {
        Linklist<String> StringList = new Linklist<>();
        ArrayList<String> arrayList = new ArrayList<>();
        //手动实现了arraylist了
        StringList.add("2121",0);
        StringList.add("xxx",1);
        StringList.add("head",0);
        StringList.add("tail",3);
        StringList.add("5354",4);
        StringList.add("5354",5);
        StringList.add("lgiureoiaj4",5);
        StringList.printList();
    }

}
