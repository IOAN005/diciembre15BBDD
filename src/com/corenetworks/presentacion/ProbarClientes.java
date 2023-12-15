package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cliente;
import com.corenetworks.modelo.Empleado;
import com.corenetworks.persistencia.AccesoClientes;
import com.corenetworks.persistencia.AccesoEmpleados;

import java.sql.SQLException;

public class ProbarClientes {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("13","apple","TIM");
        Cliente c2 = new Cliente("20","buggatti","andrew");
        AccesoClientes aC = new AccesoClientes();
//        try {
//            System.out.println("el cliente ha sido probado"+aC.obtenerUno("ALFKI"));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//
//        }
//        try {
//            System.out.println("probar todos" +aC.obtenerTodos());
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
//        try {
//            System.out.println("Insertar un cliente " + aC.insertarUno(c1));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
//        try {
//            System.out.println("modificar cliente " +aC.modificar(c2));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println("eliminar cliente " +aC.eliminar());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
