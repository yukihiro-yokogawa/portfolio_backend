package portfolio_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.About;

public interface AboutRepository extends JpaRepository<About, Integer> {
    
    List<About> findAll();
    
}
