package aceitacao.testes.odontologo;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaOdontologoExclusaoTest {

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
    public void testPesquisaOdontologoExclusao() throws Exception {
        driver.get(baseUrl + "/InfoSaudeAC/odontologo/CadastroOdontologo.xhtml");
        driver.findElement(By.id("formCadastroOdontologo:coren")).clear();
        driver.findElement(By.id("formCadastroOdontologo:coren")).sendKeys("78451");
        driver.findElement(By.id("formCadastroOdontologo:cpf")).clear();
        driver.findElement(By.id("formCadastroOdontologo:cpf")).sendKeys("515.124.304-71");
        driver.findElement(By.id("formCadastroOdontologo:cartaoSus")).clear();
        driver.findElement(By.id("formCadastroOdontologo:cartaoSus")).sendKeys("788 4551 2200");
        driver.findElement(By.id("formCadastroOdontologo:nome")).clear();
        driver.findElement(By.id("formCadastroOdontologo:nome")).sendKeys("Lucas Pato");
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
            assertEquals("Odontólogo cadastrado com sucesso!", driver.findElement(By.cssSelector("span.ui-growl-title")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Pesquisa de odontólogo")).click();
        try {
            assertEquals("Lucas Pato", driver.findElement(By.xpath("//tbody[@id='formPesquisaOdontologo:datatablePesquisaOdontologo_data']/tr/td[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("formPesquisaOdontologo:datatablePesquisaOdontologo:0:deleteButton")).click();
        // Warning: verifyTextNotPresent may require manual changes
        try {
            assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*//tbody\\[@id='formPesquisaOdontologo:datatablePesquisaOdontologo_data'\\]/tr/td\\[2\\][\\s\\S]*$"));
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
