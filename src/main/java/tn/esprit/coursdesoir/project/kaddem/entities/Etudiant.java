package tn.esprit.coursdesoir.project.kaddem.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import tn.esprit.coursdesoir.project.kaddem.entities.enums.Option;

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
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;

    @ManyToOne
    private Departement departement;

    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    private Set<Equipe> equipes;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}