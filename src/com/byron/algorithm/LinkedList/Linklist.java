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
                tail = newNode;
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
        // insert in list
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
        System.out.println("null");
        System.out.println(this.size);
    }

    public void del(T data){
        //after delete head node, if last one is head node so we need set tail == head
        if(this.head != null && this.head.data == data){
            head = head.next;
            size--;
            if(size==0){
                tail = head;
            }
            //delete node of list
        }else {
            Node<T> prev = head;
            Node<T> cur = head;
            while (prev != null && cur != null){
                if(cur.data == data){
                    //del last element
                    if(cur == tail){
                        tail = prev;
                    }
                    prev.next=cur.next;
                    this.size--;
                    return;
                }
                //if cur.data !=data move prev and cur
                prev = cur;
                cur = cur.next;
            }
        }
    }

    public int search(T data){
        Node<T> cur = this.head;
        for(int index=0;cur!=null;index++){
            if(cur.data == data){
                return index;
            }
            cur = cur.next;
        }
        return -1;
    }

    public int updata(T oldData,T newData){
        Node<T> cur = head;
        for (int i = 0; cur != null; i++) {
            if(cur.data == oldData){
                cur.data = newData;
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }
}
