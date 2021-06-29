package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.Technique;
import portfolio_backend.Repository.TechniqueRepository;

@Service
@AllArgsConstructor
@Transactional
public class TechniqueService {

    private final TechniqueRepository techniqueRepository;

    public List<Technique> findAll() {
        return techniqueRepository.findAll();
    }

    public Technique insert(Technique technique) {
        Technique savedTechnique = techniqueRepository.save(technique);
        System.out.println(savedTechnique);
        return savedTechnique;
    }

}
