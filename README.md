# GerenciamentoInstEnsino
Elaboração de um sistema básico de gerenciamento de uma instituição de ensino, contendo dados de alunos e cursos.

-----------------------------------------------------------------------------------------------------------------

A primeira implementação do projeto:

Crie uma classe Aluno.
A classe deve conter ao menos os atributos:

ID (sequencial)
Nome
Data de nascimento
!!! IMPORTANTE !!!

A classe deve conter um método estático para controlar a sequencia dos IDs.
A classe deve estar devidamente encapsulada.
O atributo ID não deve possuir um método "set".
-----------------------------------------------------------------------------------------------------------------

O próximo passo:

Crie uma classe Cursos.
A classe deve conter ao menos os atributos:

ID (sequencial)
Nome
Descrição
Carga Horária
!!! IMPORTANTE !!!

A classe deve conter um método estático para controlar a sequencia dos IDs.
A classe deve estar devidamente encapsulada.
O atributo ID não deve possuir um método "set".
-----------------------------------------------------------------------------------------------------------------

Com todas as nossas classes modelo criadas:

Crie uma classe Service para manter a regra de negócio dos alunos:

Cadastro de alunos
Consulta de todos os alunos
‌

!!! Atenção !!!

Para concluir o exercício será necessário realizar adequações na classe Aluno:

Utilize um atributo estático e privado para o armazenamento dos alunos cadastrados
crie um método "get"
crie um método responsável pela inclusão
-----------------------------------------------------------------------------------------------------------------

Segundo com as classes Service:

Crie uma classe Service para manter a regra de negócio dos cursos:

Cadastro de cursos
Consulta de todos os cursos
‌

!!! Atenção !!!

Para concluir o exercício será necessário realizar adequações na classe Curso:

Utilize um atributo estático e privado para o armazenamento dos cursos cadastrados
crie um método "get"
crie um método responsável pela inclusão
-----------------------------------------------------------------------------------------------------------------

Com todas os services criados:

Crie uma classe Controller para os alunos.
O controlador deve conter métodos para:

Cadastro de novos alunos (POST)
Consulta de todos os alunos (GET)
!!! Atenção !!!
Utilize a injeção de dependências para usar a classe Service de alunos
-----------------------------------------------------------------------------------------------------------------

Assim como foi criado para os Alunos, faça o mesmo com os Cursos.

Crie uma classe Controller para os cursos.
O controlador deve conter métodos para:

Cadastro de novos cursos (POST)
Consulta de todos os cursos (GET)
!!! Atenção !!!
Utilize a injeção de dependências para usar a classe Service de cursos
-----------------------------------------------------------------------------------------------------------------

No Controller de cursos crie um novo método para matricular alunos no curso
O método deve receber:

ID do curso no Path Param;
ID do aluno no RequestBody.
Para concluir o exercício será necessário realizar adequações no projeto:

Na classe Curso:
crie um atributo para representar uma lista de alunos matriculados;
utilize encapsulamento.
No Service de alunos:
crie um método para encontrar um aluno usando seu ID.
No Service de cursos:
crie um método para encontrar um curso usando seu ID;
crie um método realizar a matrícula (inclusão de um aluno na lista de alunos).
Obs: A regra de negócios deverá sempre ser utilizada no Service, não utilize o controlador para realizar buscas ou inserções.

-----------------------------------------------------------------------------------------------------------------
