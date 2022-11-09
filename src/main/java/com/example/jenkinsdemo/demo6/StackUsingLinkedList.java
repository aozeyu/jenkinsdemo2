package com.example.jenkinsdemo.demo6;

/**
 * @author yaozeyu
 */
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.push(100);
        stack.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node node;

    void push(int data) {
        if (isEmpty()) {
            this.node = new Node(data);
        }else {
            //交换数据
            Node temp = new Node(data);
            temp.next = this.node;
            this.node = temp;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Can't perform pop on a empty stack");
        }else {
            this.node =this.node.next;
        }
    }

    boolean isEmpty() {
        return node == null;
    }

    void display() {
        System.out.println("Display stacks elements");
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = node;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
