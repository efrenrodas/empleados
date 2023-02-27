/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class SueldoMensual {
    public double TotalSueldo;

    public SueldoMensual(double TotalSueldo) {
        this.TotalSueldo = TotalSueldo;
    }

    public double getTotalSueldo() {
        return TotalSueldo;
    }

    public void setTotalSueldo(double TotalSueldo) {
        this.TotalSueldo = TotalSueldo;
    }
    public void calcularSueldos(){
    DecimoTercero dt = new DecimoTercero();
    dt.setTotalDecimoTercero(450.00);
    DecimoCuarto dc = new DecimoCuarto();
    dc.setTotalDecimoCuarto(400.00);
    }
}
