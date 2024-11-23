/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Clientes;
import ferrefactura.Clases.Usuarios;
import ferrefactura.negocios.acciones.commands.CreateClienteCommand;
import ferrefactura.negocios.acciones.commands.DeleteClienteCommand;
import ferrefactura.negocios.acciones.commands.UpdateClienteCommand;

/**
 *
 * @author steve
 */
public class ClienteCommandHandler {
    private ClienteRepository clienteRepository;

    public ClienteCommandHandler(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void handle(CreateClienteCommand command) {
        Usuarios cliente;
       cliente = new Usuarios(
                command.getNombre(),
                command.getID(),
                command.getDireccion(),
                command.getEmail(),
                command.getNumero(),
                command.getContraseña(),
               command.getRol()
                
                
        );
        clienteRepository.save(cliente); // Guarda el nuevo cliente
    }
    
    public void handle(UpdateClienteCommand command) {
        Usuarios cliente = clienteRepository.findById(command.getID());
        if (cliente != null) {
            // Actualiza los atributos del cliente
            cliente.setNombre(command.getNombre());
            cliente.setDireccion(command.getDireccion());
            cliente.setEmail(command.getEmail());
            cliente.setNumero(command.getNumero());
            cliente.setContraseña(command.getContraseña());
            cliente.setRol(command.getRol());
            clienteRepository.save(cliente); // Guarda las actualizaciones
        }
    }
    
    public void handle(DeleteClienteCommand command) {
    // Verificar si el cliente existe
    Usuarios cliente = clienteRepository.findById(command.getId());
    
    if (cliente != null) {
        // Eliminar el cliente del repositorio
        clienteRepository.delete(command.getId());
    } else {
        // Manejar el caso en que el cliente no se encuentra (opcional)
        throw new RuntimeException("Cliente no encontrado");
    }
}
}