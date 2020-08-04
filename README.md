# TesteAccenture
Automação utilizando Selenium WebDriver, JUnit e Cucumber.

Para executar o projeto:

- É possivel executar a partir do "seguroVeiculo.feature", é necessario o plugin do cucumber no ECLIPSE;
- É possivel executar pela classe RunnerTest.java, que executa com JUnit 5;
- Tambem é possivel executar por linha de comando usando recursos do Maven, estando no diretorio do projeto, digite no terminal: "mvn test", ou "mvn clean test";

-------todos os relatorios gerados estão na pasta "target"--------


Este projeto conta com uma pasta de drivers de navegadores Chrome e Firefox.

O Geckodriver é compativel com a Versão 79.0 (64-bit) do Firefox;

O ChromeDriver é compativel com a Versão 84.0.4147.105 do Google Chrome. 

Se quiser trocar modo de execução utilizado, entre no arquivo "br.ce.rjdomingues.steps/SeguroVeiculoSteps.java", vá até a linha 21 e troque o campo "Firefox" para "Chrome", ou vice versa.
