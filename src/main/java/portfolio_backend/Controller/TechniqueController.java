package portfolio_backend.Controller;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;
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
@Transactional
public class TechniqueController {

    private final TechniqueService techniqueService;

    @GetMapping("/get")
    public List<Technique> getTechniques() {
        try {
            return techniqueService.findAll();
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
    public void postTechnique(@RequestBody Technique technique) {
        try {
            techniqueService.insert(technique);
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
