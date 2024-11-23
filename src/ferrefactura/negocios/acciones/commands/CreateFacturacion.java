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
    

    public CreateFacturacion() {
    }

    public CreateFacturacion(int idfactura, String productos, String user) {
        this.idfactura = idfactura;
        this.productos = productos;
        this.user = user;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
