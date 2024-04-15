package com.br.fullstackeducationM1S08.entity;

import lombok.Data;
import lombok.Getter;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.List;

@Data
public class CursoEntity {

    private static Integer proximoId = 1;
    @Getter
    private static List<CursoEntity> cursos = new ArrayList<>();

    private Integer id;

    private String nome;

    private String descricao;

    private Integer cargaHoraria;

    public static CursoEntity armazenar(CursoEntity curso) throws Exception {

        if (validacao(curso)) {
                curso.id = proximoId++;
                cursos.add(curso);
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
        cursos.remove(curso);
        return true;
    }

    public static CursoEntity buscarPorId(Integer id) throws Exception {
        for (CursoEntity curso : cursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
            throw new Exception("Curso não encontrado");
        }
        return buscarPorId(id);
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
