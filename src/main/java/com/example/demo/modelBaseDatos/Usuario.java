package com.example.demo.modelBaseDatos;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int ID;

    private String NombreApellido;
    private int cedula;

    public Usuario() {
    }

    public Usuario(String NombreApellido, int cedula) {
        this.NombreApellido = NombreApellido;
        this.cedula = cedula;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        NombreApellido = nombreApellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
