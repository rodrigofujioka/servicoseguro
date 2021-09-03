package br.pucpr.servico.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_aluno")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "nome", length = 200)
    private String nome;

    private String matricula;

    @OneToMany(mappedBy = "aluno")
    private List<Disciplina> listaDisciplina;


    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
