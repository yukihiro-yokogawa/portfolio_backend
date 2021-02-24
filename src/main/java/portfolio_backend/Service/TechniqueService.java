package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.Technique;
import portfolio_backend.Repository.TechniqueRepository;

@Service
@AllArgsConstructor
public class TechniqueService {

    private final TechniqueRepository techniqueRepository;
    
    public List<Technique> findAll() {
        return techniqueRepository.findAll();
    }

	public void insert(Technique technique) {
        techniqueRepository.save(technique);
	}

}
