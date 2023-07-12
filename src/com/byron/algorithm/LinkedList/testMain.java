package com.byron.algorithm.LinkedList;

public class testMain {
    public static void main(String[] args) {
        Linklist<String> StringList = new Linklist<>();
        //手动实现了arraylist了
        StringList.add("2121",0);
        StringList.add("xxx",1);
        StringList.add("head",0);
        StringList.add("tail",3);
        StringList.add("5354",4);
//        StringList.add("5354",4);
        StringList.add("lgiureoiaj4",5);
        System.out.println("before deletion"+"-".repeat(30));
        StringList.printList();
        System.out.println("after deletion"+"-".repeat(30));
        StringList.del("head");
        StringList.del("tail");
        StringList.printList();

        int search = StringList.search("x1xx");
        if (search != -1){
            System.out.println("data index is " + search);
        }else {
            System.out.println("search not found!");
        }


        int updata = StringList.updata("5354", "45454");
        if(updata != -1){
            System.out.println("update success! index is " + updata);
            StringList.printList();
        }else {
            System.out.println("update failure, the data is not found");
        }
    }

}
