package com.br.fullstackeducationM1S08.controller;

import com.br.fullstackeducationM1S08.entity.CursoEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursosController {

    @GetMapping
    public List<CursoEntity> get() {
        return CursoEntity.getCursos();
    }

    @GetMapping("{id}")
    public CursoEntity getId(@PathVariable Integer id) throws Exception {
        return CursoEntity.buscarPorId(id);
    }

    @PostMapping
    public CursoEntity post(@RequestBody CursoEntity curso) throws Exception {
        return CursoEntity.armazenar(curso);
    }

    @PutMapping
    public CursoEntity put(@PathVariable Integer id, @RequestBody CursoEntity curso) throws Exception {

        return CursoEntity.armazenar(id, curso);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return CursoEntity.deletar(id);
    }

}
