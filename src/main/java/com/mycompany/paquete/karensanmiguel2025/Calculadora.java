/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paquete.karensanmiguel2025;

import java.util.Stack;

public class Calculadora {
 private int suma;
 private Stack<String> pilaDeshacer;
 private Stack<String> pilaRehacer;
 private Stack<String> pilaResultados;

    public Calculadora() {
        this.suma =0;
        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();
        this.pilaResultados = new Stack<>();
    }

    public void sumar (int numero){
 suma = numero+suma;
 suma =pilaResultados.push(suma);
 pilaDeshacer.clear();
 }
  public void historial (){
     System.out.println("El resultado de la suma actual es: "+ suma);
 }
 public void Deshacer (){
 
 if(!pilaDeshacer.isEmpty()){
 
     pilaDeshacer.push(suma);
     suma = pilaDeshacer.pop();
     System.out.println(" Deshacer: "+suma);
 
 } else {
     System.out.println(" No hay acciones para deshacer. ");
 }
 
 }
 public void Rehacer (){
 
 if(!pilaRehacer.isEmpty()){
 
     pilaRehacer.push(suma);
     suma = pilaRehacer.push(suma);
     System.out.println(" Rehacer: "+suma);
 
 } else {
     System.out.println(" No hay acciones para Rehacer. ");
 }
 }
     
 }
 
 

 
 

