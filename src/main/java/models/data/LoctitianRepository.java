package models.data;

import models.Loctitian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

//import javax.transaction.Transactional;

@Repository
@Transactional
public interface LoctitianRepository extends CrudRepository <Loctitian,Integer> {
}
