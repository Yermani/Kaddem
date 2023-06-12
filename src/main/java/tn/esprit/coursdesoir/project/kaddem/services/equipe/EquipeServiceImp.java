package tn.esprit.coursdesoir.project.kaddem.services.equipe;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.coursdesoir.project.kaddem.entities.Equipe;
import tn.esprit.coursdesoir.project.kaddem.repositories.EquipeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipeServiceImp implements IEquipeService {

    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipe() {
        return (List<Equipe>) equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe u) {
        return equipeRepository.save(u);
    }

    @Override
    public Equipe updateEquipe(Equipe u) {
        return equipeRepository.save(u);
    }

    @Override
    public Equipe retrieveEquipe(Integer idUniversite) {
        return equipeRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeEquipe(Integer idUniversite) {
        equipeRepository.deleteById(idUniversite);
    }
}