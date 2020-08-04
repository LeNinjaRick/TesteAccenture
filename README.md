# TesteAccenture
Automação utilizando Selenium WebDriver, JUnit e Cucumber.

Para executar o projeto:

- É possivel executar a partir do "seguroVeiculo.feature" pelo cucumber, entretanto é necessario o plugin do cucumber no ECLIPSE;
- É possivel executar pela classe RunnerTest.java, que executa com JUnit 5;
- Tambem é possivel executar por linha de comando usando recursos do Maven, estando no diretorio do projeto, digite no terminal: "mvn test", ou "mvn clean test";

-------Todos os relatorios gerados estão na pasta "target" do projeto--------
--Abra o relatorio ".html" com o seu navegador de preferencia--


Este projeto conta com uma pasta de drivers de navegadores Chrome e Firefox.

O Geckodriver é compativel com a Versão 79.0 (64-bit) do Firefox;

O ChromeDriver é compativel com a Versão 84.0.4147.105 do Google Chrome. 

Se quiser trocar modo de execução utilizado, entre no arquivo "br.ce.rjdomingues.steps/SeguroVeiculoSteps.java", vá até a linha 22 e troque o campo "Firefox" para "Chrome", ou vice versa.


-- Versões de todos os recursos utilizados:

- JRE 1.8.0_261
- maven 3.6.3
- cucumber 6.4.0
- cucumber-junit 6.4.0
- JUnit 5.6
- selenium 3.141.59