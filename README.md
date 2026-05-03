# Login System
Sistema de autenticação desenvolvido em Java com Spring Boot.
## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.2.0
- Spring Security
- Spring Data JPA
- H2 Database
- Maven
## Funcionalidades
- Registro de usuários
- Autenticação de usuários
- Criptografia de senhas com BCrypt
- Banco de dados em memória H2
## Endpoints da API
### Registrar Usuário
POST /api/auth/register
Content-Type: application/json
{
  "username": "seu_usuario",
  "password": "sua_senha"
}
### Login
POST /api/auth/login
Content-Type: application/json
{
  "username": "seu_usuario",
  "password": "sua_senha"
}
## Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/Flaviodev1206/login-system.git
2. Entre no diretório:
cd login-system
3. Execute com Maven:
./mvnw spring-boot:run
4. A aplicação estará disponível em http://localhost:8080
Configurações
- Porta: 8080
- Banco de dados: H2 em memória
- Console H2: http://localhost:8080/h2-console
  - JDBC URL: jdbc:h2:mem:logindb
  - Usuário: sa
  - Senha: (em branco)
Estrutura do Projeto
src/main/java/com/example/login/
├── controller/
│   └── AuthController.java
├── model/
│   └── User.java
├── repository/
│   └── UserRepository.java
├── security/
│   └── SecurityConfig.java
├── service/
│   └── UserService.java
└── LoginSystemApplication.java 
