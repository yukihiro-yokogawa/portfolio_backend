package portfolio_backend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.Project;
import portfolio_backend.Service.ProjectService;

@RestController
@RequestMapping("api/project")
@AllArgsConstructor
public class ProjectController {
    
    private final ProjectService projectService;

    @GetMapping("{id}")
    public Optional<Project> getById(@PathVariable("id") Integer id){
        return projectService.findById(id);
    }

}
