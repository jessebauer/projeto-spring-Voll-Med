package med.voll.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
<<<<<<< HEAD
    UserDetails findByLogin(String username);
=======
    UserDetails findByLogin(String login);
>>>>>>> 01f8cb49072e367739a1abb7428e521a7011166e
}
