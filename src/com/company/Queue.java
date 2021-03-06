package com.company;

public class Queue {
    static int amount = 5000;
    //Represent a node of the singly linked list
    public static class QNode {
        private int data;
        private QNode next;

        //Parameter and Default Constructors of QNode
        public QNode(int x) {
            this.data = x;
            this.next = null;
        }
        public QNode(){
        }
    }

    //Represent the 'Q Front and Rear Pointers for the EnQue and DeQue' as of the singly linked list
    public QNode front = null;
    public QNode rear = null;

    //Method to push int element in the Queue using front rear
    public void withDurandDeposits(int x){
        QNode node = new QNode(x);
        if (front == null){
            System.out.println("Balance is Underflow and Empty");
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
        System.out.println("Successfully withDraw and Deposit the data : " + x);
    }

    /// Method to display Queue in First In First Out Order
    public void display() {
        if (front == null)
            System.out.println("No withDraws and Deposits is Empty");
        QNode temp = new QNode();
        temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            amount = amount + (temp.data);
            temp = temp.next;
        }
        System.out.println("Total Balance is "+ amount);
    }

    //Method to push int element in the DeQue using front rear
    public void withDrawAll(){
        if (front == null){
            System.out.println("Queue is Balance Underflow and Empty");
            return;
        }
        while (front != null){
            QNode temp = front;
            System.out.println("Successfully withDraws the data : " + front.data);
            front = front.next;
        }
        rear = null;
    }

}
