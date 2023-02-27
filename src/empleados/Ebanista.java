/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class Ebanista extends Persona {
    
    public Ebanista(String Nombre, String Apellido, String Cedula, String Experiencia, String Area, String Contacto) {
        super(Nombre, Apellido, Cedula, Experiencia, Area, Contacto);
    }
    
    public void OrganizarMaquinas(){
        System.out.println("Organizando maquinas ...");
    }
    public void PulirMuebles(){
        System.out.println("Puliendo muebles ...");
    }
    public void ReceptarEncargos(){
        System.out.println("Receptar encargos ...");
    }
    
}
