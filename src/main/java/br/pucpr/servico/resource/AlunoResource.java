package br.pucpr.servico.resource;

import br.pucpr.servico.domain.entity.Aluno;
import br.pucpr.servico.repository.AlunoRepository;
import br.pucpr.servico.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {

    private final AlunoRepository alunoRepository;

    private final AlunoService alunoService;

    public AlunoResource(AlunoRepository alunoRepository, AlunoService alunoService) {
        this.alunoRepository = alunoRepository;
        this.alunoService= alunoService;
    }

    @GetMapping("/consulta/{id}")
    public Aluno consulta(@PathVariable("id") int id){
        return alunoRepository.getById(id);
    }

    @DeleteMapping("/consulta/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        alunoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno incluir(@RequestBody Aluno aluno){
        return alunoService.save(aluno);
    }

}
