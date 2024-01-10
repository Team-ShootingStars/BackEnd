package shootingstar.typing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shootingstar.typing.entity.Text;

@Repository
public interface BoardRepository extends JpaRepository<Text, Long> {

}