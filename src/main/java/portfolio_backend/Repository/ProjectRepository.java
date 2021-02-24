package portfolio_backend.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findAll();

    Optional<Project> findById(Integer id);

}