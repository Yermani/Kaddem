package tn.esprit.coursdesoir.project.kaddem.entities;


import tn.esprit.coursdesoir.project.kaddem.entities.enums.Specialite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContract;

    @Temporal(TemporalType.DATE)
    private Date dateDebutContract;

    @Temporal(TemporalType.DATE)
    private Date dateFinContract;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContract;

    @ManyToOne
    private Etudiant etudiants;
}