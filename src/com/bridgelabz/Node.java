package com.bridgelabz;
    public class Node <T> {
        /*
           Initializing Data and Node using Generics
         */
        T data;
        Node<T> next;

        public Node() {
        }
        public Node(T data) {
        /*
       Parameter Constructor
     */
            this.data = data;
        }
    }
