package br.pucpr.servico.repository;

import br.pucpr.servico.domain.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
    //select * from Aluno where nome like = "%Rodrigo%"
    List<Aluno> findByNomeLike(String nome);
    Aluno findByNomeAndMatriculaOrderByNomeAsc(String nome, String matricula);
    @Query("select a from Aluno a where a.matricula= :matricula")
    Aluno buscaAlunoPorMatricula(@Param("matricula") String matricula);

    List<Aluno> findByNomeNotNull(Long idUm, Long idDois);








}
