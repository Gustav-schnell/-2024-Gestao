import Base.Site;
import Paginas.SiteCadastro;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cadastramento extends Site
{
    // Cenário 1 - Caso 5
    @Test
    public void NomeCompletocomCemLetras()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoNomeCompleto("Wilhelm Friedrich Ferdinand Maximilian Heinrich Joseph Maria von Hohenzollern-Sigmaringen-Wittelsbach")
                .CampoSenha("123456")
                .CampoEmail("wilhelm@gmail.com")
                .CampoEndereco("Rua das Flores, 1234, Bairro dos Açorianos")
                .CampoEstado("RS")
                .CampoMunicipio("Porto Alegre")
                .CampoPerfil1().CampoPerfil3();

        String Resultado = access.BuscarResultado();
    }

    // Cenário 1 - Caso 11
    @Test
    public void MunicipioAntesdeEstado()
    {

    }

}

import Base.Site;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AtualizacaoEmail extends Site {

    @Test
    public void testAtualizacaoEmail() {

        driver.findElement(By.id("id_do_campo_para_email")).clear();
        driver.findElement(By.id("id_do_campo_para_email")).sendKeys("novoemail@example.com");

        driver.findElement(By.id("id_do_botao_de_confirmacao")).click();

        String emailAtualizado = driver.findElement(By.id("id_do_elemento_que_mostra_email_atualizado")).getText();
        assertEquals(emailAtualizado, "novoemail@example.com", "Email não foi atualizado corretamente.");
    }
}

