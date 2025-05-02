package com.example.demo.repository;

import com.example.demo.MetodosUsuarioJPA;
import com.example.demo.modelBaseDatos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControllerUser {

    @Autowired
    private MetodosUsuarioJPA metodosUsuarioJPA;

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return metodosUsuarioJPA.obtenerTodosLosUsuarios();
    }
}
