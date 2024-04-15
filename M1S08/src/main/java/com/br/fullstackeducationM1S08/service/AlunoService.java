package com.br.fullstackeducationM1S08.service;

import com.br.fullstackeducationM1S08.entity.AlunoEntity;
import org.springframework.stereotype.Service;

@Service
public class AlunoService extends AlunoEntity {

    public static AlunoEntity armazenar(AlunoEntity aluno) throws Exception {

        if (validacao(aluno)) {
            AlunoEntity.criar(aluno);
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
        return AlunoEntity.deletar(aluno);
    }

    public static AlunoEntity buscarPorId(Integer id) throws Exception{
        return AlunoEntity.buscarPorId(id);
    }

    private static boolean validacao(AlunoEntity aluno) throws Exception {
        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new Exception("Nome é obrigatório!");
        }
        if (aluno.getDataNascimento() == null) {
            throw new Exception("Data de nascimento não informada ou inválida!");
        }
        return true;
    }

}
