/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author diego
 */
public class Arbol {
    
    private NodoArbol raiz;
    private int altura;
    
 public void inserta (int value){
        if (raiz== null){
            raiz= new NodoArbol(value);
    } else{
    insertar(raiz,value);
}}
    

public void insertar(NodoArbol node,int value){
    if (value <= node.getId()){
        if (node.getHijoIzq() == null){
            node.setHijoIzq(new NodoArbol(value));
        }else{
            insertar(node.getHijoIzq(), value);
        }
        }else{
               if (node.getHijoDer() == null){
            node.setHijoDer(new NodoArbol(value));
        
                }else {
                
                }     
                 insertar(node.getHijoDer(),value);       
                        }
    }


public void inOrden() {
    if( raiz!=null){
        inOrdenRecorrer(raiz);
    
    }else{
        System.out.println("Arbol esta vacio");
    }
}

private void inOrdenRecorrer(NodoArbol node){
    
    if (node !=null){
        inOrdenRecorrer(node.getHijoIzq());
        System.out.println(node.getId() + " , ");
        inOrdenRecorrer(node.getHijoDer());
        
    }
    
    
}

private void retornarAltura(NodoArbol node, int nivel){

if (node != null){
    retornarAltura(node.getHijoIzq(), nivel + 1);
    if (nivel > altura){
        altura = nivel;
    }
    System.out.println("En este momento gire a la derecha"+ node.getId());
    retornarAltura(node.getHijoDer(), nivel + 1);
    
}    
    

}
public int retornarAltura() {
    altura= 0;
    retornarAltura(raiz,1);
    System.out.println(altura);
    return altura;
}

}
    
