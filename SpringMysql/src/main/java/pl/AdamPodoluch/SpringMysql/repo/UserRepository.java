package pl.AdamPodoluch.SpringMysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.AdamPodoluch.SpringMysql.model.ApUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApUser, Integer> {
    Optional<ApUser> findByUserName(String userName);
}
