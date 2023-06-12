package tn.esprit.coursdesoir.project.kaddem.services.etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.coursdesoir.project.kaddem.entities.Etudiant;
import tn.esprit.coursdesoir.project.kaddem.repositories.EtudiantRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImp implements IEtudiantService {
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant u) {
        return etudiantRepository.save(u);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant u) {
        return etudiantRepository.save(u);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
