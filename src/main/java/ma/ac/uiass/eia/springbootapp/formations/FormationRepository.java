package ma.ac.uiass.eia.springbootapp.formations;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository  extends CrudRepository<Formation,Long>{

}
