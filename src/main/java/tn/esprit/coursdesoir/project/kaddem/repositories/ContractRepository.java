package tn.esprit.coursdesoir.project.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.coursdesoir.project.kaddem.entities.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {

}
