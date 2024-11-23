/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

import java.util.Date;

/**
 *
 * @author steve
 */
public class FacturaProvedor  {
    protected Provedor nombreProvedor;
    protected int saldo;
    protected Date diaDeCompra;

    public FacturaProvedor() {
    }

    public FacturaProvedor(Provedor nombreProvedor,int idfactura, int saldo, Date diaDeCompra, Usuarios user, Productos productos, Trabajadores trabajador) {
       
        this.nombreProvedor = nombreProvedor;
        this.saldo = saldo;
        this.diaDeCompra = diaDeCompra;
    }

    public Provedor getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(Provedor nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Date getDiaDeCompra() {
        return diaDeCompra;
    }

    public void setDiaDeCompra(Date diaDeCompra) {
        this.diaDeCompra = diaDeCompra;
    }
    
    
}
