/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class Albañil extends Persona {
    
    public Albañil(String Nombre, String Apellido, String Cedula, String Experiencia, String Area, String Contacto) {
        super(Nombre, Apellido, Cedula, Experiencia, Area, Contacto);
    }
    
    public void VerificarPlanos(){
        System.out.println("Verificando ´planos ...");
    }
    public void Construir(){
        System.out.println("Construyendo ...");
    }
    
}
