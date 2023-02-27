/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class Florista extends Persona {
    
    public Florista(String Nombre, String Apellido, String Cedula, String Experiencia, String Area, String Contacto) {
        super(Nombre, Apellido, Cedula, Experiencia, Area, Contacto);
    }
    
    public void RosarCesped(){
        System.out.println("Rosando cesped");
    }
    public void CrearArreglo(){
        System.out.println("Creando arreglo");
    }
    public void RegarFlores(){
        System.out.println("Regando flores");
    }
    public void VenderArreglos(){
        System.out.println("Vender arreglos");
    }
}
