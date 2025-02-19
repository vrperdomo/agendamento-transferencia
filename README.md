# agendamento-transferencia

## Descri��o
Aplica��o para agendamento entre contas com c�lculo de taxa e op��o de extrato.

## Tecnologias Utilizadas
- **Back-end**: Java 11 com Spring Boot
- **Banco de Dados**: H2 (em mem�ria)
- **Front-end**: Angular (vers�o 14)
## Instru��es para Execu��o

### Front-end
1. Navegue at� a pasta do projeto Angular:
   ```bash
   cd transferencia-app

2. Instale as depend�ncias:
   ```bash
   npm install

3. Inicie o servidor de desenvolvimento:
   ```bash
   ng serve

4. Acesse a aplica��o em http://localhost:4200.

### Back-end

1. Navegue at� a pasta do projeto Spring Boot.

2. Execute a aplica��o Java:
   ```bash
   ./mvnw spring-boot:run

3. Acesse a API em http://localhost:8080/api/transferencias.