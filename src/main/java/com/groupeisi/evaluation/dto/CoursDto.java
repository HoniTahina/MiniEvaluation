package com.groupeisi.evaluation.dto;

import javax.persistence.Column;

public class CoursDto {
    private Long id;
    private String matiere;
    private String prof;
    private String classe;

    public CoursDto(Long id, String matiere, String prof, String classe) {
        this.id = id;
        this.matiere = matiere;
        this.prof = prof;
        this.classe = classe;
    }

    public CoursDto() {
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
