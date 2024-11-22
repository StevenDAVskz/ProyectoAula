/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

/**
 *
 * @author steve
 */
public class DeleteClienteCommand {
    private String id;

    public DeleteClienteCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
