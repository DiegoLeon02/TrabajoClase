/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author diego
 */
public class Lista {

    private node<Persona> cabeza;

    public Lista() {

    }

    public void insertar(Persona Value) {
        node<Persona> nuevoNodo = new node<Persona>(Value);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId()> nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);
        } else {

            node<Persona> aux = cabeza;
            while (aux.getNext() != null && aux.getValue().getId() < nuevoNodo.getValue().getId());

            aux = aux.getNext();

            nuevoNodo.setNext(aux.getNext());

            aux.setNext(aux);
        }
    }

    public void imprimirLista() {

        node<Persona> aux = cabeza;
        System.out.println(aux.getValue().toString());
        aux = aux.getNext();
    }
}
