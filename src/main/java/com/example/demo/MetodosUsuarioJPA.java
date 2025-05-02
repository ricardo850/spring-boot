package com.example.demo;


import com.example.demo.modelBaseDatos.Usuario;
import com.example.demo.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodosUsuarioJPA {
    @Autowired
    private RepositoryUsuario repositoryUsuario;

    public MetodosUsuarioJPA() {
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return repositoryUsuario.findAll();
    }
}
