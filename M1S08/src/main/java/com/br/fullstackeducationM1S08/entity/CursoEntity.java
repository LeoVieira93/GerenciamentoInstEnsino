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

    public static CursoEntity criar(CursoEntity curso) {
        curso.id = proximoId ++;
        cursos.add(curso);
        return curso;
    }

    public static CursoEntity buscarPorId(Integer id) throws Exception {
        for (CursoEntity curso : getCursos()) {
            if (curso.getId().equals(id)) {
                return curso;
            }
            throw new Exception("Curso não encontrado");
        }
        return buscarPorId(id);
    }

    public static boolean deletar (CursoEntity curso) {
        cursos.remove(curso);
        return true;
    }

}
