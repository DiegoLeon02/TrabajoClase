/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author diego
 */
public class ListaCircular {
       private node<Persona> cabeza;
private node<Persona> tail;
       
       public void insertar(Persona Value) {
        node<Persona> nuevoNodo = new node<Persona>(Value);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            tail= cabeza;
            tail.setNext(cabeza);
            
        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
            tail.setNext(cabeza);
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);
            cabeza=nuevoNodo;
            tail.setNext(cabeza);
        }
          else if (tail.getValue().getId() <= Value.getId() ){
                    tail.setNext(nuevoNodo);
                    tail=nuevoNodo;
                    tail.setNext(cabeza);
                    }
         else {

            node<Persona> aux = tail;
            while (aux.getNext().getValue().getId() < Value.getId());

            aux = aux.getNext();

            nuevoNodo.setNext(aux.getNext());

            aux.setNext(aux);
        }
    }

    public void imprimirLista() {

        node<Persona> aux = cabeza;
        while(aux !=tail)
        System.out.println(aux.getValue().toString());
        aux = aux.getNext();
    System.out.println(tail.getValue());
    }
    
}

    
    
