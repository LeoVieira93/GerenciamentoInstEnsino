package com.br.fullstackeducationM1S08.entity;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AlunoEntity {

    private static Integer proximoId = 1;
    @Getter
    private static List<AlunoEntity> alunos = new ArrayList<>();
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private List<AlunoEntity> alunosRegistrados = new ArrayList<>();

    public static AlunoEntity criar(AlunoEntity aluno) {
        aluno.id = proximoId ++;
        alunos.add(aluno);
        return aluno;
    }

    public static AlunoEntity buscarPorId(Integer id) throws Exception {
        for (AlunoEntity aluno : getAlunos()) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
            throw new Exception("Aluno não encontrado");
        }
        return buscarPorId(id);
    }

    public static boolean deletar (AlunoEntity aluno) {
        alunos.remove(aluno);
        return true;
    }

}
