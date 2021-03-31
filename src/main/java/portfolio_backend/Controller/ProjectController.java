package portfolio_backend.Controller;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/get")
    public List<Project> getProjects() {
        try {
            return projectService.findAll();
        } catch (DataAccessException e) {
            // どういう例外が発生しているか出力する
            System.out.println("例外クラス: " + e.getClass().getName());
            // 原因となった例外のチェーンを出力する
            Throwable cause = e;
            while ((cause = cause.getCause()) != null) {
                System.out.println("原因例外クラス: " + cause.getClass().getName());
            }
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getOne")
    public List<Project> getProjectById(Integer id) {
        final List<Project> projectList = new ArrayList<>();
        try {
            projectList.add(projectService.findById(id).orElse(new Project()));
            return projectList;
        } catch (DataAccessException e) {
            // どういう例外が発生しているか出力する
            System.out.println("例外クラス: " + e.getClass().getName());
            // 原因となった例外のチェーンを出力する
            Throwable cause = e;
            while ((cause = cause.getCause()) != null) {
                System.out.println("原因例外クラス: " + cause.getClass().getName());
            }
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/post")
    public void insertProject(@RequestBody Project project) {
        try {
            projectService.insert(project);
        } catch (DataAccessException e) {
            // どういう例外が発生しているか出力する
            System.out.println("例外クラス: " + e.getClass().getName());
            // 原因となった例外のチェーンを出力する
            Throwable cause = e;
            while ((cause = cause.getCause()) != null) {
                System.out.println("原因例外クラス: " + cause.getClass().getName());
            }
            e.printStackTrace();
        }
    }
}
