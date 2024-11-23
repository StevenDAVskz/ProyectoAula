/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Clientes;
import ferrefactura.Clases.Usuarios;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author steve
 */
import java.sql.*;
import javax.swing.*;

public class ClienteRepository {
    private Connection conn;

    // Constructor que establece la conexión con la base de datos
    public ClienteRepository() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferrefactura", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para guardar un nuevo cliente
    public boolean save(Usuarios usuarios) {
        String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
        String insertQuery = "INSERT INTO usuarios (nombre, id, direccion, email, numero, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            // Verificar si el ID ya existe en la base de datos
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, usuarios.getID());
            ResultSet rs = checkStmt.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "ID ya en uso: " + usuarios.getID(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Insertar el nuevo cliente en la base de datos
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setString(1, usuarios.getNombre());
            insertStmt.setInt(2, usuarios.getID());
            insertStmt.setString(3, usuarios.getDireccion());
            insertStmt.setString(4, usuarios.getEmail());
            insertStmt.setInt(5, usuarios.getNumero());
            insertStmt.setString(6, usuarios.getContraseña());
            insertStmt.setString(7, usuarios.getRol());

            int rowsAffected = insertStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente creado con éxito!");
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    // Método para encontrar un cliente por ID
    public Clientes findById(int id) {
        String query = "SELECT * FROM usuarios WHERE id = ?";
        Clientes cliente = null;

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Usuarios usuarios = new Usuarios (
                    rs.getString("nombre"),
                    rs.getInt("id"),
                    rs.getString("direccion"),
                    rs.getString("email"),
                    rs.getInt("numero"),
                    rs.getString("contrasena"),
                    rs.getString("rol")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return cliente;
    }

    // Método para obtener todos los clientes
    public ResultSet findAll() {
        String query = "SELECT * FROM usuarios";
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener todos los clientes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    // Método para eliminar un cliente por ID
    public boolean delete(int id) {
        String query = "DELETE FROM usuarios WHERE id = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    // Cerrar la conexión
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
