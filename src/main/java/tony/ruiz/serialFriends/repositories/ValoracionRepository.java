package tony.ruiz.serialFriends.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tony.ruiz.serialFriends.domain.*;

public interface ValoracionRepository extends JpaRepository<Valoracion, ValoracionKey>{

	public List<Valoracion> findAllByOrderBySerieTitulo();
}
