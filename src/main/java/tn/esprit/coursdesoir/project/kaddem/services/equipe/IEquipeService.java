package tn.esprit.coursdesoir.project.kaddem.services.equipe;

import tn.esprit.coursdesoir.project.kaddem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipe();

    Equipe addEquipe(Equipe equipe);

    Equipe updateEquipe(Equipe equipe);

    Equipe retrieveEquipe(Integer idEquipe);

    void removeEquipe(Integer idEquipe);
}
