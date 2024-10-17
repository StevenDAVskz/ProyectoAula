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
public class FacturaCliente extends Facturacion{
    protected Clientes nombreClientes;
    protected int CostoFinal;
    protected Date FechaCompra;

    public FacturaCliente() {
    }

    public FacturaCliente(Clientes nombreClientes, int CostoFinal, Date FechaCompra, Usuarios user, Productos productos, Trabajadores trabajador) {
        super(user, productos, trabajador);
        this.nombreClientes = nombreClientes;
        this.CostoFinal = CostoFinal;
        this.FechaCompra = FechaCompra;
    }

    public Clientes getNombreClientes() {
        return nombreClientes;
    }

    public void setNombreClientes(Clientes nombreClientes) {
        this.nombreClientes = nombreClientes;
    }

    public int getCostoFinal() {
        return CostoFinal;
    }

    public void setCostoFinal(int CostoFinal) {
        this.CostoFinal = CostoFinal;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }
    
}
