package br.pucpr.servico.service;

import br.pucpr.servico.domain.entity.Aluno;
import br.pucpr.servico.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
