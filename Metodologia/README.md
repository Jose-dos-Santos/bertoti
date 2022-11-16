# José Maria

## Introdução

Olá, seja bem-vindo. Sou o José Maria, estudante de Banco de Dados pela FATEC Prof. Jessen Vidal. 

Tenho 34 anos e trabalho como Desenvolvedor de Software Estagiario. <br/>

<img src="" width="300"/>

##### *Figura 00. Eu*

### Meus principais conhecimentos

#### C#



#### Java

 

#### Projetos Integradores durante a graduação 



# Projeto 3: 2º semestre de 2020


## Parceiro Acadêmico
Visiona <br/>
![image](https://user-images.)
##### *Figura 05. SPC Brasil*


### Visão do Projeto



<img src="https://github.com/Doc-Docker/APIMidAll/blob/main/Images/logo2promoall.png" width="500"/>



Link do repositório do projeto: https://github.com/

### Tecnologias adotadas na solução

#### API PromoAll



### Contribuições pessoais
- Fui responsável pela implementação da lógica do motor de regras da API,
criei um algoritmo capaz de calcular os valores recebidos como parâmetro, 
devolvendo como resultado a melhor promoção a ser aplicada
no carrinho de compras

 <details open><summary>Informações código Back-End</summary>
  
  
   1. Criação do algoritmos de cálculo para retorno dos valores das promoções.
     
   ```js
   
   public ResponseEntity<?> retornaProdutoPromocao(@RequestBody Integer id, Integer quantidade, Integer total,
			  Integer categoria) {

		       List<ProductPromotion> promotios = productPromotionRepository.findAll();
		       List<ProductPromotion> productPromotion = new ArrayList<ProductPromotion>();

		       Product product = productService.findById(id);
		       productPromotion.addAll(product.getProductPromotions());
		       int n = productPromotion.size();
         
         ...
         
         return new ResponseEntity<>(desconto, HttpStatus.OK);     
   ```
   
   - Esse método foi implementado na camada de service, por questão de organização do projeto.
     Sendo consumido na camada controller através de um método com uma anotação HTTP, no caso dessa
     requisição foi utilizado o verbo HttpPost. 
     
   - O algoritmo implementado é responsável por receber os parâmetros vindos do front end, 
      esses parâmetros são filtrados por uma camada de condições, verificando o melhor valor de retorno para uma 
      determinado produto que esteja em uma promoção, esse retorno é devolvido para camada controller que por sua vez devolve 
      o resultado para a interface.


<details close></summary></summary>

Click aqui [GitHub](https://github.com/Jose-dos-Santos/APIMidAll/blob/main/backend-midall/src/main/java/com/backend/backend/service/ProductPromotionService.java) para mais detalhes :)
- O link acima traz detalhes da implementação da classe de serviço responsável por todos os métodos da promoção
</details>


</details>   

- Participei de forma efetiva da integração do Front-End com Back-End, criando alguns métodos e realizando testes para validação das requisições.

 <details open><summary>Informações código Front-End</summary>
  
  
   1. Trecho do código responsável de receber o retorno do back-end, da explicação citada acima.
   
     
   ```js
   
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
         
         ...
         
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



- 

- 



## Contatos:

- [LinkedIn;](https://)
- [GitHub.](https://) 



