/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Clientes;
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
        Clientes cliente = new Clientes(
           command.getProductoComprado(),
        command.getFormaDePago(),
        command.getPago(),
        command.getNombre(),
        command.getId(),
        command.getDireccion(),
        command.getEmail(),
        command.getNumero(),
        command.getContrasena()
            
        );
        clienteRepository.save(cliente); // Guarda el nuevo cliente
    }
    
    public void handle(UpdateClienteCommand command) {
        Clientes cliente = clienteRepository.findById(command.getId());
        if (cliente != null) {
            // Actualiza los atributos del cliente
            cliente.setProductoComprado(command.getProductoComprado());
            cliente.setFormaDePago(command.getFormaDePago());
            cliente.setPago(command.getPago());
            cliente.setNombre(command.getNombre());
            cliente.setDirrecion(command.getDireccion());
            cliente.setEmail(command.getEmail());
            cliente.setNumero(command.getNumero());
            cliente.setContraseña(command.getContrasena());
            clienteRepository.save(cliente); // Guarda las actualizaciones
        }
    }
    
    public void handle(DeleteClienteCommand command) {
    // Verificar si el cliente existe
    Clientes cliente = clienteRepository.findById(command.getId());
    
    if (cliente != null) {
        // Eliminar el cliente del repositorio
        clienteRepository.delete(command.getId());
    } else {
        // Manejar el caso en que el cliente no se encuentra (opcional)
        throw new RuntimeException("Cliente no encontrado");
    }
}
}

