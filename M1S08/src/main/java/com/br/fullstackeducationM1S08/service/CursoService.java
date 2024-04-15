package com.br.fullstackeducationM1S08.service;

import com.br.fullstackeducationM1S08.entity.AlunoEntity;
import com.br.fullstackeducationM1S08.entity.CursoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService extends CursoEntity {

    public static CursoEntity armazenar(CursoEntity curso) throws Exception {

        if (validacao(curso)) {
            CursoEntity.criar(curso);
        }
        return curso;
    }


    public static CursoEntity armazenar(Integer id, CursoEntity curso) throws Exception {

        if (validacao(curso)) {

            CursoEntity cursoArmazenado = buscarPorId(id);
            cursoArmazenado.setNome(curso.getNome());
            cursoArmazenado.setDescricao(cursoArmazenado.getDescricao());
            cursoArmazenado.setCargaHoraria(cursoArmazenado.getCargaHoraria());

            return cursoArmazenado;

        }
        return null;
    }

    public static boolean deletar(Integer id) throws Exception {
        CursoEntity curso = buscarPorId(id);
        return CursoEntity.deletar(curso);
    }

    public static List<CursoEntity> buscarTodos() {
        return CursoEntity.getCursos();
    }

    public static CursoEntity buscarPorId(Integer id) throws Exception {
        return CursoEntity.buscarPorId(id);
    }

    private static boolean validacao(CursoEntity curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isEmpty()) {
            throw new Exception("Nome é obrigatório!");
        }
        if (curso.getCargaHoraria() == null || curso.getCargaHoraria() < 80) {
            throw new Exception("Carga não informada ou inválida!");
        }
        return true;
    }
}
