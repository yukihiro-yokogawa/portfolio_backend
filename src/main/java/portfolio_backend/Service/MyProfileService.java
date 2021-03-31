package portfolio_backend.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import portfolio_backend.Entity.MyProfile;
import portfolio_backend.Repository.MyProfileRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class MyProfileService {

    private final MyProfileRepository myProfileRepository;

    public List<MyProfile> findAll() {
        return myProfileRepository.findAll();
    }

    public void insert(List<MyProfile> myProfileList) {
        myProfileRepository.saveAll(myProfileList);
    }

}
