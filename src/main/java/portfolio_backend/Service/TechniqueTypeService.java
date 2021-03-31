package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.TechniqueType;
import portfolio_backend.Repository.TechniqueTypeRepository;

@Service
@AllArgsConstructor
@Transactional
public class TechniqueTypeService {

    private final TechniqueTypeRepository techniqueTypeRepository;

    public List<TechniqueType> findAll() {
        return techniqueTypeRepository.findAll();
    }

}
