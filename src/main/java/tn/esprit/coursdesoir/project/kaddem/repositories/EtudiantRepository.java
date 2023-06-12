package tn.esprit.coursdesoir.project.kaddem.repositories;

// same as CrudRepository with some extra functions
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.coursdesoir.project.kaddem.entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {


    List<Etudiant> findByDepartement(String departmentName);

    List<Etudiant> findByEquipesNiveau(String niveauEquipe);
}
