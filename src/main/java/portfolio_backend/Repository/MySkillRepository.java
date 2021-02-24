package portfolio_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio_backend.Entity.MySkill;

public interface MySkillRepository extends JpaRepository<MySkill, Integer> {
    
    List<MySkill> findAll();

}
