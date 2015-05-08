package aceitacao.testes.enfermeiro;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroEnfermeiroCompletoTest {

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
    public void testCadastroEnfermeiroCompleto() throws Exception {
        driver.get(baseUrl + "/InfoSaudeAC/enfermeiro/CadastroEnfermeiro.xhtml");
        driver.findElement(By.id("formCadastroEnfermeiro:coren")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:coren")).sendKeys("4567891");
        driver.findElement(By.id("formCadastroEnfermeiro:cpf")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:cpf")).sendKeys("712.561.841-36");
        driver.findElement(By.id("formCadastroEnfermeiro:cartaoSus")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:cartaoSus")).sendKeys("987 6543 2100");
        driver.findElement(By.id("formCadastroEnfermeiro:nome")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:nome")).sendKeys("Lucas Pato");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:dataNascimento_input")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:dataNascimento_input")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:dataNascimento_input")).sendKeys("19/01/1986");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:racaCor")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:racaCor")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:racaCor")).sendKeys("parda");
        driver.findElement(By.linkText("Contato")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:telefone1")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:telefone1")).sendKeys("(83) 9977-7799");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:telefone2")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:telefone2")).sendKeys("(83) 3355-5533");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:email")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:email")).sendKeys("lucas.pato@domain.com");
        driver.findElement(By.linkText("Endereço")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:rua")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:rua")).sendKeys("hermes sousa");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:numero")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:numero")).sendKeys("1");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:bairro")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:bairro")).sendKeys("centro");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:cep")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:cep")).sendKeys("50001000");
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:cidade")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:cidade")).sendKeys("albuquerque");
        driver.findElement(By.xpath("//div[@id='formCadastroEnfermeiro:tabDadosEnfermeiro:estado']/div[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroEnfermeiro:tabDadosEnfermeiro:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:estado_label")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroEnfermeiro:tabDadosEnfermeiro:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.linkText("Documentação")).click();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:rg")).clear();
        driver.findElement(By.id("formCadastroEnfermeiro:tabDadosEnfermeiro:rg")).sendKeys("98745600-x");
        driver.findElement(By.id("formCadastroEnfermeiro:saveButton")).click();
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
            assertEquals("Enfermeiro cadastrado com sucesso!", driver.findElement(By.cssSelector("span.ui-growl-title")).getText());
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
