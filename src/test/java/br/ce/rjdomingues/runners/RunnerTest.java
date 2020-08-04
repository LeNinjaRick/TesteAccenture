package br.ce.rjdomingues.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"br.ce.rjdomingues.steps"},
		tags = "@pedidoSeguro",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = false,
		dryRun = false
		)
public class RunnerTest {

}
