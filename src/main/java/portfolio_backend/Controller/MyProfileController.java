package portfolio_backend.Controller;

import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;
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
        try {
            return myProfileService.findAllByOrderByDate();
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
    public void postMyProfile(@RequestBody List<MyProfile> myProfileList) {
        try {
            myProfileService.insert(myProfileList);
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
