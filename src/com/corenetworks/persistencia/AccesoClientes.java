package com.corenetworks.persistencia;

import com.corenetworks.modelo.Cliente;
import com.corenetworks.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoClientes extends Conexion {
    public Cliente obtenerUno(String id) throws SQLException, ClassNotFoundException {

        PreparedStatement sentencia;
        ResultSet resultado;
        String sql = "Select customer_id,company_name,contact_name from public.customers where customer_id= ?";
        Cliente c1 = null;
        abrirConexion();

        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, id);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {

            c1 = new Cliente(resultado.getString("customer_id"),
                    resultado.getString("company_name"),
                    resultado.getString("contact_name"));

        }
        return c1;


    }

    public List<Cliente> obtenerTodos() throws SQLException, ClassNotFoundException {

        Statement sentencia;
        ResultSet resultado;
        String sql = "Select customer_id,company_name,contact_name from public.customers  ";
        List<Cliente> clientes = new ArrayList<>();
        abrirConexion();

        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        while (resultado.next()) {
            clientes.add(new Cliente(resultado.getString("customer_id"),
                    resultado.getString("company_name"),
                    resultado.getString("contact_name")));
        }


        return clientes;
    }

    public boolean insertarUno(Cliente c1) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "INSERT INTO customers(customer_id, company_name, contact_name) VALUES(?, ?, ?)";

        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, c1.getClienteId());
        sentencia.setString(2, c1.getNombreCliente());
        sentencia.setString(3, c1.getNombreEmpresa());

        resultado = sentencia.executeUpdate();

        return resultado > 0;
    }

    public boolean modificar(Cliente c1) throws SQLException, ClassNotFoundException {
        //1.Declarar variables
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "update customers set company_name = '?' where customer_id=?";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el Statement
        sentencia = miConexion.prepareStatement(sql);
        //3A insertar datos
        sentencia.setString(1, c1.getClienteId());
        sentencia.setString(2, c1.getNombreEmpresa());
        //4. Modificar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado > 0;
    }
    public boolean eliminar() throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado =0;
        String sql = "delete from public.customers where customer_id=?";
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
    }