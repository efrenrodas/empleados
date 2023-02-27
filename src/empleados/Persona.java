/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class Persona {
    public String Nombre;
    public String Apellido;
    public String Cedula;
    public String Experiencia;
    public String Area;
    public String Contacto;

    public Persona(String Nombre, String Apellido, String Cedula, String Experiencia, String Area, String Contacto) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Experiencia = Experiencia;
        this.Area = Area;
        this.Contacto = Contacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }
    
    

   

}
