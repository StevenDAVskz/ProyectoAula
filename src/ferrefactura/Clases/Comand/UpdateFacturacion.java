/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.Comand;

import ferrefactura.Clases.Productos;
import ferrefactura.Clases.Trabajadores;
import ferrefactura.Clases.Usuarios;

/**
 *
 * @author LENOVO
 */
public class UpdateFacturacion {
      private int idfactura; 
    private Usuarios user;
    private Productos productos;
    private Trabajadores trabajador;

    public UpdateFacturacion(int idfactura, Usuarios user, Productos productos, Trabajadores trabajador) {
        this.idfactura = idfactura;
        this.user = user;
        this.productos = productos;
        this.trabajador = trabajador;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public Usuarios getUser() {
        return user;
    }

    public Productos getProductos() {
        return productos;
    }

    public Trabajadores getTrabajador() {
        return trabajador;
    }
}
