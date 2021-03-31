package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.MySkill;
import portfolio_backend.Repository.MySkillRepository;

@Service
@AllArgsConstructor
@Transactional
public class MySkillService {

    private final MySkillRepository mySkillRepository;

    public List<MySkill> findAll() {
        return mySkillRepository.findAll();
    }

    public List<MySkill> findAllByDeleted() {
        return mySkillRepository.findAllByDeleted(false);
    }

    public void insert(List<MySkill> skillList) {
        mySkillRepository.saveAll(skillList);
    }

}
