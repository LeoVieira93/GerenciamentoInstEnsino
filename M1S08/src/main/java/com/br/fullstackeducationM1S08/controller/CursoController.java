package com.br.fullstackeducationM1S08.controller;

import com.br.fullstackeducationM1S08.entity.AlunoEntity;
import com.br.fullstackeducationM1S08.entity.CursoEntity;
import com.br.fullstackeducationM1S08.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoEntity> get() {
        return cursoService.buscarTodos();
    }

    @GetMapping("{id}")
    public CursoEntity getId(@PathVariable Integer id) throws Exception {
        return cursoService.buscarPorId(id);
    }

    @PostMapping
    public CursoEntity post(@RequestBody CursoEntity curso) throws Exception {
        return cursoService.armazenar(curso);
    }

    @PostMapping("{id}/add-curso")
    public CursoEntity post(@PathVariable Integer id, @RequestBody AlunoEntity aluno) throws Exception {
        return cursoService.matricularAluno(id, aluno.getId());
    }

    @PutMapping
    public CursoEntity put(@PathVariable Integer id, @RequestBody CursoEntity curso) throws Exception {

        return cursoService.armazenar(id, curso);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return cursoService.deletar(id);
    }

}
