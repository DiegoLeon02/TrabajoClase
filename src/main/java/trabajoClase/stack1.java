/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;


public class stack1<T> {
    
    
    
    private node<T> top;
    
     public void push(T value) {

        node<T> newNode = new node<T>(value);
        if (top == null) {

            top = newNode;

        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }
     
     public T pop() {
        node<T> popped_value = top;

        if (top != null) {
            top = top.getNext();
            return popped_value.getValue();

        } else {
            return null;

        }

    }
     
     
     // METODO PARA ENCONTRAR UN NUMERO Y QUE RETORNE VERDADERO SI LO ENCONTRO 
     public boolean encuentra(T x){
        
         boolean existe = false;
         
         while(existe != true && top != null){
             
             if(x == top.getValue()){
                 
                 existe = true;
                 
             }else{
                 
                 top = top.getNext();

                 
             }
         
         }
        
          return existe;
         
     }
    
    
    
    
    
    
    
    
    
    
    
    
}
