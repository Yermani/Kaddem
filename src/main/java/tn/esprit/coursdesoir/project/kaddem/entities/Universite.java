package tn.esprit.coursdesoir.project.kaddem.entities;

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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniv;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Departement> departement;
}
