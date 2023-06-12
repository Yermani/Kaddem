package tn.esprit.coursdesoir.project.kaddem.entities;

import tn.esprit.coursdesoir.project.kaddem.entities.enums.Niveau;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;
    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany
    private Set<Etudiant> etudiants;
}
