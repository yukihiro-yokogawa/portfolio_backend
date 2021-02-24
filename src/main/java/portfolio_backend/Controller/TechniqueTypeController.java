package portfolio_backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.TechniqueType;
import portfolio_backend.Service.TechniqueTypeService;

@RestController
@RequestMapping("api/techniqueType")
@AllArgsConstructor
public class TechniqueTypeController {
    
    private final TechniqueTypeService techniqueTypeService;

    @GetMapping("/get")
    public List<TechniqueType> getTechniqueTypes() {
        return techniqueTypeService.findAll();
    }

}
