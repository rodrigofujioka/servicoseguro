package br.pucpr.servico.repository;

import br.pucpr.servico.domain.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    List<Disciplina> findByAluno_Matricula(String matricula);

    @Query("select d from Disciplina d where d.aluno.matricula=:matricula")
    List<Disciplina> buscaAlunoMatricula(@Param("matricula") String matricula);

    @Query(value = "select nomeDisciplina as nomeDisci from disciplina ", nativeQuery = true)
    List<Disciplina> buscaDisciplinaPorNome(@Param("nome") String nome);

}