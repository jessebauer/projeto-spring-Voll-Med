<b><h1>Objetivo</h1></b>

• Desenvolvimento de uma API Rest

• CRUD (Create, Read, Update e Delete)

• Validações

• Paginação e ordenação

<b><h2>Tecnologias</h2></b>

**• Spring Boot 3**

**• Java 17**

**• Lombok:**
responsável por fazer a geração de códigos repetitivos, como getters, setters, toString, entre outros. Tudo via anotações para o código ficar menos verboso.

**• MySQL/ Flyway:**
para armazenar as informações da API e junto com ele utilizaremos a biblioteca Flyway. Isso para termos o controle do histórico de evolução do banco de dados, um conceito que chamamos de Migration.

**• JPA/Hibernate:**
A camada de persistência da nossa aplicação será feita com a JPA (Java Persistence API), com o Hibernate como implementação dessa especificação e usando os módulos do Spring Boot, para tornar esse processo o mais simples possível.

**• Maven:**
gerenciar as dependências do projeto, e também para gerar o build da nossa aplicação.

**• Insomnia:**
sendo uma ferramenta usada para testes em API

<b><h2>Protótipo</h2></b>
As imagens abaixo são apenas representativas, será desenvolvido apenas o back-end.
![Imagem representativa do programa](PrototipoProjeto.png)


Empresa chamada Voll Med(fictícia), que possui uma clínica que precisa de um aplicativo para monitorar o cadastro de médicos, pacientes e agendamento de consultas.

Será um aplicativo com algumas opções, em que a pessoa que for usar pode fazer o <b>CRUD</b>, tanto de médicos quanto de pacientes e o agendamento e cancelamento das consultas.

