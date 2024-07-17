/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mostrarlistacircular;


class Nodo{
    String Valor;
    Nodo Siguiente;
    
    public Nodo(String valor){
        this.Valor = valor;
    }
}

class Lista{
    private Nodo L = null;
    private Nodo aux = null;
    
    public void Agregar(Nodo nodo) {
        if(L == null){
            L = nodo;
            L.Siguiente = L;
        }else{
            aux = L;
            while(aux.Siguiente != L){
                aux = aux.Siguiente;
            }
            aux.Siguiente = nodo;
            nodo.Siguiente = L;
        }
    }
    
    public String ObtenerValores(Nodo nodo){
        if(nodo == null){
            nodo = L;
        }
        
        if(nodo.Siguiente == L){
            return nodo.Valor;
        }
        
        return nodo.Valor + " " + ObtenerValores(nodo.Siguiente);
    }
    
}

/**
 *
 * @author Acer
 */
public class MostrarListaCircular {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.Agregar(new Nodo("Hola"));
        lista.Agregar(new Nodo("como"));
        lista.Agregar(new Nodo("estas"));
        lista.Agregar(new Nodo("?"));
        
        String valor = lista.ObtenerValores(null);
        System.out.println(valor);
    }
}
