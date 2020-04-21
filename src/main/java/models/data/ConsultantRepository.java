package models.data;

import models.Consultant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ConsultantRepository extends CrudRepository <Consultant,Integer> {
}
