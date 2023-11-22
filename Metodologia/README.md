
## <b> Projeto I </b> 
 
<details>

<summary>
	Mais Detalhes do Projeto I
</summary>
 
 ## Fatec

![image](https://user-images.githubusercontent.com/80988756/218878798-d33629bc-acf9-4edb-b463-b14fd8a90404.png)

##### *Figura 01. Fonte([fatecsjc-prd.azurewebsites.net](https://fatecsjc-prd.azurewebsites.net/curso-banco-de-dados.php))*

A Fatec é uma Faculdade Pública Estadual e todos os cursos oferecidos são gratuitos.
De uma forma geral a formação do Tecnólogo, além de aspectos técnicos, envolve também, uma base de caráter social, 
ético, filosófico e ambiental que faz deste cidadão um profissional ciente de sua inserção e responsabilidades no meio social que integra.


### Visão do Projeto

Projeto Julius consiste em um assistente virtual que auxilia o usuário na tomada de decisões relacionadas a investimentos financeiros. Entre as funcionalidades estão código de ações, cotação do dia, conversor de moedas entre outros. O diferencial de nossa aplicação é trazer informações em tempo real entregando o máximo de interatividade ao cliente. O nosso aplicativo traz o que há de mais inovador no mercado financeiro nacional.

- -  -  -  -  -  - 

* Responder a comando de voz ou sons específicos (palma, estalar de dedos, etc.);
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

### Participação Direta
- Fui responsável pela implementação da funcionalidade "Metas financeiras".
- Refatoração.
- Teste da aplicação para validar desempenho.

 <details open><summary>Função responsavel por coletar informações do investimento.</summary>
  
   <br>O método foi desenvolvido para prover uma experiência de usuário mais intuitiva durante o processo de inicialização do investimento, simulando a rentabilidade do investimento em um período definido.
	  
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

  * Este algoritmo recebe entradas de dados inseridas pelo usuário e responde por meio de uma saída de voz.
	
  *  Adicionalmente, foi criada uma função que trata possíveis erros ou perguntas incompreensíveis, retornando uma mensagem de erro personalizada para o usuário.
  
</details>

   
<details open><summary>Função para calcular as metas.</summary>
   
	
A função "metas" é um algoritmo simples que tem como objetivo calcular o tempo necessário para alcançar uma meta de investimento mensal com base no valor a 
ser investido e na meta a ser alcançada.

 
   ```py
	def metas():

	   sai_som('Quanto deseja investir? ')
	   num1 = float(input(''))

	   sai_som('Quanto deseja alcançar? ')
	   num2 = float(input(''))

	   Vf=  num2 / num1
	   sai_som(f'Você vai alcançar R${num2:.2f} em cerca de {Vf:.2f} meses se investir R${num1:.2f} por mês! ')
   ```
 
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
</details>

## <b> Projeto II </b> 

<details>

<summary>
	Mais Detalhes do Projeto II
</summary>
 
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



### Participação Direta
- Fui responsável pela implementação do algoritmo que parametriza as informações vindas do banco.
- Criação da logica para leitura do arquivo de configuração do banco de dados.
- Participação no desenvolvimento da forma de exibição dos dados retornados do banco

 <details open><summary>Algoritmos de parametrização dos dados</summary>
	 
  <br>Com base no parâmetro fornecido, o algoritmo ajusta a formatação dos dados para a apresentação mais adequada.
  <details open><summary></summary>
     
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
   - Aplicamos o conhecimentos de como lidar com bloco de condições else if, validando as possiveis entrada de dados e realizado o tratamento	
	
   - Esse algoritmo valida as informações de retorno da query, padronizando esse resultado conforme número de colunas e linhas, para ser salvo no formato csv.
	
   - Também foi utilizado a manipulação de array e formataçõa de string para que o retorno se enquadrace no resultado espedo.
	  
</details>
	
	
<details open><summary>Conexão com banco</summary>
<br> Para estabelecer a conexão com o banco de dados, é realizado a validação no arquivo de configuração que contém todas as parâmetros essenciais para a realização da conexão.
	
    ```java	
	       //BUSCA E LE ARQUIVO CONEXAO
        public Connection read() throws FileNotFoundException, IOException{
	
	FileWriter fw = new FileWriter(filepath,true);
	BufferedWriter bw = new BufferedWriter(fw);
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new FileReader(filepath));
	Properties p = new Properties();
	p.load(br);
	String connection=p.getProperty("connection");
	String user=p.getProperty("user");
	String pass=p.getProperty("pass");
	
	try {
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		return DriverManager.getConnection(connection,user,pass);
		
	} catch(Exception e){
		e.printStackTrace();
	}
	
	return null;
	 
	```

 - O código abre e lê um arquivo de configuração que contém informações necessárias para a conexão com o banco de dados, como URL de conexão, nome de usuário e senha.
 - Usando as informações lidas do arquivo de configuração, o código carrega o driver do banco de dados PostgreSQL e estabelece uma conexão com o banco de dados
</details>
	
Click aqui [GitHub](https://github.com/Jose-dos-Santos/SGBD_Health/blob/main/api1.2/src/conectar/Fileconnect.java) para mais detalhes :)
- O link acima traz detalhes da implementação do algoritmo

</details>

### Aprendizados Efetivos 


* O projeto desenvolvimento em Java consistiu em aplicar os conceitos aprendidos em aula para implementar classes e métodos, seguindo as exigências do semestre.
* Durante esse período, foi adotado o paradigma de programação orientada a objetos (POO) para desenvolver o projeto, conhecendo e aplicando seus conceitos.
* Esse foi o primeiro contato com um sistema gerenciador de banco de dados (SGBD), especificamente o PostGreSQL, e com a linguagem SQL. Nesse sentido, foi realizada a criação do banco de dados e a construção de consultas para atender aos requisitos do projeto.
* Outro aspecto relevante foi a conexão do software desenvolvido com o banco de dados, possibilitando a coleta de entradas por meio da implementação e o armazenamento desses dados. Com base nesses dados, foram construídas as métricas necessárias para atender às exigências do projeto.

</details>

## <b> Projeto III </b> 

 <details>

<summary>
	Mais Detalhes do Projeto III
</summary>
 
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



### Participação Direta
- Fui responsável pela implementação da lógica do motor de regras da API.
- Criação do algoritmo capaz de calcular os valores recebidos como parâmetro, 
devolvendo como resultado a melhor promoção a ser aplicada
no carrinho de compras.
- Participação na integração do front-end com back-end

 <details open><summary>Back-End - ProductPromotionService - retornaProdutoPromocao</summary>
  
<br> O objetivo deste método é analisar as promoções presentes no carrinho de compras e aplicar
     validações para atribuir o melhor desconto possível a um determinado produto.
	
   
   ```java
   
   public ResponseEntity<?> retornaProdutoPromocao(@RequestBody Integer id, Integer quantidade, Integer total,
			Integer categoria) {

		List<ProductPromotion> promotios = productPromotionRepository.findAll();

		List<ProductPromotion> productPromotion = new ArrayList<ProductPromotion>();

		Product product = productService.findById(id);

		productPromotion.addAll(product.getProductPromotions());
		int n = productPromotion.size();

		int i = 0;
		Double desconto = 0.0;
		Double valor = 0.0;
		Double valor2 = 0.0;

		if (total > 0) {
			System.out.println("Total");
			for (ProductPromotion promocao : promotios) {
				System.out.println("Total");
				if (promocao.getReceivePromotion().getCode() == 2 && total > promocao.getTotalCompra()) {
					if (promocao.getTypePromotion().getCode() == 1) {
						valor2 = promocao.getDiscount();

						if (valor2 > valor) {
							desconto = valor2;

						}
					}

					if (promocao.getTypePromotion().getCode() == 2) {
						valor2 = ((promocao.getDiscount() / 100) *  total );

						if (valor2 > valor) {
							desconto = valor2;

						}
						System.out.println(desconto);
					}
				}
			}
		}
   ``` 
	
* Esse método foi implementado na camada de service, por questão de organização do projeto.
     Sendo consumido na camada controller através de um método com uma anotação HTTP, no caso dessa
     requisição foi utilizado o verbo HttpPost.
   	
* Com base nos dados recebidos nos parâmetros, este método calcula e retorna o valor máximo do desconto para um produto, 
     considerando as promoções disponíveis e as regras estabelecidas.
	
* Uma outra validação é que o produto estando em mais de uma promoção após passar por esse método, será devolvido como retorno 
     a melhor promoção que se aplica para esse produto.

Click aqui [GitHub](https://github.com/Jose-dos-Santos/APIMidAll/blob/main/backend-midall/src/main/java/com/backend/backend/service/ProductPromotionService.java) para mais detalhes :)
- O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos da promoção

</details>   

- Participei de forma efetiva da integração do Front-End com Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Front-End</summary>
  
  
<br>Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.
   
     
   ```JavaScript
   
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

</details>

## <b> Projeto IV </b> 
 
<details>

<summary>
	Mais Detalhes do Projeto IV
</summary>
 
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

Foi utilizado o Vue.js para o desenvolvimento do front-end, responsável pela criação das interfaces de interação com o cliente e pela realização das requisições à API. No lado do back-end, optou-se pelo framework Flask para a criação da API, englobando o desenvolvimento das rotas HTTP, a conexão com o banco de dados, o tratamento de erros e a implementação das regras de negócio. Quanto ao banco de dados, optou-se pelo SQL Server, hospedado na plataforma Azure da Microsoft.



### Participação Direta
- Nesse projeto atuei de forma integral no time do back-end
- Participei da criação das ORMS e toda a estrutura do back
- Criação de algumas regras de negócio responsável por gerenciar o transição de dados da aplicação.

 <details open><summary> Classe AgendamentoService</summary>
  
 <br>Responsável por gerenciar e controlar os inputs e outputs, com toda regra de negócio para que um agendamento seja realizado.
     
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

 <details open><summary>Classe ChamadoService</summary>
  
  
<br>Responsável por gerenciar e controlar os dados relacionado a um chamado.
     
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


### Aprendizados Efetivos 



* O Framework Spring-Boot foi utilizado como a principal tecnologia para back-end, sendo uma ferramenta que oferece diversos recursos para facilitar o ambiente de programação em Java. O aprendizado foi aprimorado em relação à linguagem Java e à utilização desse framework, que apresenta recursos que facilitam muito a construção do projeto, por meio do Spring Initializr [start.spring.io](https://start.spring.io/) para mais detalhes.

* Aprendemos a aprimorar o conhecimento na API REST, que é um recurso da programação que trabalhamos pelo segundo semestre consecutivo. Essa tecnologia padroniza a forma que os dados são trafegados entre o cliente e o servidor.

* A implementação da camada de segurança da aplicação foi um passo importante para garantir a proteção dos dados e informações dos usuários. Aprendi sobre as melhores práticas de segurança, como criptografia de dados, controle de acesso, autenticação e autorização. Com isso, foi possível criar um ambiente mais seguro e confiável para os usuários, minimizando riscos de ataques e vazamentos de dados.

* O armazenamento do banco de dados na Oracle Cloud foi um grande desafio, mas trouxe muitos benefícios, como a facilidade de gerenciamento e a alta disponibilidade dos dados. Para garantir a segurança dos dados, aprendi sobre a configuração de políticas de segurança, backup e recuperação de dados, além de ter conhecimentos em gerenciamento de infraestrutura em nuvem.

* Aprendi sobre a importância dos padrões de projetos, que são soluções pré-definidas para problemas comuns de desenvolvimento de software. Com a aplicação desses padrões em nosso projeto, foi possível melhorar a manutenibilidade, escalabilidade e modularidade do código, tornando-o mais organizado e fácil de entender. Isso resultou em um código mais eficiente, redução de erros e melhor qualidade de software em geral.

</details>

## <b> Projeto VI </b> 

 <details>

<summary>
	Mais Detalhes do Projeto VI
</summary>
 
 ## Parceiro Acadêmico
Visiona</br>

![image](https://visionaespacial.com/wp-content/themes/VisionaEspacial/assets/img/logo-branca-completa.svg)
##### *Figura 01. Fonte(https://visionaespacial.com/)*

A Visiona Tecnologia Espacial é uma joint-venture entre a Embraer Defesa & Segurança e a Telebras, voltada para a integração de sistemas espaciais, criada em 2012 para atender os objetivos do Programa Nacional de Atividades Espaciais (PNAE) e do Programa Estratégico de Sistemas Espaciais (PESE). A empresa foi a responsável pelo Programa do Satélite Geoestacionário de Defesa e Comunicações Estratégicas, o SGDC, lançado em 2017. Em 2018, a Visiona anunciou o programa do primeiro satélite projetado integralmente pela indústria nacional, o VCUB1, e concluiu com êxito o primeiro Sistema de Controle de Órbita e Atitude de satélites desenvolvido no Brasil. A Visiona também fornece produtos e serviços de Sensoriamento Remoto e Telecomunicações por satélite, bem como Aerolevantamento SAR nas Bandas X e P.

### Visão do Projeto

Propomos uma solução abrangente que envolve a coleta e o refinamento dos dados públicos do ProAgro, a reestruturação eficiente da base de dados e o desenvolvimento de um Sistema de Informação Geográfica (SIG) personalizado, fornecendo informações de forma mais simples e organizada para o usuário. Essa abordagem busca facilitar a compreensão e análise dos dados, contribuindo para melhorias nos processos internos da empresa.


* Modelar um banco de dados relacionais espaciais a partir de tabelas do Proagro;
* Traçar o perímetro das parcelas informadas nas tabelas do Proagro no sistema de informações geográficas;
* Atribuir informação agrícola relevante às parcelas plotadas num sistema de informação geográfica;
* Cruzar as informações espaciais da Gleba com sua localização (Município e Estado);
* Conecte e consuma a API Visiona Vegetation Index Time Series;
* A consulta da API Visiona deve retornar uma série temporal para cada parcela consultada;
* Salvar séries temporais consumidas/consultadas no banco de dados;
* Desenvolva um front end simples que mostre as parcelas distribuídas espacialmente, um botão de seleção de parcelas e o gráfico do índice de acúmulo;
* A série temporal do índice de vegetação deverá ser apresentada por dados definidos entre 30 dias antes dos dados do plantio e 30 dias após os dados da colheita 
informados nas tabelas do Proagro e organizados no banco de dados.
* O tempo de resposta do site deve ser inferior a 1,5 minutos em 99,99% das obrigações;
* O mecanismo de consulta da aplicação deverá gerar trilhas no formato JSON (opcional);
* Documentação (Requisito Fatec)
* O sistema deve conter análises que ajudem a observar seu comportamento: Quantidade de requisições, tempo de resposta, quantidade e % de falhas na obtenção de dados do Golden Sources.


##### *Figura 02. Fonte(https://github.com/TechVisionn/tech-parent)*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/python/python-original-wordmark.svg" width="100"    height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/microsoftsqlserver/microsoftsqlserver-plain-wordmark.svg"  width="100" height="100" /> 
 <img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/vuejs/vuejs-original.svg" width="100" height="100"  />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" width="100" height="100" />
</div>

</br>


### Participação Direta
- Participei na estruturação do back-end.
- Auxiliei na criação das regras para implementação da LGPD.


 <details open><summary>Classe TokenResource</summary>
  
  
   <br>Nessa classe, ocorre algumas validações do usuário, sempre que ocorre o processo de login. Com base no termo de aceite, o sistema realiza o registro conforme a escolha do usuário.
     
   ```python
   
	   term = self.term_instance.find_one(user_history["id_term"])
	        if latest_term["version"] != term["version"] or _term is False:
	            if _term is None:
	                return make_response({"message": "User needs to update terms"})
	            if _term is False:
	                self.user_history.insert_one(
	                    {
	                        "id_user": user["_id"],
	                        "id_term": term["_id"],
	                        "accepted_term": _term,
	                        "update_date": datetime.today().strftime("%Y-%m-%d %H:%M:%S"),
	                        "parameters": {
	                            "option_one": False
	                            if _term_option_one is None
	                            else _term_option_one,
	                            "option_second": False
	                            if _term_option_second is None
	                            else _term_option_second,
	                        },
	                    }
	                )
		
   
   ```
   
* Recupera o termo atual do banco de dados com base no ID do usuário.
* Compara a versão do termo atual com a versão do termo mais recente.
* Se as versões forem diferentes, verifica se o usuário já aceitou os novos termos.
* Se o usuário não tiver aceitado os novos termos, atualiza o registro de histórico do usuário.


Click aqui [GitHub](https://github.com/TechVisionn/tech-backend/blob/main/flaskr/resources/token.py) para mais detalhes :)
* O link acima traz detalhes da implementação da classe TokenResource


### Aprendizados Efetivos 


* Optamos por utilizar o Framework Flask em Python como a principal tecnologia para desenvolver o back-end. Essa escolha não só agilizou o processo de programação, mas também proporcionou uma variedade de recursos que contribuíram para a solidez do nosso projeto.

* Desempenhei um papel crucial na implementação de práticas de DevOps, concentrando-me especialmente na execução de testes de unidade usando a biblioteca Pytest. Essa abordagem não apenas garantiu a estabilidade do código, mas também facilitou a integração contínua e a entrega contínua, promovendo uma cultura de desenvolvimento ágil.
  
* Adquiri e apliquei conhecimentos fundamentais em data warehousing, utilizando ferramentas como Looker Studio para o tratamento eficiente dos dados. A integração bem-sucedida desses conceitos no projeto não só enriqueceu minha compreensão, mas também resultou em uma manipulação de dados mais eficaz e informada.
  
* Desenvolvi uma compreensão abrangente de testes, abordando não apenas os testes de unidade, mas também os de integração e interface. A aplicação prática desses conhecimentos se destacou especialmente nos testes de unidade, onde minha abordagem meticulosa contribuiu significativamente para a confiabilidade e qualidade do código.

  



