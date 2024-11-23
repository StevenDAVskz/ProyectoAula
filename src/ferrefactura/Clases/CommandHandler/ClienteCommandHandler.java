package ferrefactura.Clases.CommandHandler;

import ferrefactura.negocios.acciones.commands.CreateClienteCommand;
import ferrefactura.negocios.acciones.commands.DeleteClienteCommand;
import ferrefactura.negocios.acciones.commands.UpdateClienteCommand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteCommandHandler {
    private Connection conn;

    // Constructor que establece la conexión con la base de datos
    public ClienteCommandHandler() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferrefactura", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error de conexión a la base de datos", e);
        }
    }

    // Método para crear un cliente en la base de datos
   public void createUsuario(int id, String nombre, String direccion, String email, int numero, String contraseña, String rol) {
    // Verificar si el ID ya existe en la base de datos
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();

        if (rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "ID ya en uso: " + id, "Error", JOptionPane.ERROR_MESSAGE);
              // Método para limpiar los campos
            return;
        }

        // Insertar el nuevo usuario si el ID no existe
        String insertQuery = "INSERT INTO usuarios (nombre, id, direccion, email, numero, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
            insertStmt.setString(1, nombre);
            insertStmt.setInt(2, id);
            insertStmt.setString(3, direccion);
            insertStmt.setString(4, email);
            insertStmt.setInt(5, numero);
            insertStmt.setString(6, contraseña);
            insertStmt.setString(7, rol);

            int rowsAffected = insertStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito!");
                // Método para limpiar los campos
                // Cerrar ventana actual
              
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar el usuario: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException exception) {
        exception.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al verificar el ID: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


  public void updateUsuario(int id, String nombre, String direccion, String email, int numero, String contraseña, String rol) {
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();

        if (rs.getInt(1) == 0) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado: " + id, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar los datos del usuario
        String updateQuery = "UPDATE usuarios SET nombre = ?, direccion = ?, email = ?, numero = ?, contrasena = ?, rol = ? WHERE id = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, nombre);
            updateStmt.setString(2, direccion);
            updateStmt.setString(3, email);
            updateStmt.setInt(4, numero);
            updateStmt.setString(5, contraseña);
            updateStmt.setString(6, rol);
            updateStmt.setInt(7, id);

            int rowsAffected = updateStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al verificar el ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}



  public void deleteUsuario(int id) {
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();

        if (rs.getInt(1) == 0) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado: " + id, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Eliminar el usuario
        String deleteQuery = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
            deleteStmt.setInt(1, id);

            int rowsAffected = deleteStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al verificar el ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}
