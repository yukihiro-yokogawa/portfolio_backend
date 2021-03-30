package portfolio_backend.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import portfolio_backend.Entity.MyProfile;
import portfolio_backend.Repository.MyProfileRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MyProfileService {

    private final MyProfileRepository myProfileRepository;

    public List<MyProfile> findAll() {
        return myProfileRepository.findAll();
    }

}
