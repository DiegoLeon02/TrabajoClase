/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author diego
 */
public class Persona {
    
    private int Id;
    private String nombre;
  
    
    public Persona (int Id,String nombre){
       
        this.Id = Id;
        this.nombre=nombre;
    }
    
    public Persona(){
    
  
        }

    @Override
    public String toString() {
        return "Persona{" + "Id=" + Id + ", nombre=" + nombre +  '}';
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    }
            
            

