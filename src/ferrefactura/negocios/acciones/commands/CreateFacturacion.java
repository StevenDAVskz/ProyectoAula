/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

import ferrefactura.Clases.Facturacion;
import ferrefactura.Clases.Productos;
import ferrefactura.Clases.Trabajadores;
import ferrefactura.Clases.Usuarios;

/**
 *
 * @author LENOVO
 */
public class CreateFacturacion extends Facturacion{
   private int idfactura; 
    private String productos;
    private String user;
    protected double precio;

    public CreateFacturacion() {
    }

    public CreateFacturacion(int idfactura, String productos, String user, double precio) {
        super(idfactura, productos, user, precio);
    }

    public int getidfactura() {
        return idfactura;
    }

    public void setidfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public String getproductos() {
        return productos;
    }

    public void setproductos(String productos) {
        this.productos = productos;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }


    
    
    
}
