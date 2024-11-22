/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

import ferrefactura.Clases.Productos;
import ferrefactura.Clases.Trabajadores;
import ferrefactura.Clases.Usuarios;

/**
 *
 * @author LENOVO
 */
public class CreateFacturacion {
    private Usuarios user;
    private Productos productos;
    private Trabajadores trabajador;
    private int idfactura; 

    public CreateFacturacion(Usuarios user, Productos productos, Trabajadores trabajador) {
        this.user = user;
        this.productos = productos;
        this.trabajador = trabajador;
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

    public int getIdfactura() {
        return idfactura;
    }
    
}
