package portfolio_backend.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.Project;
import portfolio_backend.Service.ProjectService;

@RestController
@RequestMapping("api/project")
@AllArgsConstructor
public class ProjectController {
    
    private final ProjectService projectService;

    @GetMapping("/get")
    public List<Project> getProjects() {
        return projectService.findAll();
    }

    @GetMapping("/getOne")
    public List<Project> getProjectById(Integer id) {
        final List<Project> projectList = new ArrayList<>();
        projectList.add(projectService.findById(id).orElse(new Project()));
        return projectList;
    }

    @PostMapping("/post")
    public void insertProject(@RequestPart("project")Project project) {
        projectService.insert(project);
    }

}
