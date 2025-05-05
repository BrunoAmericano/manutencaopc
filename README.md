# 🛠️ Sistema de Controle de Manutenção de Computadores

🎯 Projeto desenvolvido para facilitar e organizar o **registro, acompanhamento e gerenciamento de manutenções de computadores**, promovendo **eficiência, controle e rastreabilidade** de todas as operações em um ambiente técnico.

---

## 📌 Objetivo

Este sistema RESTful permite que empresas ou profissionais autônomos da área de TI:

- Cadastrem clientes e computadores
- Registrem técnicos responsáveis pelos reparos
- Acompanhem peças utilizadas e serviços prestados
- Emitam ordens de serviço com todos os detalhes da manutenção
- Centralizem as informações para melhor tomada de decisão

---

## 🧪 Tecnologias Utilizadas

| Ferramenta        | Descrição                                                                 |
|-------------------|--------------------------------------------------------------------------|
| 🟦 Java 17         | Linguagem de programação principal                                       |
| 🌱 Spring Boot 3   | Framework para construção de APIs REST                                   |
| 📦 Maven           | Gerenciador de dependências e builds                                     |
| 🛢️ PostgreSQL      | Banco de dados relacional                                                |
| ☁️ Railway         | Plataforma para deploy da API e banco de dados em nuvem                  |
| 🧭 Swagger UI      | Interface visual para documentação e testes da API                       |
| 🔐 Spring Security | Pronto para ser integrado com autenticação (não habilitado por padrão)  |

---

## 🗂️ Estrutura do Projeto

    manutencaopc/
    ├── controller/
    ├── service/
    ├── model/
    ├── repository/
    ├── resources/
    │ └── application.properties
    └── ManutencaoPcApplication.java


---

## 🚀 Como Executar o Projeto Localmente

### 1️⃣ Pré-requisitos

- Java 17 instalado
- Maven instalado
- PostgreSQL local ou acesso a banco no Railway
- IDE (IntelliJ, Eclipse ou VSCode com extensão Java)

### 2️⃣ Clonar o Repositório

```bash
git clone https://github.com/seuusuario/controle-manutencao.git
cd controle-manutencao
```
### 3️⃣ Configurar o Banco de Dados
Atualize o arquivo ```src/main/resources/application.properties``` com as informações do seu banco:

```
spring.datasource.url=jdbc:postgresql://<HOST>:<PORT>/<DATABASE>
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
### Exemplo com Railway:

```
spring.datasource.url=jdbc:postgresql://switchyard.proxy.rlwy.net:25572/railway
spring.datasource.username=postgres
spring.datasource.password=ZEYlZRPCJZoVhjXYWIbVoLmhVYvCmpob
```

### 4️⃣ Executar a Aplicação
Via terminal:

```
./mvnw spring-boot:run
```
Ou execute a classe ```ManutencaoPcApplication.java``` diretamente pela sua IDE.

## 📚 Acesso ao Swagger
Assim que o projeto estiver rodando, acesse:

```
http://localhost:8080/swagger-ui.html
```
Aqui você poderá visualizar, testar e documentar todos os endpoints da API com uma interface amigável.

## 🔍 Endpoints Disponíveis
### 🧑 Clientes
```
GET /api/clientes – Listar todos os clientes

POST /api/clientes – Criar um novo cliente

GET /api/clientes/{id} – Buscar cliente por ID

PUT /api/clientes/{id} – Atualizar cliente

DELETE /api/clientes/{id} – Remover cliente
```

### 💻 Computadores
```
GET /api/computadores

POST /api/computadores

GET /api/computadores/{id}

PUT /api/computadores/{id}

DELETE /api/computadores/{id}
```

### 🧰 Técnicos
```
GET /api/tecnicos

POST /api/tecnicos

GET /api/tecnicos/{id}

PUT /api/tecnicos/{id}

DELETE /api/tecnicos/{id}
```

### 🔩 Peças
```
GET /api/pecas

POST /api/pecas

GET /api/pecas/{id}

PUT /api/pecas/{id}

DELETE /api/pecas/{id}
```

### 🔧 Manutenções
```
GET /api/manutencoes

POST /api/manutencoes

GET /api/manutencoes/{id}

PUT /api/manutencoes/{id}

DELETE /api/manutencoes/{id}
```

### 📄 Ordens de Serviço
```
GET /api/ordens

POST /api/ordens

GET /api/ordens/{id}

PUT /api/ordens/{id}

DELETE /api/ordens/{id}
```

## ✅ Funcionalidades Confirmadas
- 📌 Cadastro completo de entidades

- 🔗 Relacionamentos entre classes (Ex: Ordem de Serviço com Cliente, Técnico e Computador)

- ☁️ Banco de dados sincronizado com Railway

- 🔄 Atualização de dados via Swagger ou qualquer cliente HTTP

- 📑 Documentação interativa da API


## 🎯 Próximos Passos (Sugestões de Expansão)
- 📂 Implementar autenticação com JWT

- 🕓 Adicionar logs de alteração e histórico de manutenção

- 📈 Dashboard com estatísticas

- 📱 Criar versão mobile com Flutter ou React Native

- 🧾 Emissão de PDFs com detalhes da OS

## 👨‍💻 Autor
Bruno José Americano Prado de Jesus
- 🎓 Estudante de Análise e Desenvolvimento de Sistemas
- 🔧 Técnico em Manutenção e Desenvolvimento
- 💻 Apaixonado por código limpo e soluções eficientes

## 📢 Contribua!
Sinta-se à vontade para abrir issues com sugestões, relatar bugs ou enviar pull requests.
Todo feedback é bem-vindo e ajuda a melhorar o projeto! 🙌

## 💬 Frase do Projeto
“Controle não é sobre monitorar… é sobre entender, organizar e melhorar!” 💡