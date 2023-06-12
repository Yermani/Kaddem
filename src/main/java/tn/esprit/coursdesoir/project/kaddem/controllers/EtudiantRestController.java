package tn.esprit.coursdesoir.project.kaddem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.coursdesoir.project.kaddem.entities.Etudiant;
import tn.esprit.coursdesoir.project.kaddem.services.etudiant.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;

    // http://localhost:8089/kaddem/etudiant/retrieve-all-etudiant
    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getEtudiant() {
        return etudiantService.retrieveAllEtudiant();
    }

    // http://localhost:8089/kaddem/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Integer etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    // http://localhost:8089/kaddem/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    // http://localhost:8089/kaddem/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-equipe/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Integer equipeId) {
        etudiantService.removeEtudiant(equipeId);
    }

    // http://localhost:8089/kaddem/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }
}
