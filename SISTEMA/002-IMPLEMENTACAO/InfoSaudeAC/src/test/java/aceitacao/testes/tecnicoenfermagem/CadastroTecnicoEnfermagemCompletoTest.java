package aceitacao.testes.tecnicoenfermagem;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroTecnicoEnfermagemCompletoTest {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private final StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8080";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCadastroTecnicoEnfermagemCompleto() throws Exception {
        driver.get(baseUrl + "/InfoSaudeAC/tecnico-enfermagem/CadastroTecnicoEnfermagem.xhtml");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:coren")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:coren")).sendKeys("4567891");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:cpf")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:cpf")).sendKeys("712.561.841-36");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:cartaoSus")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:cartaoSus")).sendKeys("987 6543 2100");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:nome")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:nome")).sendKeys("Lucas Pato");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:dataNascimento_input")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:dataNascimento_input")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:dataNascimento_input")).sendKeys("19/01/1986");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:racaCor")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:racaCor")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:racaCor")).sendKeys("parda");
        driver.findElement(By.linkText("Contato")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:telefone1")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:telefone1")).sendKeys("(83) 9977-7799");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:telefone2")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:telefone2")).sendKeys("(83) 3355-5533");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:email")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:email")).sendKeys("lucas.pato@domain.com");
        driver.findElement(By.linkText("Endereço")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:rua")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:rua")).sendKeys("hermes sousa");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:numero")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:numero")).sendKeys("1");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:bairro")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:bairro")).sendKeys("centro");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:cep")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:cep")).sendKeys("50001000");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:cidade")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:cidade")).sendKeys("albuquerque");
        driver.findElement(By.xpath("//div[@id='formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:estado']/div[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:estado_label")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.linkText("Documentação")).click();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:rg")).clear();
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:tabDadosTecnicoEnfermagem:rg")).sendKeys("98745600-x");
        driver.findElement(By.id("formCadastroTecnicoEnfermagem:saveButton")).click();
        for (int second = 0;; second++) {
            if (second >= 60) {
                fail("timeout");
            }
            try {
                if (isElementPresent(By.cssSelector("span.ui-growl-title"))) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        try {
            assertEquals("TecnicoEnfermagem cadastrado com sucesso!", driver.findElement(By.cssSelector("span.ui-growl-title")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
