# agendamento-transferencia

## Descrição
Aplicação para agendamento entre contas com cálculo de taxa e opção de extrato.

## Tecnologias Utilizadas
- **Back-end**: Java 11 com Spring Boot
- **Banco de Dados**: H2 (em memória)
- **Front-end**: Angular (versão 14)
## Instruções para Execução

### Front-end
1. Navegue até a pasta do projeto Angular:
   ```bash
   cd transferencia-app

2. Instale as dependências:
   ```bash
   npm install

3. Inicie o servidor de desenvolvimento:
   ```bash
   ng serve

4. Acesse a aplicação em http://localhost:4200.

### Back-end

1. Navegue até a pasta do projeto Spring Boot.

2. Execute a aplicação Java:
   ```bash
   ./mvnw spring-boot:run

3. Acesse a API em http://localhost:8080/api/transferencias.