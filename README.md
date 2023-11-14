## Baseado em
https://www.linkedin.com/pulse/priming-jose-r-f-junior/?originalSubdomain=pt

## Priming Backend
Este é um projeto que usa Java, Spring Boot, Neo4j, RDF e JSON para criar uma API RESTful que permite o armazenamento e a consulta de dados semânticos. O objetivo é facilitar a integração de diferentes fontes de dados e a extração de conhecimento relevante.

Este projeto também faz parte de um curso de inglês que eu estou fazendo, onde eu uso técnicas de aprendizagem acelerada como pomodoro, palácio de memória e priming para melhorar o meu vocabulário e a minha pronúncia.

## Arquitetura
A arquitetura do projeto é baseada no diagrama a seguir:

![Diagrama de arquitetura]
![v1.png](img%2Fv1.png)
## O projeto consiste em três camadas principais:

A camada de apresentação, que é responsável por fornecer uma interface gráfica para o usuário interagir com a API. Esta camada usa React para criar componentes reutilizáveis e dinâmicos.
A camada de negócio, que é responsável por implementar a lógica de negócio e as funcionalidades da API. Esta camada usa Spring Boot para criar serviços RESTful que seguem os princípios do HATEOAS (Hypermedia as the Engine of Application State).
A camada de persistência, que é responsável por armazenar e recuperar os dados semânticos. Esta camada usa Neo4j como banco de dados orientado a grafos e RDF como formato de representação de dados.
Funcionalidades
## A API oferece as seguintes funcionalidades:
![v2.png](img%2Fv1.png)
Cadastrar dados semânticos em formato RDF, usando o método POST na rota /api/v1/data.
Consultar dados semânticos usando consultas SPARQL, usando o método GET na rota /api/v1/query.
Visualizar os dados semânticos em formato gráfico, usando o método GET na rota /api/v1/graph.
Exportar os dados semânticos em formato JSON, usando o método GET na rota /api/v1/export.
Como executar
Para executar o projeto, você precisa ter instalado o Java 11 ou superior, o Maven e o Neo4j. Você também precisa configurar o Neo4j para usar o plugin APOC e o driver ## Bolt. Você pode seguir as instruções neste [link] para fazer isso.

## Depois de configurar o Neo4j, você pode executar o projeto usando os seguintes passos:

Clone o repositório do GitHub usando o comando git clone https://github.com/JoseRFJuniorBigData/priming_backend.git.
Entre na pasta do projeto usando o comando cd priming_backend.
Compile o projeto usando o comando mvn clean install.
Execute o projeto usando o comando java -jar target/priming_backend-0.0.1-SNAPSHOT.jar.
Acesse a interface gráfica no navegador usando o endereço http://localhost:8080.


