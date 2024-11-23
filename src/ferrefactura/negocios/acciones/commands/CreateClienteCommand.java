/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

import ferrefactura.Clases.Usuarios;

/**
 *
 * @author steve
 */
public class CreateClienteCommand extends Usuarios{
    private String nombre;
    private int ID;
    private String direccion;
    private String email;
    protected int numero;
    private String contraseña;
    protected String Rol;

    public CreateClienteCommand(String nombre, int ID, String direccion, String email, int numero, String contraseña, String Rol) {
        this.nombre = nombre;
        this.ID = ID;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.contraseña = contraseña;
        this.Rol = Rol;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero() {
        return numero;
    }

    public String getContraseña() {
        return contraseña;
    }
    
     public String getRol() {
        return Rol;
    }
    
    
}

// Comando para actualizar un cliente

