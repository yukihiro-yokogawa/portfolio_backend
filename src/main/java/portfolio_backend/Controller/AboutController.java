package portfolio_backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/post")
    public void postAbout(@RequestBody About about) throws Exception {
        try {
            System.out.println(about);
            aboutService.insert(about);
        } catch (Exception e) {

            // どういう例外が発生しているか出力する
            System.out.println("例外クラス: " + e.getClass().getName());

            // 原因となった例外のチェーンを出力する
            Throwable cause = e;
            while ((cause = cause.getCause()) != null) {
                System.out.println("原因例外クラス: " + cause.getClass().getName());
            }
            throw e;
        }
    }

}
