package aceitacao.testes.odontologo;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroOdontologoCompletoTest {

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
    public void testCadastroOdontologoCompleto() throws Exception {
        driver.get(baseUrl + "/InfoSaudeAC/medico/CadastroOdontologo.xhtml");
        driver.findElement(By.id("formCadastroOdontologo:cro")).clear();
        driver.findElement(By.id("formCadastroOdontologo:cro")).sendKeys("4567891");
        driver.findElement(By.id("formCadastroOdontologo:cpf")).clear();
        driver.findElement(By.id("formCadastroOdontologo:cpf")).sendKeys("712.561.841-36");
        driver.findElement(By.id("formCadastroOdontologo:cartaoSus")).clear();
        driver.findElement(By.id("formCadastroOdontologo:cartaoSus")).sendKeys("987 6543 2100");
        driver.findElement(By.id("formCadastroOdontologo:nome")).clear();
        driver.findElement(By.id("formCadastroOdontologo:nome")).sendKeys("Lucas Pato");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:dataNascimento_input")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:dataNascimento_input")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:dataNascimento_input")).sendKeys("19/01/1986");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:racaCor")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:racaCor")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:racaCor")).sendKeys("parda");
        driver.findElement(By.linkText("Contato")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:telefone1")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:telefone1")).sendKeys("(83) 9977-7799");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:telefone2")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:telefone2")).sendKeys("(83) 3355-5533");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:email")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:email")).sendKeys("lucas.pato@domain.com");
        driver.findElement(By.linkText("Endereço")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:rua")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:rua")).sendKeys("hermes sousa");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:numero")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:numero")).sendKeys("1");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:bairro")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:bairro")).sendKeys("centro");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:cep")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:cep")).sendKeys("50001000");
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:cidade")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:cidade")).sendKeys("albuquerque");
        driver.findElement(By.xpath("//div[@id='formCadastroOdontologo:tabDadosOdontologo:estado']/div[3]/span")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroOdontologo:tabDadosOdontologo:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:estado_label")).click();
        driver.findElement(By.xpath("//div[@id='formCadastroOdontologo:tabDadosOdontologo:estado_panel']/div/ul/li[16]")).click();
        driver.findElement(By.linkText("Documentação")).click();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:rg")).clear();
        driver.findElement(By.id("formCadastroOdontologo:tabDadosOdontologo:rg")).sendKeys("98745600-x");
        driver.findElement(By.id("formCadastroOdontologo:saveButton")).click();
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
            assertEquals("Médico cadastrado com sucesso!", driver.findElement(By.cssSelector("span.ui-growl-title")).getText());
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
