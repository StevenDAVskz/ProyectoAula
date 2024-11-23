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
public class Facturacion {
    private int idfactura; 
    private String productos;
    private String user;
    

    public Facturacion() {
    }

    public Facturacion(int idfactura, String productos, String user) {
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
