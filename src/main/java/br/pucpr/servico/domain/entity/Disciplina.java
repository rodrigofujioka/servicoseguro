package br.pucpr.servico.domain.entity;

import br.pucpr.servico.domain.entity.Aluno;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeDisciplina;

    @ManyToOne
    @JoinColumn(name = "id")
    private Aluno aluno;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
