package portfolio_backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.Project;
import portfolio_backend.Repository.ProjectRepository;

@Service
@AllArgsConstructor
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Integer id) {
        return projectRepository.findById(id);
    }

    public Project insert(Project project) {
        return projectRepository.save(project);
    }

}
