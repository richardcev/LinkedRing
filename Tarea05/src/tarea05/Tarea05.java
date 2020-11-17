/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.util.ArrayDeque;

/**
 *
 * @author PC
 */
public class Tarea05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayDeque<Integer> pila=new ArrayDeque<>();
        pila.push(9);
        pila.push(7);
        pila.push(4);
        pila.push(3);
        pila.push(8);
        LinkedRing lista= new LinkedRing();
        lista.addAll(pila);
        lista.getTailNodo().getElement();
        lista.mostrarLista();
        System.out.println();
        System.out.println("TAIL: "+lista.getTailNodo().getElement() );
        
        
        
     
       

       

        
        


            
}
}
