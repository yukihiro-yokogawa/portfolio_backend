package portfolio_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.Technique;

public interface TechniqueRepository extends JpaRepository<Technique, Integer> {
    
    List<Technique> findAll();

}
