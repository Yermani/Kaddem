package tn.esprit.coursdesoir.project.kaddem.services.universite;

import tn.esprit.coursdesoir.project.kaddem.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);

    Universite retrieveUniversite(Integer idUniversite);

    void removeUniversite(Integer idUniversite);

    Universite assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
