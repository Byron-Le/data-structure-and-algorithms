package com.byron.algorithm.LinkedList;

public class Linklist<T> {
    Node<T> head = null;
    Node<T> tail = null;
    int size = 0;

    public void add(T data,int position){
        Node<T> newNode = new Node<>(data);
        Node<T> prev;
        //position > size invaild
        if(position > this.size){
            System.out.println("position is invalid");
            return;
        }
        //add head node
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            //null Linklist
            if (this.size == 0) {
                head = tail = newNode;
            }
            this.size++;
            //tail insert
        } else if (position == this.size) {
            if(tail == null){
                tail = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        // mid insert
        else {
            // search previousIndex from head
            prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }


    public void printList(){
        Node<T> cur = this.head;
        while (cur != null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        if(cur == null){
            System.out.println("null");
        }
        System.out.println(this.size);
    }

    public void del(T data){
        if(){

        }
    }
}
