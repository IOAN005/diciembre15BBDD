package com.corenetworks.modelo;

import java.util.Objects;

public class Cliente {
    private String clienteId;
    private String nombreEmpresa;
    private String nombreContacto;

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId=" + clienteId +
                ", nombreCompania='" + nombreEmpresa + '\'' +
                ", nombreCliente='" + nombreContacto + '\'' +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(clienteId, cliente.clienteId) && Objects.equals(nombreEmpresa, cliente.nombreEmpresa) && Objects.equals(nombreContacto, cliente.nombreContacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId, nombreEmpresa, nombreContacto);
    }

    public Cliente() {
    }

    public Cliente(String clienteId, String nombreEmpresa, String nombreContacto) {
        this.clienteId = clienteId;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContacto = nombreContacto;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreCliente() {
        return nombreContacto;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreContacto = nombreCliente;
    }
}
