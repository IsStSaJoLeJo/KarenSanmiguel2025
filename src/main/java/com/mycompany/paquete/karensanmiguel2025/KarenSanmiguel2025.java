/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paquete.karensanmiguel2025;

import java.util.Stack;

/**
 *
 * @author DELL
 */
public class KarenSanmiguel2025 {

    public static void main(String[] args) {
         Stack<Integer> pila = new Stack<> ();
        
        System.out.println("Menu");
        
        switch (var){
         case 1: "1. Sumar";
            pila.push(10);
            pila.push(20);
     
      System.out.println("Los elementos que se van a sumar son:"+pila);
         break;
         case 2: "2. Deshacer";
           int elementoEliminado =pila.pop();
        System.out.println("Elemento eliminado: "+elementoEliminado);
         break;
         case 3: "3. Rehacer";
         int elementoAgregado =pila.push(70);
             System.out.println("Elemento agregado"+elementoAgregado);
         break;
         case 4: "4. Mostrar el resultado actual";
         int elementoResultado =pila.peek();
             System.out.println("Resultado actual:"+elementoResultado);
         break;
         case 5: "5. Salir";  
        break;
    default:
        throw new AssertionError();
}
 
    }
}
