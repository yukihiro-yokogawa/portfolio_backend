package portfolio_backend.Controller;

import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
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
    public List<Profile> getProfilesByOrderByDisplayOrder() {
        try {
            return profileService.findAllByOrderByDisplayOrder();
        } catch (
                DataAccessException e) {
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
}
