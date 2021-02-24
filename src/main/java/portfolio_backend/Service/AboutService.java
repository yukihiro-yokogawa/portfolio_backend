package portfolio_backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import portfolio_backend.Entity.About;
import portfolio_backend.Repository.AboutRepository;

@Service
@AllArgsConstructor
public class AboutService {
    private final AboutRepository aboutRepository;

    public List<About> findAll() {
        return aboutRepository.findAll();
    }
}
