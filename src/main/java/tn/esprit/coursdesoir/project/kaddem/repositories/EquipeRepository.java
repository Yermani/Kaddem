package tn.esprit.coursdesoir.project.kaddem.repositories;

// same as CrudRep with some extra functions
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.coursdesoir.project.kaddem.entities.Equipe;

@Repository
public interface EquipeRepository extends PagingAndSortingRepository<Equipe, Integer> {
}
