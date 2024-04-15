package com.br.fullstackeducationM1S08.entity;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;

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

    private Date dataNascimento;

    public static AlunoEntity armazenar(AlunoEntity aluno) throws Exception {

        if (validacao(aluno)) {
            aluno.id = proximoId ++;
            alunos.add(aluno);
        }
        return aluno;
    }

    public static AlunoEntity armazenar(Integer id, AlunoEntity aluno) throws Exception {

        if (validacao(aluno)) {

            AlunoEntity alunoArmazenado = buscarPorId(id);
            alunoArmazenado.setNome(aluno.getNome());
            alunoArmazenado.setDataNascimento(alunoArmazenado.getDataNascimento());

            return alunoArmazenado;

        }
        return null;
    }

    public static boolean deletar(Integer id) throws Exception {
        AlunoEntity aluno = buscarPorId(id);
        alunos.remove(aluno);
        return true;
    }

    public static AlunoEntity buscarPorId(Integer id) throws Exception {
        for (AlunoEntity aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
            throw new Exception("Aluno não encontrado");
        }
        return buscarPorId(id);
    }

    private static boolean validacao(AlunoEntity aluno) throws Exception {
        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new Exception("Nome é obrigatório!");
        }
        if (aluno.getDataNascimento() == null) {
            throw new Exception("Carga não informada ou inválida!");
        }
        return true;
    }

}
