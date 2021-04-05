package portfolio_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio_backend.Entity.Profile;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    List<Profile> findAllByOrderByDisplayOrder();

}
