package portfolio_backend.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio_backend.Entity.Profile;
import portfolio_backend.Service.ProfileService;

import java.util.List;

@RestController
@RequestMapping("api/profile")
@AllArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/get")
    public List<Profile> getProfiles() {
        return profileService.findAll();
    }

}
