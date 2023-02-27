/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class Panadero extends Persona {
    
    public Panadero(String Nombre, String Apellido, String Cedula, String Experiencia, String Area, String Contacto) {
        super(Nombre, Apellido, Cedula, Experiencia, Area, Contacto);
    }
    
    public void ElaborarMasa(){
        System.out.println("Elaborando masa");
    }
    public void HornearPanes(){
        System.out.println("Horneando el pan");
    }
    public void VenderPanes(){
        System.out.println("Vendiendo panes");
    }
    
}
