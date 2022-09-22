
![logohellobank (2)](https://user-images.githubusercontent.com/106891550/191657706-f0bbb973-5af6-4d30-83f9-17b4f8d623e8.png)


## 👨🏻‍💻 Sobre o projeto

### 💻 Desenvolvedores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/lacerdaisab" target="_blank">
        <img src="https://avatars.githubusercontent.com/lacerdaisab" width="100px;" alt="Foto Isabel Lacerda"/> <br>
        <sub><b> Isabel Lacerda </b></sub> <br>
        <sub><i> </sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Filipe-Oliveir4" target="_blank">
        <img src="https://avatars.githubusercontent.com/Filipe-Oliveir4" width="100px;"alt="Foto Filipe Oliveira"/> <br>
        <sub><b> Filipe Oliveira </b></sub> <br>
        <sub><i>  </i></sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/tatiramoos" target="_blank">
        <img src="https://avatars.githubusercontent.com/tatiramoos" width="100px;" alt="Foto Tati Ramos"/> <br>
        <sub><b> Tati Ramos </b></sub> <br>
        <sub><i>  </i></sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/saculna" target="_blank">
        <img src="https://avatars.githubusercontent.com/saculna" width="100px;" alt="Foto Lucas de Andrade"/> <br>
        <sub><b> Lucas de Andrade </b></sub> <br>
        <sub><i>  </i></sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/priscilafraifer" target="_blank">
        <img src="https://avatars.githubusercontent.com/priscilafraifer" width="100px;" alt="Foto Priscila Fraifer"/> <br>
        <sub><b> Priscila Fraifer </b></sub> <br>
        <sub><i>  </i></sub> <br>
      </a>
    </td>
  </tr>
</table>



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

