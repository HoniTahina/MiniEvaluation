package com.groupeisi.evaluation.entities;


import javax.persistence.*;

@Entity
@Table(name = "cours")
public class CoursEntity {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matiere")
    private String matiere;

    @Column(name = "prof")
    private String prof;

    @Column(name = "classe")
    private String classe;

    public CoursEntity() {
    }

    public CoursEntity(Long id, String matiere, String prof, String classe) {
        this.id = id;
        this.matiere = matiere;
        this.prof = prof;
        this.classe = classe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
