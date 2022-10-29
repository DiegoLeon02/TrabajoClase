/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;




public class stack<T> {
    
    
    /*
    ATRIBUTOS DE LA PILA
     */
    private node<T> top;

    // T value es como pasar int a o string jose. solo que estamos usando java genericts.
    public void push(T value) {

        node<T> newNode = new node<T>(value);
        if (top == null) {

            top = newNode;

        } else {

            newNode.setNext(top);
            top = newNode;

        }

    }

    //el va a retornar valor t o sea te puede ser cualquier int o strig o cualquier dato. java genericts
    public T pop() {
        node<T> popped_value = top;

        if (top != null) {
            top = top.getNext();
            return popped_value.getValue();

        } else {
            return null;

        }

    }

}
