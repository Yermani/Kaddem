package tn.esprit.coursdesoir.project.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.coursdesoir.project.kaddem.entities.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Integer> {
}
