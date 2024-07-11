public class    AtualizacaoEmail {
}

package Paginas;

import Base.Site;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class AtualizacaoSenha extends Site {

    @Test
    public void testAtualizacaoSenha() {

        driver.findElement(By.id("id_do_link_ou_botao_para_alterar_senha")).click();

        driver.findElement(By.id("id_do_campo_senha_atual")).sendKeys("senhaatual");
        driver.findElement(By.id("id_do_campo_nova_senha")).sendKeys("novasenha");
        driver.findElement(By.id("id_do_campo_confirmar_senha")).sendKeys("novasenha");


        driver.findElement(By.id("id_do_botao_confirmar_alteracao")).click();

        assertTrue(driver.getCurrentUrl().contains("pagina_de_sucesso"), "Senha não foi alterada corretamente.");
    }
}

