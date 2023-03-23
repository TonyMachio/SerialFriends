package tony.ruiz.serialFriends.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tony.ruiz.serialFriends.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
