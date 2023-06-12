package tn.esprit.coursdesoir.project.kaddem.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.coursdesoir.project.kaddem.entities.Equipe;
import tn.esprit.coursdesoir.project.kaddem.services.equipe.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {
    IEquipeService equipeService;

    // http://localhost:8089/kaddem/equipe/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipe();
        return listEquipes;
    }

    // http://localhost:8089/kaddem/equipe/retrieve-equipe/8
    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }

    // http://localhost:8089/kaddem/equipe/add-equipe
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }

    // http://localhost:8089/kaddem/equipe/remove-equipe/1
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") Integer equipeId) {
        equipeService.removeEquipe(equipeId);
    }

    // http://localhost:8089/kaddem/equipe/update-equipe
    @PutMapping("/update-equipe")
    public Equipe updateEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.updateEquipe(e);
        return equipe;
    }
}