package tn.esprit.coursdesoir.project.kaddem.services.department;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.coursdesoir.project.kaddem.entities.Departement;
import tn.esprit.coursdesoir.project.kaddem.entities.Etudiant;
import tn.esprit.coursdesoir.project.kaddem.repositories.DepartementRepository;

import tn.esprit.coursdesoir.project.kaddem.repositories.EtudiantRepository;
import tn.esprit.coursdesoir.project.kaddem.services.etudiant.IEtudiantService;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImp implements IDepartmentService {
    DepartementRepository departementRepository;
    IEtudiantService etudiantService;
    EtudiantRepository etudiantRepository;

    @Override
    public List<Departement> retrieveAllDepartement() {
        return (List<Departement>) departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement u) {
        return departementRepository.save(u);
    }

    @Override
    public Departement updateDepartement(Departement u) {
        return departementRepository.save(u);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepartement) {
        return departementRepository.findById(idDepartement).orElse(null);
    }

    @Override
    public void removeDepartement(Integer idDepartement) {
        departementRepository.deleteById(idDepartement);
    }

    @Override
    public void assignEtudiantToDepartment(Integer idEtudiant, Integer departementId) {
        Etudiant etudiantSelected = etudiantRepository.findById(idEtudiant).get();
        Departement departmentToUpdate = departementRepository.findById(departementId).get();

        etudiantSelected.setDepartement(departmentToUpdate);
        etudiantRepository.save(etudiantSelected);
    }
}