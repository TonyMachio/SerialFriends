package tony.ruiz.serialFriends.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tony.ruiz.serialFriends.domain.Serie;

public interface SerieRepository extends JpaRepository<Serie, Integer>{
	
	public List<Serie> findAllByOrderByTitulo();
	
	@Query("SELECT s FROM Serie s LEFT JOIN s.valoraciones v GROUP BY s ORDER BY (Cast(AVG(v.nota) as Float)) DESC")
    public List<Serie> findAllOrderByValoracionMediaDesc();

}
