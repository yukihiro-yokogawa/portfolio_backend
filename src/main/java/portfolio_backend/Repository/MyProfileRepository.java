package portfolio_backend.Repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import portfolio_backend.Entity.MyProfile;

import java.util.List;

public interface MyProfileRepository extends JpaRepository<MyProfile, Integer> {

    List<MyProfile> findAllByDeleted(boolean deleted, Sort sort);

}
