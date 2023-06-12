package tn.esprit.coursdesoir.project.kaddem.services.department;

import tn.esprit.coursdesoir.project.kaddem.entities.Departement;

import java.util.List;

public interface IDepartmentService {

    List<Departement> retrieveAllDepartement();

    Departement addDepartement(Departement departement);

    Departement updateDepartement(Departement departement);

    Departement retrieveDepartement(Integer idDepartement);

    void removeDepartement(Integer idDepartement);

    void assignEtudiantToDepartment(Integer idEtudiant, Integer DepartementId);
}
