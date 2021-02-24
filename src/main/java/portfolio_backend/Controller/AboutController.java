package portfolio_backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.About;
import portfolio_backend.Service.AboutService;

@RestController
@RequestMapping("api/about")
@AllArgsConstructor
public class AboutController {
    
    private AboutService aboutService;

    @GetMapping("/get")
    public List<About> getAbouts() {
        return aboutService.findAll();
    }

}
