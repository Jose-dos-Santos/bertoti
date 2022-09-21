# José Maria

## Introdução

Olá, seja bem-vindo. Sou o José Maria, estudante de Banco de Dados pela FATEC Prof. Jessen Vidal. 

Tenho 34 anos e trabalho como Desenvolvedor de Software Estagiario. <br/>

<img src="" width="300"/>

##### *Figura 00. Eu*

### Meus principais conhecimentos

#### Java

Minha atuação como desenvolvedor júnior tem como a principal stack a linguagem Java, na versão 1.8, desde março de 2021.
Trabalho desenvolvendo API's e serviços com o auxílio do framework Spring Boot e também do framework ORM Hibernate. 
Por conta desta experiência, Java e seu ecossistema para desenvolvimento web é onde possuo maior domínio e conhecimento. 

#### C#

Python foi a primeiras linguagem que estudei, ainda antes da graduação. Mesmo nunca tendo atuado profissionalmente com Python, diversos projetos pessoais e acadêmicos foram feitos com esta linguagem e seus frameworks e bibliotecas, como o Flask, Django e Pandas;
Este contato de anos com a linguagem me dá segurança para criar soluções em Python, algo que já se tornou frequente em minha trajetória como desenvolvedor.

#### Projetos Integradores durante a graduação 
Durante a minha gradução, trabalhei no desenvolvimento de trabalhos chamados de "Projetos integradores". Um projeto integrador tem o objetivo de solucionar um problema do mundo real, utilizando os conhecimentos adquiridos durante a graduação.<br/>
Abaixo todos estes projetos serão descritos, detalhando o problema, solução proposta (e entregue), e os aprendizamos extraídos de cada um deles.


# Projeto 3: 2º semestre de 2020


## Parceiro Acadêmico
Visiona <br/>
![image](https://user-images.)
##### *Figura 05. SPC Brasil*


### Visão do Projeto

Desenvolver um sistema web que atue como um mini ETL, convertendo shapefiles (arquivos que representam formatos geográficos) em bases de dados geográficas. 
Mais especificamente, em bancos gerenciados pelo PostgreSQL com o apoio da extensão PostGIS.

A sigla ETL (Extract, Transform and Load) resume bem a tarefa que possuíamos em mãos.

A ferramenta desenvolvida pela minha equipe, a VisGeo, se baseava em uma plataforma web onde um usuário poderia realizar a carga de dados geográficos
contidos em shapefiles em um banco dedados que possuísse suporte para este tipo de dado. Ou seja, nossa ferramenta deveria extrair os dados enviados pelo usuário,
tranformá-los no formato compatível com o banco de dados que receberia aquele lote de informações, e realizar a carga dos dados nesta base de dados.

O caminho inverso também deveria ser válido, permitindo converter a base de dados geográfica em shapefiles, permitindo o download destes arquivos conforme a solicitação do usuário.

Shapefiles são arquivos com diversos registros presentes. Estes registros poderiam ser ordenados e comportados em tabelas em um banco de dados geográfico. A VisGeo possibilitava que o usuário escolhesse em qual coluna da tabela criada na base de dados cada coluna de dados do shapefile fosse associada. Esta configuração "de para", assim como outros itens de usabilidade, podem ser vistos na demonstração abaixo:

![Usabilidade VisGeo](https://user-images.)
##### *Figura 04. Utilização da Visgeo - Carga de shapefile em banco geográfico, realizando a configuração de-para*


Link do repositório do projeto: https://github.com/

### Tecnologias adotadas na solução

#### GeoPandas

O GeoPandas é uma biblioteca de análise de dados geográficos. Com ela, é possível trabalhar com diversas fontes de dados geográficos, incluindo shapefiles e 
bases de dados geográficos, que eram as duas fontes necessárias para os requisitos do projeto.

Com o GeoPandas foi possível extrair, realizar conversões e ajustes necessários nos shapefiles, e realizar as cargas necessárias na base de dados selecionada 
pelo usuário da ferramenta.

Para saber mais sobre o GeoPandas, acesse sua [página oficial.](https://geopandas.org/)


#### Flask

Neste projeto os membros de nossa equipe obtiveram o primeiro contato com um framework web, e o utilizado neste momento foi o Flask.

O Flask é um microframework web, que funciona com base na linguagem de programação Python. O radical "micro" em "microframework" é empregado pois o escopo base 
do Flask é enxuto. Ou seja, o Flask não determina ou limita o modo com o qual o seu projeto web será construído. Ele falicita a implamentação básica de um sistema web, permitindo diversos modos de desenvolvimento. Por ser leve, enxuto e dinâmico no desenvolvimento de projetos, ele recebe esta denominação.

Saiba mais sobre o Flask em sua [página oficial.](https://flask.palletsprojects.com/en/2.0.x/).

O Flask foi um dos frameworks utilizados no sistema. Nossa ferramenta trabalhou com dois serviços principais. Um deles era responsável pelo serviço de ETL, que era o núcleo de nossa ferramenta. E outro framework (Express, citado a seguir) foi responsável por disponibilizar o serviço de criação e autenticação de usuários, outro requisito do sistema.

#### Express

O Express é um microframework web, que roda sobre o motor do Node.js
O Express é uma ótima solução para a construção de sistemas web, por meio dele, os serviços de autenticação e criação de usuários foram disponibilizados para nossa aplicação.


### Contribuições pessoais

Fui responsável pela criação dos algoritmos de fluxo de conversão do shapefile em uma tabela compatível com bases de dados geográficos.
Para isso, foi necessário estudar sobre uma área completamente nova, a de dados geográficos.

Durante a preparação para iniciar o desenvolvimento do projeto, consultei diversos materiais e documentações sobre o que eram os shapefiles, no que eles consistem, como os seus dados são estruturados e etc. Além disso, o mesmo tipo de pesquisa foi necessário para as bases de dados geográficos.

Shapefile é um formato para um conjunto de arquivos que, em conjunto, armazenam dados referentes à uma figura geográfica (ou simplesmente geométrica).

Para que estes dados possam ser salvos em tabelas de um banco de dados, extensões geográficas foram criadas para os sistemas gerenciadores de base de dados.
No caso utilizado por nós a pedido da empresa que propôs o problema, a extensão utilizada foi a [PostGIS](https://postgis.net/), que é a principal extensão geográfica para o PostgreSQL. 

Esta extensão adiciona ao sistema gerenciador de banco de dados diversas funções e tipos de dados, que permitem o gerenciamento, visualização e armazenamento dos dados geográficos importados.

Após profunda pesquisa sobre todos estes tópicos, fui responsável por construir os serviços que permitiram a transformação dos registros dos shapefiles em formatos compatíveis com os bancos de dados geográficos. Assim como o caminho inverso, extraindo dados de tabelas, convertendo-os em shapefiles e disponibilizando-os para download para os usuários da ferramenta. 

### Aprendizados Efetivos HS

No desenvolvimento dos serviços da VisGeo, aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend".
Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo específico das requisições possíveis de entrada no serviço desenvolvido.

Além disso, aprendi muito sobre uma área não relacionada diretamente a tecnologias de construção de software, mas que eram essenciais para as regras de negócio da operação do cliente do sistema. Esta habilidade de aprender de forma ágil sobre temas diversos, por conta das infinitas possíveis áreas de atuação de possíveis clientes, foi de grande valor para minha formação.

- Criação de serviços de extração e carga de dados geográficos: sei fazer com autonomia

- Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia
<br/>



## Contatos:

- [LinkedIn;](https://)
- [GitHub.](https://) 



