package tn.esprit.coursdesoir.project.kaddem.services.universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.coursdesoir.project.kaddem.entities.Departement;
import tn.esprit.coursdesoir.project.kaddem.entities.Universite;
import tn.esprit.coursdesoir.project.kaddem.repositories.DepartementRepository;
import tn.esprit.coursdesoir.project.kaddem.repositories.UniversiteRepository;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class UniversiteServiceImp implements IUniversiteService {

    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }
    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }
    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }
    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
// return universiteRepository.findById(idUniversite).get();
    }
    @Override
    public void removeUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universiteToUpdate = universiteRepository.findById(idUniversite).get();
        Departement departementToAssign = departementRepository.findById(idDepartement).get();

        Set<Departement> oldDepartements = universiteToUpdate.getDepartement();
        oldDepartements.add(departementToAssign);
        universiteToUpdate.setDepartement(oldDepartements);
        universiteRepository.save(universiteToUpdate);

        return universiteToUpdate;
    }
}
