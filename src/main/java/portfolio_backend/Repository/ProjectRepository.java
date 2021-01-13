package portfolio_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findAll();

}