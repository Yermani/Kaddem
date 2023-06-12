package tn.esprit.coursdesoir.project.kaddem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.coursdesoir.project.kaddem.entities.Departement;
import tn.esprit.coursdesoir.project.kaddem.entities.Universite;
import tn.esprit.coursdesoir.project.kaddem.services.universite.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteService universiteService;

    // http://localhost:8089/kaddem/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    // http://localhost:8089/kaddem/universite/retrieve-universite/8
    @GetMapping("/retrieve-university/{university-id}")
    public Universite retrieveUniversite(@PathVariable("university-id") Integer universityId) {
        return universiteService.retrieveUniversite(universityId);
    }

    // http://localhost:8089/kaddem/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    // http://localhost:8089/kaddem/universite/remove-universite/1
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Integer universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    // http://localhost:8089/kaddem/universite/update-universite
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }

    // http://localhost:8089/kaddem/universite/assign-universite-to-department/1/1
    @PutMapping ("/assign-universite-to-department/{id-university}/{id-department}")
    public void assignUniversiteToDepartment(



           @PathVariable("id-university") Integer idUniversity,
            @PathVariable("id-department") Integer idDepartment
    ) {
        universiteService.assignUniversiteToDepartement(idUniversity, idDepartment);
    }
            }

