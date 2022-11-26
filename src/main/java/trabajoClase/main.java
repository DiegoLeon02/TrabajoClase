/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoClase;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-----------------------------------------------------------SEMAMANA2 - RECURSIVIDAD ------------------------------------------------------------------
        /*
        //COMO EL METODO ES ESTATICO, NO SE PUEDE INSTANCIAR POR ESO SOLO SE LLAMA
        int arr[] = {12, 34, 64, 2, 3};
        
        System.out.println(Main.factorial(3));
        System.out.println(Main.encontrarMax(arr, 1, arr[0]));
        
         */
        //--------------------------------------------------------SEMANA3-PILAS----------------------------------------------------------
        // java genericts <T>, definimos los atributos sin el tipo de dato. cuando instanciamos el node le definos el tipo de dato
        // ejemplo private node<T> color;  color puede ser int, string lo que sea gracias al java genericts.
        /*
        ////////////////////usa la clase stack y node
        stack<Integer> Pila = new stack<Integer>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(4);
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
         */
        //------------------------------------------------PILA -usa la clase stack1 y node1-----------------------------------------
        /*
        stack1<Integer> Pila2 = new stack1<Integer>();       
        Pila2.push(1);
        Pila2.push(2);
        Pila2.push(4);
        System.out.println(Pila2.encuentra(2));
         */
        //-----------------------------------------------SEMANA 4- COLAS------------------------------------------------------
        //QUEUE<Integer> Cola = new QUEUE<Integer>();
        /*
       Cola.enqueue(1);
       Cola.enqueue(2);
       Cola.enqueue(4);
       System.out.println(Cola.dequeque()); // ACA IMPRIME UN NODO COMPLETO, POR ESO EL DE ABAJO IMPRIME 2 PORQUE ESTAMOS OBTENIENDO EL VALOR DEL NODO
       System.out.println(Cola.dequeque().getValue());*/

        // aca usamos un for para llenar la cola  con 100 elementos
     //   for (int i = 0; i < 101; i++) {

          //  Cola.enqueue(i);

       // }

      //  int temp = Cola.findbyIndex(23).getValue();

        /**
         * ACA REALIZAMOS, SACAMOS UN ELEMENTO DE LA COLA 1, Y EMPEZAMOS UNA
         * NUEVA COLA CON EL ELMENTO QUE SACAMOS.
         */
       // QUEUE<Integer> nuevaCola = new QUEUE<Integer>();
       // nuevaCola.enqueue(temp);

       // for (int i = 0; i < 100; i++) {
       //     nuevaCola.enqueue(i);
       // }
       // Lista Lista = new Lista();
        //Lista.insertar(new Persona(1,"P"));
        // Lista.insertar(new Persona(3,"P"));
        //  Lista.insertar(new Persona(2,"P"));
    
        //ListaCircular Lista = new ListaCircular ();
        //Lista.insertar(new Persona(1,"P"));
         //Lista.insertar(new Persona(3,"P"));
          //Lista.insertar(new Persona(2,"P"));
   
      Arbol arbol = new Arbol();
      arbol.inserta(50);
      arbol.inserta(20);
      arbol.inserta(80);
      arbol.inserta(15);
      arbol.inserta(30);
      arbol.inserta(60);
      arbol.inserta(40);
      arbol.inserta(90);
      arbol.inserta(75);
      arbol.inserta(33);
      arbol.inserta(82);

    }
    
   

}
