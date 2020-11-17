/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 *
 * @author PC
 */
public class LinkedRing<E> {
    public class Node<E>{
        private Node<E> next;
        private Node<E> previous;
        private Node<E> ahead;
        private E element;
        public Node(Node<E> n, Node<E> p, Node<E> a,E e){
            next=n;
            previous=p;
            ahead=a;
            element=e;      
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getAhead() {
            return ahead;
        }

        public void setAhead(Node<E> ahead) {
            this.ahead = ahead;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
        
    }
    private Node<E> tail= null;
    private int size=0;
    public boolean isEmpty(){
        return size==0;
    }
    public void addAll(ArrayDeque<E> pila){
        int n= pila.size();
        for(E element:pila){
            if(size==0){
                tail= new Node<>(null,null,null,element);
                tail.setNext(tail);
                tail.setPrevious(tail);
            }
            else{
                Node<E> newest= new Node<>(tail.getNext(),tail,null,element);
                tail.setNext(newest);
                tail=newest;
            }
            size++;
        }
        if(size%2!=0){
            tail.getNext().setPrevious(tail.previous);
            tail.getPrevious().setNext(tail.next);
            tail= tail.getPrevious();
            size--;
        }
        Node<E> nodo= tail.next;
        Node<E> frente=tail.next;
        
        do{
            for(int i=0;i<size/2;i++){
                frente= frente.next;
            }
            nodo.setAhead(frente);
            frente=nodo.next;
            nodo=nodo.next;
        }
        while(nodo!=tail.next);

      
    }

    public Node<E> getTailNodo() {
        return tail;
    }
    public Node<E> getNext(){
        return tail.getNext();
    }


    public int getSize() {
        return size;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    public LinkedRing(){};
    
    public void mostrarLista(){
        Node<E> recorrer= tail.next;
        do{
            System.out.print("["+recorrer.getElement()+"]  ");
            recorrer=recorrer.getNext();
            
        }
        while(recorrer!=tail.next);
    }
    

    

    
    
}
