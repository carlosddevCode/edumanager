🎓 EduManager

API REST para gerenciamento acadêmico, desenvolvida em Java com Spring Boot, Spring Data JPA e banco de dados SQL.

📌 Sobre o projeto

O EduManager é uma aplicação backend desenvolvida para gerenciar informações acadêmicas, incluindo alunos, disciplinas e matrículas.

A aplicação utiliza uma API REST para disponibilizar e receber dados no formato JSON, além de integrar-se a um banco de dados SQL para persistência das informações.

O projeto utiliza o Spring Data JPA para facilitar o mapeamento e a manipulação dos dados armazenados no banco.

✨ Funcionalidades
👨‍🎓 Alunos: gerenciamento de informações dos alunos.
📚 Disciplinas: gerenciamento das disciplinas acadêmicas.
📝 Matrículas: gerenciamento dos vínculos entre alunos e disciplinas.
🗄️ Persistência de dados: armazenamento das informações em banco de dados SQL.
🔗 API REST: comunicação por meio de requisições HTTP.
📦 JSON: recebimento e envio de dados estruturados.
🔄 Spring Data JPA: integração entre as entidades Java e o banco de dados.
🛠️ Tecnologias utilizadas
Java — linguagem de programação.
Spring Boot — estrutura para desenvolvimento da aplicação backend.
Spring Data JPA — persistência e acesso aos dados.
JPA (Java Persistence API) — mapeamento objeto-relacional.
SQL — linguagem utilizada para manipulação de dados relacionais.
API REST — disponibilização dos recursos da aplicação.
JSON — formato de comunicação entre cliente e servidor.
Maven — gerenciamento de dependências, caso utilizado no projeto.
⚙️ Pré-requisitos

Para executar o projeto, você precisará de:

Java JDK em uma versão compatível com a aplicação.
Banco de dados SQL compatível com a configuração do projeto.
Maven, caso o projeto utilize esse gerenciador de dependências.
Postman ou Insomnia para testar os endpoints da API, se desejado.
🚀 Como executar
1. Clone o repositório
   bash
   git clone URL_DO_REPOSITORIO

2. Acesse a pasta do projeto
   bash
   cd edumanager

3. Configure o banco de dados

Configure a conexão com o banco de dados no arquivo application.properties ou application.yml.

Exemplo ilustrativo para uma conexão JDBC:

properties
spring.datasource.url=SUA_URL_JDBC
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA


Ajuste as propriedades conforme o banco utilizado e a configuração do projeto.

4. Execute a aplicação

Se o projeto utilizar Maven Wrapper, execute:

bash
./mvnw spring-boot:run


No Windows:

bash
mvnw.cmd spring-boot:run


Quando a aplicação iniciar, os endpoints poderão ser acessados pelo endereço e pela porta configurados no projeto.

🌐 API REST

O EduManager disponibiliza recursos para trabalhar com alunos, disciplinas e matrículas por meio de requisições HTTP.

Os dados são enviados e recebidos em formato JSON.

Exemplos de recursos
Recurso	Descrição
/alunos	Operações relacionadas aos alunos
/disciplinas	Operações relacionadas às disciplinas
/matriculas	Operações relacionadas às matrículas

Os caminhos apresentados são exemplos e devem ser conferidos na implementação real da API.

📦 Exemplo de JSON

Exemplo ilustrativo de representação de um aluno:

json
{
"id": 1,
"nome": "João Silva",
"email": "joao@example.com"
}


A estrutura definitiva depende dos atributos definidos na entidade Aluno do projeto.

🗄️ Persistência de dados

A aplicação utiliza banco de dados SQL para armazenar as informações acadêmicas.

Com o Spring Data JPA, é possível trabalhar com entidades Java e repositórios para realizar operações de persistência, consulta, atualização e exclusão de dados, conforme implementado no projeto.

📂 Estrutura do projeto

Estrutura ilustrativa de uma aplicação Spring Boot:

text
edumanager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md

🎯 Objetivo

O EduManager tem como objetivo aplicar conceitos de desenvolvimento backend, integração com banco de dados relacional, persistência de dados com JPA e construção de APIs REST utilizando Java e Spring Boot.

👨‍💻 Autor

Desenvolvido como projeto de estudo e prática de desenvolvimento backend.

📄 Licença

A licença do projeto pode ser definida conforme a finalidade de uso e distribuição do código.