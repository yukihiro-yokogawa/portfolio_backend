package portfolio_backend.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio_backend.Entity.MyProfile;
import portfolio_backend.Service.MyProfileService;

import java.util.List;

@RestController
@RequestMapping("api/my_profile")
@AllArgsConstructor
public class MyProfileController {

    private final MyProfileService myProfileService;

    @GetMapping("/get")
    public List<MyProfile> getMyProfiles() {
        return myProfileService.findAll();
    }

}
