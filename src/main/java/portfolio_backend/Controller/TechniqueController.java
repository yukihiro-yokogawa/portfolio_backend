package portfolio_backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.Technique;
import portfolio_backend.Service.TechniqueService;

@RestController
@RequestMapping("api/technique")
@AllArgsConstructor
public class TechniqueController {
    
    private final TechniqueService techniqueService;

    @GetMapping("/get")
    public List<Technique> getTechniques() {
        return techniqueService.findAll();
    }


    @PostMapping("/post")
    public void postTechnique(@RequestBody Technique technique) {
        techniqueService.insert(technique);
    }

}
