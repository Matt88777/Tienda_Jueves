package com.tienda.dao;

import jakarta.persistence.*; import java.io.Serializable; import java.util.List; import lombok.Data;
import com.tienda.domain.Usuario; import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);
    
    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);

}
