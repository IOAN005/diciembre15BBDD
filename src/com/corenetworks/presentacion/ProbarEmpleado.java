package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.persistencia.AccesoEmpleados;

import java.sql.SQLException;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(101,"ANAX","FLORESX",2);
        AccesoEmpleados aE = new AccesoEmpleados();

       // try {
      //      System.out.println(aE.eliminar(100));
       // } catch (SQLException e) {
       //     throw new RuntimeException(e);
       // } catch (ClassNotFoundException e) {
      //      throw new RuntimeException(e);
      //  }
//        try {
//            System.out.println("El empleado se ha dado de alta "+aE.alta(e1));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println("El empleado ha sido modificado" +aE.modificar(e1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
