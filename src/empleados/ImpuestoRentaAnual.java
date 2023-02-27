/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author Efren Rodas
 */
public class ImpuestoRentaAnual {
    public String FechaPago;
    public double ValorPago;

    public ImpuestoRentaAnual(String FechaPago, double ValorPago) {
        this.FechaPago = FechaPago;
        this.ValorPago = ValorPago;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public double getValorPago() {
        return ValorPago;
    }

    public void setValorPago(double ValorPago) {
        this.ValorPago = ValorPago;
    }
    
}
