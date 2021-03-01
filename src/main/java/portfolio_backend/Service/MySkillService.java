package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.MySkill;
import portfolio_backend.Repository.MySkillRepository;

@Service
@AllArgsConstructor
public class MySkillService {
    
    private final MySkillRepository mySkillRepository;

    public List<MySkill> findAll() {
        return mySkillRepository.findAll();
    }

	public void insert(List<MySkill> skill) {
        mySkillRepository.saveAll(skill);
	}

}
