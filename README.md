# Sistema de Tarefas

## Descrição
Esse repositório tem como objetivo armazenar um projeto JSF (JakartaServer Faces) que modela um sistema gerenciador de Tarefas, com um CRUD para tal. O projeto não está finalizado.

## O que foi feito
O projeto tinha alguns pontos considerados importantes por mim. Os que foram resolvidos estão marcados.
- [ ] Desenvolver telas XHTML para os formulários.
- [x] Implementar interface Repository usando JPA.
- [x] Criação de uma entidade Tarefa.
- [ ] Desenvolver testes unitários usando JUnit.
- [x] Configurar banco de dados PostgreSQL e conexão.
- [ ] Implementar tratamento de exceções robusto.
- [ ] Publicar o projeto no Heroku ou GCP.

A parte "backend" do projeto, que é a criação do modelo, repositório e conexão com o banco foi feita. A parte das páginas XHTML não pôde ser concluída.

## Como executar
Para executar esse código no seu computador, valem os seguintes passos:
1. Dar um ```git clone``` desse repositório.
2. Instalar uma [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) ou [JRE](https://www.oracle.com/br/java/technologies/javase-jre8-downloads.html) (1.8 ou posterior).
2. Abrir o projeto usando o Eclipse ou Intellij IDEA (recomendado).
3. Baixar e configurar um servidor [Tomcat](https://tomcat.apache.org/) versão 9.0.0 ou posterior.
4. Utilizar um ```maven install``` para que as dependências sejam baixadas. 
5. Configurar a porta do projeto, caso a porta 8080 já esteja sendo utilizada.
6. Executar o projeto e checar o andamento no navegador.

## Erros
O principal erro que impede o desenvolvimento do projeto é um erro 404 no navegador. 
Depois do servidor ser iniciado (Tomcat), quando é acessado o endereço no ```localhost:8080```, as páginas .XHTML não são encontradadas pelo projeto.
O que foi tentado para solucionar o erro:
- Checar a configuração do ```web.xml``` para o Faces Servlet e o ```<servlet-mapping>``` usando o ```<url-pattern>``` como sendo ```*.xhtml```. 
- Checar as versões dos arquivos de configuração, pois no JSF 2.2 alguns endereços de namespaces mudaram.
- Todos os arquivos ```.xhtml``` estão na pasta webapp, acessível ao projeto.
- Adicionar novas bibliotecas ao ```pom.xml``` relacionadas com o JSF.
- Criar uma pasta ```lib``` e adicionar arquivos ```.jar``` nela.

E alguns outros pontos. Devido a esse erro de mapeamento, não pude concluir as outras telas do projeto.

## A fazer
Futuramente, planejo sentar com mais calma nesse projeto. Buscar orientação de programadores mais experientes que provavelmente já passaram pelos mesmos problemas e tentar resolve-los para entender e aplicar melhor os conceitos do JSF.
