package portfolio_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.TechniqueType;

public interface TechniqueTypeRepository extends JpaRepository<TechniqueType, Integer> {
    
    List<TechniqueType> findAll();

}
