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
    private int id;
    private String direccion;
    private String email;
    protected int numero;
    private String contrasena;
    protected String Rol;

    public CreateClienteCommand(String nombre, int id, String direccion, String email, int numero, String contrasena, String Rol) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.contrasena = contrasena;
        this.Rol = Rol;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
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

    public String getContrasena() {
        return contrasena;
    }
    
     public String getRol() {
        return Rol;
    }
    
    
}

// Comando para actualizar un cliente

