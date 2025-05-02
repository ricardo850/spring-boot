package com.example.demo.repository;


import com.example.demo.modelBaseDatos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
}
