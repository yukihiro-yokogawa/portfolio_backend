package portfolio_backend.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import portfolio_backend.Entity.Profile;
import portfolio_backend.Repository.ProfileRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

}
