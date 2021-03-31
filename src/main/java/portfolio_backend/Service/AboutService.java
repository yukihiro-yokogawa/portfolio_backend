package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.About;
import portfolio_backend.Repository.AboutRepository;

@Service
@AllArgsConstructor
@Transactional
public class AboutService {
    
    private final AboutRepository aboutRepository;

    public List<About> findAll() {
        return aboutRepository.findAll();
    }

	public void insert(About about) {
        aboutRepository.save(about);
	}
}
