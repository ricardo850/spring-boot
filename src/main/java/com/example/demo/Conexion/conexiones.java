package com.example.demo.Conexion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conexiones {
   @GetMapping("/")
   public String hello() {
       return "¡Hola desde Spring Boot!";
   }

    @GetMapping("/amigos")
    public String perfect() {
        return "¡Hola nos vemos muy bien!";
    }

}
