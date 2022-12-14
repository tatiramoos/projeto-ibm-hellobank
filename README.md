
![Purple Minimalist Business Banking  Facebook Ad](https://user-images.githubusercontent.com/106891550/191754324-5e9a9679-2785-40f5-99b0-e30f39777ee1.png)

<h1 align="center">
  HelloBank
</h1>

## 🐱‍💻 Sobre o projeto

Recebemos o desafio de desenvolver uma aplicação para a nova plataforma do Banco HelloBank. Essa nova plataforma tem como objetivo gerenciar transações dos clientes do banco. O sistema deve permitir cadastro de novos clientes, incluindo dados pessoais e dados para contato. O cliente deve ser atrelado a uma conta bancária e registrar histórico de transações entre contas.


## 🤯💻 | Equipe 03 - {Mãe, tô na IBM!!!}

## Kanban no Trello 
![Captura de Tela 2022-09-23 às 12 08 28](https://user-images.githubusercontent.com/106891550/191993086-24126ddb-d657-4beb-a4ac-bec5a1907628.png)

## Back-end

<p>Nosso back-end consiste em um banco de dados para o armazenamento de clientes, endereços, usuários, contas e transações feitas pelos clientes
e uma API para gerenciar transações dos clientes do banco. </p>


## Modelo Entidade-Relacionamento

![diagramabd](https://user-images.githubusercontent.com/106891550/191657354-b21ce5a8-e524-4ab2-97f0-fe1d13391be4.png)

[hellobank.zip](https://github.com/tatiramoos/projeto-ibm-hellobank/files/9622178/hellobank.zip)


## Endpoints de Clientes

 <b> GET - Lista todos os clientes </b>

`GET /clientes/listar`

    @GetMapping("/listar")
    @ApiOperation(value = "Lista todos os clientes")
    public ArrayList<Cliente> buscaClientes() {
        return service.listarClientes();
    }

<b> POST - Cadastra um cliente </b>

`POST /clientes/cadastrar`

    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastra um cliente")
    public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente novo) {
        Cliente res = service.cadastrarCliente(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

<b> PUT - Atualiza os dados de um cliente </b>

`PUT /clientes/atualizar`

    @PutMapping(value = "atualizar")
    @ApiOperation(value = "Atualiza os dados de um cliente")
    public ResponseEntity <Cliente> alterarCliente(@RequestBody Cliente dados) {
      Cliente res = service.atualizarCliente(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();
    }

<b> GET - Busca um único cliente </b>

`GET /clientes/buscar`

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Busca um único cliente")
    public ResponseEntity<Cliente> buscarID(@PathVariable Integer id) {
        Cliente res = service.buscarID(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }
        
 <b> DELETE - Deleta um cliente </b>

`DELETE /clientes/deletar`

     @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deleta um cliente")
    public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer id){
        service.deletarCliente(id);
            return ResponseEntity.ok(null);
    }  

 ## 🚀 Tecnologias

<code>
  <img src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
  <img src="https://img.shields.io/badge/Shell_Script-121011?style=for-the-badge&logo=gnu-bash&logoColor=white"/>
  <img src="https://img.shields.io/badge/Visual_Studio-5C2D91?style=for-the-badge&logo=visual%20studio&logoColor=white"/>
  <img src=https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white/>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/Jenkins-D33833?style=for-the-badge&logo=jenkins&logoColor=white"/>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
  <img src="https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white"/>
</code>

