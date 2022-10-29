/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 
 * @param <T>
 */
public class QUEUE<T> {

    private node<T> head;        //ATRIBUTOS, OBJETOS DE TIPO NODO Y GENERICOS PARA DEFINIRLE EL TIPO DE DATOS QUE VAMOS A GUARDAR
    private node<T> tail;

    /**
     * METODO PARA GUARDAR DARO
     *
     * @param value
     */
    public void enqueue(T value) {  // ESE T VALUE PUEDE SAR CUALQUIER DATO, YA SEA INTEGER, STRING
        node<T> newNode = new node<T>(value);  // ACA CREAMOS EL NUEVO NODO

        if (head == null) {  // SI LA COLA ESTA VACIA
            head = newNode;
            tail = newNode;

        } else {

            tail.setNext(newNode);     // EL NODO HJACE REFERENCIA AL NUEVO
            tail = newNode;            // EL TAIL APUNTA AL NUEVO NODO

        }

    }

    public node<T> dequeque() {

        if (head == null) {
            System.out.println("La cola esta vacia");
            return null;

        } else {

            node<T> firsInQueue = head; // ya el heado existe, entonces se lo asignamos a la variable
            head = head.getNext(); //le pasamos el head al siguiente nodo
            return firsInQueue;

        }

    }

    public node<T> findbyIndex(int i) {

        if (head == null) {
            System.out.println("La cola esta vacia");
            return null;

        }
        node<T> temp = head; // creamos un auxilia o temporal del head

        while (temp.getNext() != null && i != 0) {

            temp = temp.getNext();
            i--;

        }
        if (i == 0) {

            return temp;  //aca retornamos el nodo no el valor, el valor lo obtenemos en el main

        } else {

            return null;
        }

    }

}
