package BaiTapLinkedList;

import java.util.LinkedList;

public class TrienKhaiLinkedList<E> {
    private Node head;
    private int number = 0;

    public TrienKhaiLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node() {
        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        number++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        number++;
    }

    //    public void addLast(E e){
//        heal.set(number, (E) e);
//    }
    public E remove(int index) {

        if (index < 0 || index > number) {
            throw new IndexOutOfBoundsException();
        } else {
            E result;
            if (index > 0) {
                Node temp = head;
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                result = (E) temp.next.data;
                if (temp.next.next != null) {
                    temp.next = temp.next.next; //delete middle
                } else {
                    temp.next = null; //if delete tail
                }
            } else {
                result = (E) head.data;
                head = head.next; //if delete head
            }
            number--;
            return result;
        }
    }

    public boolean remove(Object e) {

        if (this.indexOf((E) e) > -1) {
            return true;
        }
        return false;
    }

    public int size() {
        return number;
    }

    public E clone() {
        Node element = head;
        return (E) element.data;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public int indexOf(E o) {
        Node temp = head;
        int index = -1;
        while (temp != null) {
            index++;
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        number++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp;
    }

    public E getFirst() {

        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < number && temp.next != null; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = new Node();
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", number=" + number +
                '}';
    }
}

