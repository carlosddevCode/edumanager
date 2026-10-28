🎓 EduManager

O EduManager é um projeto desenvolvido para praticar Programação Orientada a Objetos (POO), Java e Spring Boot. É um sistema backend com integração a banco de dados e comunicação por meio de uma API REST.

📌 Sobre o projeto

API REST para gerenciamento acadêmico, desenvolvida em Java com Spring Boot, Spring Data JPA e banco de dados SQL.

A aplicação permite gerenciar informações acadêmicas, incluindo alunos, disciplinas e matrículas. Os dados são disponibilizados e recebidos em formato JSON, com persistência em banco de dados.

✨ Funcionalidades
👨‍🎓 Alunos: gerenciamento de informações dos alunos.
📚 Disciplinas: gerenciamento das disciplinas acadêmicas.
📝 Matrículas: gerenciamento dos vínculos entre alunos e disciplinas.
🗄️ Persistência de dados: armazenamento em banco de dados SQL.
🔗 API REST: comunicação por requisições HTTP.
📦 JSON: envio e recebimento de dados estruturados.
🛠️ Tecnologias utilizadas
Java
Spring Boot
Spring Data JPA
JPA (Java Persistence API)
SQL
API REST
JSON
Maven
⚙️ Pré-requisitos
Java JDK em uma versão compatível com o projeto.
Banco de dados compatível com a configuração da aplicação.
Maven, se necessário.
Postman ou Insomnia para testar a API, opcionalmente.
🚀 Como executar

Clone o repositório:

bash
git clone https://github.com/carlosddevCode/edumanager.git


Entre na pasta:

bash
cd edumanager


Configure a conexão com o banco de dados no arquivo src/main/resources/application.properties.

Execute a aplicação usando o Maven Wrapper:

No Linux ou macOS:

bash
./mvnw spring-boot:run


No Windows:

bash
mvnw.cmd spring-boot:run

🌐 API REST

A API disponibiliza recursos para gerenciamento de alunos, disciplinas e matrículas.

Exemplos de endpoints:

/alunos
/disciplinas
/matriculas

Os caminhos definitivos devem ser conferidos nos controllers da aplicação.

🗄️ Persistência de dados

A aplicação utiliza Spring Data JPA para facilitar o acesso e a persistência de dados por meio de entidades Java e repositórios.

📂 Estrutura do projeto
text
edumanager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md

🎯 Objetivo

Praticar desenvolvimento backend, Programação Orientada a Objetos, integração com banco de dados e construção de APIs REST utilizando Java e Spring Boot.

👨‍💻 Autor

Desenvolvido como projeto de estudo e prática de desenvolvimento backend.