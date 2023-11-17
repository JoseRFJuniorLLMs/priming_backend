## Baseado em
https://www.linkedin.com/pulse/priming-jose-r-f-junior/?originalSubdomain=pt
![v0.png](img%2Fv0.png)

O priming é um efeito psicológico pelo qual a exposição a um determinado estímulo influencia na resposta a um estímulo subsequente, sem que haja qualquer consciência da conexão entre eles. Esses estímulos costumam estar relacionados a coisas corriqueiras, como imagens ou palavras que as pessoas veem no dia a dia com frequência.

O priming pode ser dividido em dois tipos principais:

Priming semântico: ocorre quando a exposição a uma palavra ou frase influencia a interpretação de outra palavra ou frase. Por exemplo, se uma pessoa é exposta à palavra "feliz", ela é mais propensa a interpretar uma frase como "O dia está lindo" como sendo positiva.
Priming perceptivo: ocorre quando a exposição a uma imagem ou som influencia a percepção de outra imagem ou som. Por exemplo, se uma pessoa é exposta a uma imagem de um rosto feliz, ela é mais propensa a interpretar outro rosto como sendo feliz, mesmo que o outro rosto não esteja sorrindo.
O priming pode ser usado de várias maneiras, incluindo:

Na publicidade: para influenciar as decisões de compra das pessoas. Por exemplo, uma empresa pode exibir imagens de pessoas felizes em suas propagandas para fazer com que os consumidores se sintam mais felizes e propensos a comprar seus produtos.
Na educação: para melhorar o aprendizado. Por exemplo, um professor pode apresentar aos alunos uma palavra ou frase relacionada ao tópico que está sendo estudado para ajudá-los a lembrar do material.
Na pesquisa científica: para estudar os processos cognitivos. Por exemplo, os pesquisadores podem usar o priming para investigar como as pessoas processam informações e tomam decisões.
O priming é um fenômeno poderoso que pode ter um impacto significativo no comportamento humano. É importante estar ciente do priming para que possamos evitar ser influenciados por ele de forma inconsciente.

Aqui estão alguns exemplos de priming:

Um estudo mostrou que as pessoas que foram expostas à palavra "velho" antes de fazer uma tarefa de memória eram mais propensas a cometer erros.
Outro estudo mostrou que as pessoas que foram expostas a um rosto feliz antes de fazer uma tarefa de criatividade eram mais propensas a gerar ideias originais.
Um terceiro estudo mostrou que as pessoas que foram expostas a um som de dinheiro antes de fazer uma tarefa de negociação eram mais propensas a fazer ofertas mais competitivas.


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
![v2.png](img%2Fv2.png)
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

## Games
![v3.png](img%2Fv3.png)
![v4.png](img%2Fv4.png)
![v5.png](img%2Fv5.png)
![v6.png](img%2Fv6.png)