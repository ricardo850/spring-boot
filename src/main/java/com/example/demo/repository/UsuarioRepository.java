package com.example.demo.repository;

import com.example.demo.modelBaseDatos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class UsuarioRepository {
    public interface PersonaRepository extends JpaRepository<Usuario, Long> {
        List<Usuario> findByNombre(String nombre);
    }
}
