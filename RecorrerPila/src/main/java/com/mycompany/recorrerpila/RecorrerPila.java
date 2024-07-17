/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recorrerpila;

/**
 *
 * @author Acer
 */

class Nodo{
    String Valor;
    Nodo Down;
    
    public Nodo(String valor){
        this.Valor = valor;
    }
}

class Pila{
    private Nodo Top = null;
    
    public void push(Nodo nodo) {
        nodo.Down = this.Top;
        this.Top = nodo;
    }
    
    public Nodo pop(){
        Nodo ultimo = this.Top;
        this.Top = this.Top.Down;
        return ultimo;
    }
    
    public boolean isEmpty() {
        return this.Top == null;
    }
    
    public void AgregarPila(Nodo nodo, Pila pila){
        if(nodo == null){
            nodo = this.Top;
        }
        
        pila.push(new Nodo(nodo.Valor));
        
        if(nodo.Down == null){
            return;
        }
        
        this.AgregarPila(nodo.Down, pila);
    }
    
    public void MostrarValores(Nodo nodo){
        if(nodo == null){
            nodo = this.Top;
        }
        
        System.out.println(nodo.Valor);
        
        if(nodo.Down == null){
            return;
        }
        
        this.MostrarValores(nodo.Down);
    }
    
}

public class RecorrerPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Pila pila2 = new Pila();
        
        pila.push(new Nodo("Maria"));
        pila.push(new Nodo("Carlos"));
        pila.push(new Nodo("Karla"));
        pila.push(new Nodo("Alfredo"));
        
        pila.AgregarPila(null, pila2);
        
        pila2.MostrarValores(null);
    }
}
