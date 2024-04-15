package com.br.fullstackeducationM1S08.controller;

import com.br.fullstackeducationM1S08.entity.AlunoEntity;
import com.br.fullstackeducationM1S08.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoEntity> get() {
        return alunoService.buscarTodos();
    }

    @GetMapping("{id}")
    public AlunoEntity getId(@PathVariable Integer id) throws Exception {
        return alunoService.buscarPorId(id);
    }

    @PostMapping
    public AlunoEntity post(@RequestBody AlunoEntity aluno) throws Exception {
        return alunoService.armazenar(aluno);
    }

    @PostMapping("{id}/add-aluno")
    public AlunoEntity post(@PathVariable Integer id, @RequestBody AlunoEntity aluno) throws Exception {
        return alunoService.armazenar(aluno);
    }

    @PutMapping
    public AlunoEntity put(@PathVariable Integer id, @RequestBody AlunoEntity aluno) throws Exception {
        return alunoService.armazenar(id, aluno);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return alunoService.deletar(id);
    }

}
