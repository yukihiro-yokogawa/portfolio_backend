package portfolio_backend.Controller;

import java.util.List;

import org.springframework.dao.DataAccessException;
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
        try {
            return techniqueTypeService.findAll();
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
}
