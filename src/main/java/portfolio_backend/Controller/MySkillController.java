package portfolio_backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.MySkill;
import portfolio_backend.Service.MySkillService;

@RestController
@RequestMapping("api/skill")
@AllArgsConstructor
public class MySkillController {
    
    private final MySkillService mySkillService;

    @GetMapping("/get")
    public List<MySkill> getMySkill() {
        return mySkillService.findAll();
    }

}