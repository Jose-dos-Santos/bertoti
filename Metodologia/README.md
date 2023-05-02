
# Projeto 1: 1º semestre de 2021
 
 
 ## Fatec

![image](https://user-images.githubusercontent.com/80988756/218878798-d33629bc-acf9-4edb-b463-b14fd8a90404.png)

##### *Figura 01. Fonte([fatecsjc-prd.azurewebsites.net](https://fatecsjc-prd.azurewebsites.net/curso-banco-de-dados.php))*

A Fatec é uma Faculdade Pública Estadual e todos os cursos oferecidos são gratuitos.
De uma forma geral a formação do Tecnólogo, além de aspectos técnicos, envolve também, uma base de caráter social, 
ético, filosófico e ambiental que faz deste cidadão um profissional ciente de sua inserção e responsabilidades no meio social que integra.


### Visão do Projeto

Projeto Julius consiste em um assistente virtual que auxilia o usuário na tomada de decisões relacionadas a investimentos financeiros. Entre as funcionalidades estão código de ações, cotação do dia, conversor de moedas entre outros. O diferencial de nossa aplicação é trazer informações em tempo real entregando o máximo de interatividade ao cliente. O nosso aplicativo traz o que há de mais inovador no mercado financeiro nacional.

- -  -  -  -  -  - 

*  Responder a comando de voz ou sons específicos (palma, estalar de dedos, etc.);
* Possuir no mínimo 8 ações distintas e de natureza distintas;
* Ser mobile, web ou desktop;
* Retornar o comando em qualquer forma (som, texto ou ação);
* Ter um contexto específico de aplicação;
* Não pode usar 100% de APIs prontas e disponíveis no mercado, seja gratuita ou não;
* Não pode utilizar de plataforma de implementação de terceiros, seja gratuita ou não.


Dessa forma, foi desenvolvido o Assistente Virtual Julius

<img src ="https://github.com/TheLooksDatabase/Julius/blob/main/3)%20Images/julius.png?raw=true" width="200" height="200" />

##### *Figura 02. Fonte([TheLooksDatabase/Julius](https://github.com/TheLooksDatabase/Julius))*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
  <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/python/python-original-wordmark.svg" width="100"    height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/vscode/vscode-original-wordmark.svg" width="100" height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/github/github-original-wordmark.svg" width="100" height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/mysql/mysql-original-wordmark.svg" width="100" height="100" />
</div>

</br>

- Beautifulsoup4, selenium e requests foram usadas para requisição de informações de páginas HTML para possuir a informação correta e atualizada.
- SpeechRecognition foi usada para reconhecimento e voz usando microfone.
- Pyttsx3: Foi usada para síntese de texto-voz.
- Google-api-python-client API utilizada para usufruir dos recursos de reconhecimento de voz do Google.
- Pycoingecko  utilizada para conversão de moedas utilizando código do Banco Central.

### Contribuições pessoais
- Fui responsável pela implementação da funcionalidade "Metas financeiras", também pela refatoração e teste da aplicação para melhor desempenho e performace.

 <details open><summary>Informações código Back-End</summary>
  
  
   1. Função responsavel por coletar informações do investimento.
     
   ```py
   
   def calculadora():
    resposta_erro_aleatoria = choice(lista_erros)
    try:

        sai_som('Qual o valor inicial que você investirá?')
        valor_inicial = float(input(''))

        sai_som('Quanto investirá por mês?')
        aporte = float(input(''))

        sai_som('Qual a taxa de rendimento mensal, em %?')
        taxa_porc = float(input(''))

        sai_som('Em quantos meses pretende resgatar seu investimento?')
        mes = int(input(''))

        taxa = taxa_porc/100
        ##o calculo a seguir se refere a um aporte mensal de dinheiro
        result_aporte = aporte*(((1+taxa)**mes)-1)/taxa
        ##já esse cálculo é o de juros compostos, considerando o investimento de um valor inicial e resgate em alguns meses.
        result_vinicial = valor_inicial*((1+taxa)**mes)
        valor_final = result_aporte + result_vinicial
        sai_som(f'O total acumulado será de R${valor_final:.2f} reais')
                        

    except: 
        sai_som(resposta_erro_aleatoria)      
              
   ```
	
  * O método foi desenvolvido para prover uma experiência de usuário mais intuitiva durante o processo de inicialização do investimento, simulando a rentabilidade do      investimento em um período definido.
	
  * Este algoritmo recebe entradas de dados inseridas pelo usuário e responde por meio de uma saída de voz.
	
  *  Adicionalmente, foi criada uma função que trata possíveis erros ou perguntas incompreensíveis, retornando uma mensagem de erro personalizada para o usuário.
	
</details>

   
  
   

<details open><summary>Metas</summary>
    1. Função para calcular as metas.
     
   ```py
	def metas():

	   sai_som('Quanto deseja investir? ')
	   num1 = float(input(''))

	   sai_som('Quanto deseja alcançar? ')
	   num2 = float(input(''))

	   Vf=  num2 / num1
	   sai_som(f'Você vai alcançar R${num2:.2f} em cerca de {Vf:.2f} meses se investir R${num1:.2f} por mês! ')
   ```
 
A função "metas" é um algoritmo simples que tem como objetivo calcular o tempo necessário para alcançar uma meta de investimento mensal com base no valor a ser investido e na meta a ser alcançada. A função pode ser dividida em dois tópicos:

* Inputs e cálculos: <br>
A função começa solicitando ao usuário o valor que deseja investir e o valor que deseja alcançar. Esses valores são armazenados nas variáveis num1 e num2, respectivamente. Em seguida, é feito um cálculo simples para determinar o tempo necessário para alcançar a meta, com base na razão entre o valor desejado e o valor a ser investido mensalmente. O resultado é armazenado na variável Vf.

* Output:<br>
Por fim, a função imprime uma mensagem informando ao usuário quanto tempo será necessário para alcançar a meta, considerando o valor investido mensalmente. A mensagem é impressa com a função sai_som, que converte a mensagem em áudio, além de ser impressa no console.
</details>


### Aprendizados Efetivos 

* O primeiro contato com uma linguagem de programação ocorreu por meio do uso do Python.
* Foi realizada a compreensão da metodologia ágil Scrum, buscando entender e aplicar seus conceitos.
* O paradigma de programação imperativo foi adotado na construção do projeto, seguindo uma abordagem estrutural.
* Foi iniciado o aprendizado da lógica de programação, buscando encontrar a melhor solução computacional para a resolução de problemas.
* Houve a introdução às primeiras estruturas de dados utilizadas no projeto, tendo como base a linguagem Python.

# Projeto 2: 2º semestre de 2022
 
 
 ## Parceiro Acadêmico
Nector</br>

![image](https://user-images.githubusercontent.com/80851038/133914328-794317fa-31e1-4279-afb0-d986acb5db45.png)
##### *Figura 01. Fonte(https://necto.com.br/)*
Necto Systems foi criada para prover soluções de software.
A principal ferramenta desde de 2006 é a linguagem Python.
Participamos de grandes projetos em diferentes áreas, desenvolvendo soluções de software que dão suporte a processos complexos com engenharia de dados e "DataScience"


### Visão do Projeto

É uma aplicação de monitoramento voltada somente à SGBDs, focada na performance e desempenho. Através da coleta de dados do SGBD (memória, tempo de consultas, espaço em disco, transações, evolução da memória, caches e registros) que influenciam na saúde e manutenção periódica:

* Conexão SGBD;
* Coleta de métricas de um ou mais SGBDs (PostgreSQL) remoto;
* Tratamento das métricas (histórico, registro, relatórios, disponibilidade, alertas e valores atingidos durante a operação):
* Tratamento de métricas de forma tabular;
* Salvar consultas em CSV;
* Tabular métricas;
* Coleta periódica de métricas;
* Histórico de métricas;
* Relatórios de métricas;
* Alertas por email;
* Funcionamento do BD (tempo e quantidade de queries e uso de índices).
* Ativar ou Desativar Interface Gráfica;
* Cadastro de dados de conexão dos SGBDs (acesso à estastítica por tabelas).

Dessa forma, foi desenvolvido o SGBD Health


<img src ="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/LogoPNG.png?raw=true" width="300" height="300"/>

##### *Figura 02. Fonte(https://github.com/DolphinDatabase/SGBD_Health)*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="100" height="100" />
 <img src="https://icongr.am/devicon/postgresql-original-wordmark.svg?size=128&color=currentColor" width="100" height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/sqlite/sqlite-original.svg" width="100" height="100" />
 <img src="https://icongr.am/devicon/github-original.svg?size=128&color=currentColor" width="100" height="100" />
</div>

</br>

Como foi uma aplicação voltada para métricas de um servidor monitorando o sistema SGBT, utilizamos conexão JDBC do Java para conectar ao SGBD PostgreSql, SqLite para armazenar config da aplicação, GitHub para versionamento do código.



### Contribuições pessoais
- Fui responsável pela implementação do algoritmo que parametriza as informações vindas do banco e com esses parâmetros salva os resultados no formato csv.

 <details open><summary>Informações código Back-End</summary>
  
  
   1. Criação do algoritmos de parametrização dos dados.
     
   ```java
   
   	if (i == 4 && j == 6) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", "").substring(0, 25)
							+ "...");
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);

				} else if (i == 4 && j == 7) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", ""));
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);
				} else if (i == 4) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2));
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);    
   ```
   
   - Esse algoritmo valida as informações de retorno da query, padronizando esse resultado conforme número de colunas e linhas, para ser salvo no formato csv. 
	

Click aqui [GitHub](https://github.com/DolphinDatabase/SGBD_Health/blob/main/api1.2/src/conectar/Csv.java) para mais detalhes :)
- O link acima traz detalhes da implementação do algoritmo

</details>

### Aprendizados Efetivos 


* O projeto inaugural de desenvolvimento em Java consistiu em aplicar os conceitos aprendidos em aula para implementar classes e métodos, seguindo as exigências do semestre.
* Durante esse período, foi adotado o paradigma de programação orientada a objetos (POO) para desenvolver o projeto, conhecendo e aplicando seus conceitos.
* Esse foi o primeiro contato com um sistema gerenciador de banco de dados (SGBD), especificamente o PostGreSQL, e com a linguagem SQL. Nesse sentido, foi realizada a criação do banco de dados e a construção de consultas para atender aos requisitos do projeto.
* Outro aspecto relevante foi a conexão do software desenvolvido com o banco de dados, possibilitando a coleta de entradas por meio da implementação e o armazenamento desses dados. Com base nesses dados, foram construídas as métricas necessárias para atender às exigências do projeto.


# Projeto 3: 1º semestre de 2022
 
 
 ## Parceiro Acadêmico
MidAll</br>

![image](https://static.wixstatic.com/media/456d95_16b15ab71cf54b9aa97150aaefefbbde~mv2.png/v1/fill/w_178,h_141,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/Logo%2520MidAll_edited.png)
##### *Figura 01. Fonte(www.midall.com.br)*

A MidAll é uma empresa de serviços e consultoria em TI, com sede no Parque Tecnológico em São José dos Campos. Desenvolve soluções de data driven, transformação digital, agilidade e eficiência e governança e segurança.


### Visão do Projeto

Criação de um motor de promoções em um Ecommerce, onde a criação, edição e exclusão de promoções possam ser feitas de forma ágil e intuitiva. Com requisitos funcionais:
* Interface de cadastro de produtos e promoções;
* Edição de produtos;
* Carrinho de compras;
* Criação de promoções;
* Categoria de promoções;
* Listagem de produtos e promoções.


Dessa forma, foi desenvolvido o PromoAll

<img src ="https://github.com/Doc-Docker/APIMidAll/blob/main/Images/logo2promoall.png" width="300" height="300"/>

##### *Figura 02. Fonte(www.github.com/Doc-Docker/APIMidAll)*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/microsoftsqlserver/microsoftsqlserver-plain-wordmark.svg"  width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/angularjs/angularjs-original-wordmark.svg" width="100" height="100"  />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" width="100" height="100" />
</div>

</br>

Para o front-end foi utilizado o Angular que é uma plataforma baseada em Typescript, para criação das telas de interação com o cliente, e para realizar as requisições para a API que foi desenvolvida. O Java com o framework Spring foi utilizado para criação da API de backend, com a criação das rotas HTTP, conexão com o banco de dados, tratamento de erros e aplicação das regras de negócio. Como banco de dados, foi utilizado o H2 que é um sistema de gerenciamento de banco de dados relacional em memória



### Contribuições pessoais
- Fui responsável pela implementação da lógica do motor de regras da API,
criei um algoritmo capaz de calcular os valores recebidos como parâmetro, 
devolvendo como resultado a melhor promoção a ser aplicada
no carrinho de compras

 <details open><summary>Informações código Back-End</summary>
  
  
   1. Criação do algoritmos de cálculo para retorno dos valores das promoções.
     
   ```java
   
   public ResponseEntity<?> retornaProdutoPromocao(@RequestBody Integer id, Integer quantidade, Integer total,
			  Integer categoria) {

		       List<ProductPromotion> promotios = productPromotionRepository.findAll();
		       List<ProductPromotion> productPromotion = new ArrayList<ProductPromotion>();

		       Product product = productService.findById(id);
		       productPromotion.addAll(product.getProductPromotions());
		       int n = productPromotion.size();
         
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);     
   ```
   
   - Esse método foi implementado na camada de service, por questão de organização do projeto.
     Sendo consumido na camada controller através de um método com uma anotação HTTP, no caso dessa
     requisição foi utilizado o verbo HttpPost. 
     
   - O algoritmo implementado é responsável por receber os parâmetros vindos do front end, 
      esses parâmetros são filtrados por uma camada de condições, verificando o melhor valor de retorno para uma 
      determinado produto que esteja em uma promoção, esse retorno é devolvido para camada controller que por sua vez devolve 
      o resultado para a interface.


Click aqui [GitHub](https://github.com/Jose-dos-Santos/APIMidAll/blob/main/backend-midall/src/main/java/com/backend/backend/service/ProductPromotionService.java) para mais detalhes :)
- O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos da promoção

</details>   

- Participei de forma efetiva da integração do Front-End com Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Informações código Front-End</summary>
  
  
   1. Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.
   
     
   ```java
   
        this.total = this.noDiscount += (element.price  * element.quantidade);

        this.service.getDiscount(this.id, this.quantidade, this.total, this.categoria).subscribe(
            response =>
            { const product : Product = new Product();
              this.discount = response;
              this.product.discount = this.discount
              this.finalPrice = this.finalPrice += (element.price * element.quantidade)-(this.discount)
              console.log("teste", this.categoria)
            errorResponse => console.log(errorResponse)
        })
    });
         
         
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);     
   ```
   - Esse método é responsável por passar os parâmetros para o back-end, processar a informação e direcionar o retorno para a camada de visualização do usuário,
  sendo um trecho importante pois enviar dados, processa o retorno e já devolve os resultados para usuário.

     

<details close></summary></summary>

Click aqui [GitHub](https://github.com/Doc-Docker/APIMidAll/blob/main/frontend-midall/src/app/cart.service.ts) para mais detalhes :)
-O link acima traz detalhes da implementação do método responsável por enviar a requisição para back-end. 
</details>


</details>   

### Aprendizados Efetivos 


* O Framework Spring-Boot foi a tecnologia principal utilizada para iniciar o projeto, oferecendo diversos recursos para facilitar o ambiente de programação ao codificar em Java. Foi utilizado o Spring Initializr (start.spring.io) para criar o projeto inicial com facilidade.
* API REST, também conhecida como API RESTful, é uma interface de programação de aplicações que segue as restrições do estilo de arquitetura REST, permitindo interação com serviços web RESTful. REST significa Transferência Representacional de Estado.
* No desenvolvimento do sistema de E-commerce para a MidAll, foi possível adquirir novos aprendizados e aprofundar outros, incluindo o desenvolvimento de telas com Angular, utilizando HTML e CSS, além do framework Bootstrap para o frontend.
* Também foi necessário aprender sobre a linguagem TypeScript para criar os arquivos service e efetivar as requisições HTTP, além de aprofundar conhecimentos sobre o protocolo HTTP e as requisições GET, POST, PUT e DELETE.
* Outros aprendizados incluíram a criação de um objeto JSON para envio nas requisições, como fazer requisições no backend utilizando a API httpClient do Angular e aprofundamento em aprendizados de banco de dados, DML, DQL e criação de arquitetura de tabelas.
* A criação do projeto em Angular exigiu conhecimento sobre a estrutura de pastas utilizada na plataforma.

Os conhecimentos adquiridos em aula foram fundamentais para o desenvolvimento do projeto, incluindo a aplicação dos padrões de arquitetura, tornando-o componentizável e seguindo modos de construção comuns utilizados no mercado e comunidade. Também foi necessário criar o banco de dados utilizado na aplicação, seguindo o padrão de chaves primárias e estrangeiras nas tabelas, bem como a criação do modelo e entidades do banco. Aprendizados sobre os frameworks utilizados, Angular e Spring, também foram importantes para o sucesso do projeto.



# Projeto 4: 2º semestre de 2022
 
 
 ## Parceiro Acadêmico
Subiter</br>

![image](https://github.com/Doc-Docker/APISubiter/blob/main/docs/Imagens/logosubiter.png?raw=true)
##### *Figura 01. Fonte(https://www.subiter.com/)*

A Subiter é uma empresa de base tecnológica especializada em visão infravermelha. Nossa missão é ajudar a indústria a alcançar excelência em seus processos produtivos. Por meio de sistemas inteligentes de inspeção e monitoramento, podemos observar fenômenos que estão além da capacidade dos olhos humanos.


### Visão do Projeto

Temos um desafio de sincronização dos dados administrativos, financeiros e operacionais referentes aos serviços prestados pela empresa. A falta de organização dos dados acarreta lentidão para atender chamados, e confusão na interpretação dos indicadores comerciais e financeiros.

 * Cadastros de Usuários, Equipamentos e Horários;
 * Usuários devem ter perfis diferentes (administrador, suporte, cliente);
 * Registro de chamados;
 * Acompanhamento de chamados de ponta a ponta;
 * Front-End para entrada e interpretação de dados.


##### *Figura 02. Fonte(https://github.com/Doc-Docker/APISubiter)*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="100" height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/oracle/oracle-original.svg"  width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" width="100" height="100" />
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/vuejs/vuejs-original.svg" width="100" height="100"  />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" width="100" height="100" />
</div>

</br>

Para o front-end foi utilizado o Vue.js , para criação das telas de interação com o cliente, e para realizar as requisições para a API que foi desenvolvida. O Java com o framework Spring foi utilizado para criação da API de backend, com a criação das rotas HTTP, conexão com o banco de dados, tratamento de erros e aplicação das regras de negócio. Como banco de dados, foi utilizado o H2 para testes na implementação e o banco da api foi Oracle cloud um banco em nuvem.



### Contribuições pessoais
- Nesse projeto atuei de forma integral no time do back-end, ajudando na criação das ORMS e toda a estrutura do back, criando algumas regras de negócio responsável por gerenciar o transição de dados da aplicação.

 <details open><summary>Informações código Back-End</summary>
  
  
   1.Classe AgendamentoService, responsável por gerenciar e controlar os inputs e outputs, com toda regra de negócio para que um agendamento seja realizado.
     
   ```java
   
   @Autowired
	private EquipamentoSerieRepository equipamentoSerieRepository;

	public Agendamento save(Agendamento agendamento) {

		Chamado chamado = chamadoRepository.getById(agendamento.getChamadoAgendamento().getId());

		if (chamado.getAgendamento() != null) {

			if (chamado.getAgendamento().getId() != 0) {

				return agendamentoRepository.findById(-1)
						.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
								"Esse Chamado já possui um agendamento"));

			}
		}
   
   ```
   
   - Esse método está na camada service, com a simples tarefa de verificar a tentativa de inserção de um novo Agendamento.
     Como um agendamento tem relação direta com chamado, sempre que houver uma tentativa de inserção será verificado se existe um chamado existente. 
     
   - Nessa classe ainda tem outros três métodos para completar o crud, cada um com suas validações e regras necessárias para que uma informação possa ser consultada, persistida, alterada ou eliminada do banco de dados da aplicação.


Click aqui [GitHub](https://github.com/Doc-Docker/APISubiter/blob/main/APISubiterBackend/src/main/java/com/subiter/backend/APISubiterBackend/service/AgendamentoService.java) para mais detalhes :)
* O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos para um agendamento

</details>   

 <details open><summary>Informações código Back-End</summary>
  
  
   1.Classe ChamadoService, responsável por gerenciar e controlar os dados relacionado a um chamado.
     
   ```java
   
   public Chamado updateChamadoById(Integer id, Chamado chamado) {
		Chamado chamadoSelector = this.getChamadoById(id);
		String Ns = "";
		if(chamadoSelector.getAgendamento() != null) {
			Ns = chamadoSelector.getAgendamento().getNumerosSerie();
		}
		

		EquipamentoSerie equipamentoSerie = this.equipamentoSerie.getById(Ns);

		if (chamado.getSituacaoChamado().equals("F") || chamado.getSituacaoChamado().equals("f")) {

			equipamentoSerie.setDisponibilidade(true);
			chamadoSelector.setEncerramentoChamado(LocalDate.now());
			this.equipamentoSerie.save(equipamentoSerie);

		}

		chamadoSelector.setCriticidadeChamado(chamado.getCriticidadeChamado());

		chamadoSelector.setDataChamado(chamado.getDataChamado());

		chamadoSelector.setDescricaoChamado(chamado.getDescricaoChamado());

		chamadoSelector.setSituacaoChamado(chamado.getSituacaoChamado());

		chamadoSelector.setSolucaoChamado(chamado.getSolucaoChamado());

		

		return chamadoRepository.save(chamadoSelector);
	}
   
   ```
   
* Verificação da disponibilidade do equipamento: <br>
O método inicia com uma verificação da disponibilidade do equipamento associado ao chamado, por meio do número de série (variável "Ns"). Caso o agendamento do chamado já tenha um número de série definido, esse valor é atribuído à variável "Ns". Em seguida, é feita uma busca no banco de dados pelo equipamento com o número de série informado.<br>
Se a situação do chamado informada for "F" ou "f" (ou seja, o chamado está sendo finalizado), o equipamento é marcado como disponível e a data de encerramento do chamado é definida como a data atual. Em seguida, é feito o salvamento do equipamento no banco de dados.

* Atualização das informações do chamado: <br>
Após a verificação da disponibilidade do equipamento, são atualizadas as informações do chamado com base nos valores informados pelo usuário. As informações atualizadas incluem a criticidade do chamado, a data do chamado, a descrição do chamado, a situação do chamado e a solução do chamado.

* Salvamento das alterações no banco de dados: <br>
Por fim, o método realiza o salvamento das informações atualizadas no banco de dados e retorna o objeto do tipo Chamado atualizado.


Click aqui [GitHub](https://github.com/Doc-Docker/APISubiter/blob/main/APISubiterBackend/src/main/java/com/subiter/backend/APISubiterBackend/service/ChamadoService.java) para mais detalhes :)
* O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos para um agendamento

</details> 


<details open><summary>Informações código Back-End</summary>
  
  
   1.Classe ChamadoService, responsável por gerenciar e controlar os dados relacionado a um chamado.
     
   ```java
   
	  @PreAuthorize("hasAnyRole('CLIENT', 'SUPORTE')")
	    @PatchMapping("/{id}")
	    @JsonView(View.ChamadoView.class)
	    public Chamado updateChamadoById(@PathVariable Integer id, @RequestBody Chamado chamado){

		return chamadoService.updateChamadoById(id, chamado);
	    }

   ```
   
* Esse código apresenta uma implementação de segurança por meio do uso da anotação @PreAuthorize, que permite limitar o acesso aos endpoints da API somente a usuários com permissões específicas. No caso desse método, somente usuários com as roles "CLIENT" ou "SUPORTE" têm acesso ao endpoint.

* Além disso, a anotação @PatchMapping é utilizada para indicar que esse endpoint está preparado para receber requisições HTTP do tipo PATCH, que permitem a atualização parcial de recursos existentes. Já a anotação @JsonView é utilizada para limitar o conteúdo da resposta à visualização definida na classe View.ChamadoView.

* Por fim, o método chama o serviço chamadoService.updateChamadoById, que é responsável por atualizar um chamado existente no banco de dados com as informações passadas no corpo da requisição.

</details> 


### Aprendizados Efetivos 



* O Framework Spring-Boot foi utilizado como a principal tecnologia para back-end, sendo uma ferramenta que oferece diversos recursos para facilitar o ambiente de programação em Java. O aprendizado foi aprimorado em relação à linguagem Java e à utilização desse framework, que apresenta recursos que facilitam muito a construção do projeto, por meio do Spring Initializr [start.spring.io](https://start.spring.io/) para mais detalhes.

* Aprendemos a aprimorar o conhecimento na API REST, que é um recurso da programação que trabalhamos pelo segundo semestre consecutivo. Essa tecnologia padroniza a forma que os dados são trafegados entre o cliente e o servidor.

* A implementação da camada de segurança da aplicação foi um passo importante para garantir a proteção dos dados e informações dos usuários. Aprendi sobre as melhores práticas de segurança, como criptografia de dados, controle de acesso, autenticação e autorização. Com isso, foi possível criar um ambiente mais seguro e confiável para os usuários, minimizando riscos de ataques e vazamentos de dados.

* O armazenamento do banco de dados na Oracle Cloud foi um grande desafio, mas trouxe muitos benefícios, como a facilidade de gerenciamento e a alta disponibilidade dos dados. Para garantir a segurança dos dados, aprendi sobre a configuração de políticas de segurança, backup e recuperação de dados, além de ter conhecimentos em gerenciamento de infraestrutura em nuvem.

* Aprendi sobre a importância dos padrões de projetos, que são soluções pré-definidas para problemas comuns de desenvolvimento de software. Com a aplicação desses padrões em nosso projeto, foi possível melhorar a manutenibilidade, escalabilidade e modularidade do código, tornando-o mais organizado e fácil de entender. Isso resultou em um código mais eficiente, redução de erros e melhor qualidade de software em geral.
 

