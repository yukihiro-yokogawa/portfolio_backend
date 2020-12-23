package portfolio_backend.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.Project;
import portfolio_backend.Repository.ProjectRepository;

@Service
@AllArgsConstructor
public class ProjectService {
    
    private final ProjectRepository projectRepository;

    public Optional<Project> findById(Integer id) {
        return projectRepository.findById(id);
    }

}
