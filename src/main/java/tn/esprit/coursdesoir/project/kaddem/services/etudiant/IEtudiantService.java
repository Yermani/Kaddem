package tn.esprit.coursdesoir.project.kaddem.services.etudiant;

import tn.esprit.coursdesoir.project.kaddem.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant retrieveEtudiant(Integer idEtudiant);

    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant updateEtudiant(Etudiant etudiant);

    void removeEtudiant(Integer idEtudiant);

}
