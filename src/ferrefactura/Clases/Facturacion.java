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
    private Usuarios user;
    private Productos productos;
    private Trabajadores trabajador;

    public Facturacion() {
    }

    public Facturacion(Usuarios user, Productos productos, Trabajadores trabajador, int idfactura) {
        this.user = user;
        this.productos = productos;
        this.trabajador = trabajador;
        this.idfactura=idfactura;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Trabajadores getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajadores trabajador) {
        this.trabajador = trabajador;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }
}
