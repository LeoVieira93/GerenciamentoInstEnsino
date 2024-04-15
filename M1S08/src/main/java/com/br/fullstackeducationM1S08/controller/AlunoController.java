package com.br.fullstackeducationM1S08.controller;

import com.br.fullstackeducationM1S08.entity.AlunoEntity;
import com.br.fullstackeducationM1S08.entity.CursoEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AlunoController {

    @GetMapping
    public List<AlunoEntity> get() {
        return AlunoEntity.getAlunos();
    }

    @GetMapping("{id}")
    public AlunoEntity getId(@PathVariable Integer id) throws Exception {
        return AlunoEntity.buscarPorId(id);
    }

    @PostMapping
    public AlunoEntity post(@RequestBody AlunoEntity curso) throws Exception {
        return AlunoEntity.armazenar(curso);
    }

    @PutMapping
    public AlunoEntity put(@PathVariable Integer id, @RequestBody AlunoEntity curso) throws Exception {
        return AlunoEntity.armazenar(id, curso);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return AlunoEntity.deletar(id);
    }

}
