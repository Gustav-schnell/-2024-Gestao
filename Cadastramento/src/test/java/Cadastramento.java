import Base.Site;
import Paginas.SiteCadastro;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cadastramento extends Site
{
    SiteCadastro access = new SiteCadastro(GetDriver());
    // Cenário 1 - Caso 5
    @Test
    public void NomeCompletocomCemLetras()
    {
        access.CampoNomeCompleto("Wilhelm Friedrich Ferdinand Maximilian Heinrich Joseph Maria von Hohenzollern-Sigmaringen-Wittelsbach")
                .CampoSenha("123456")
                .CampoEmail("wilhelm@gmail.com")
                .CampoEndereco("Rua das Flores, 1234, Bairro dos Açorianos")
                .CampoEstado("Rio Grande do Sul")
                .CampoMunicipio("Porto Alegre")
                .CampoPerfil1().CampoPerfil3();

        String Resultado = access.BuscarResultado();
    }

    // Cenário 1 - Caso 11
    @Test
    public void MunicipioAntesdeEstado()
    {
        access.CampoNomeCompleto("Whilhelm Heinrich")
                .CampoSenha("123456")
                .CampoEmail("wilhelm@gmail.com")
                .CampoEndereco("Rua das Flores, 1234, Bairo dos Açorianos")
                .CampoPerfil1().CampoPerfil2()
                .CampoMunicipio("Porto Alegre");

        String Resultado = access.BuscarResultado();

        /*
        Assert.assertTrue(Resultado.contains("Wilhelm Heinrich"));
        Assert.assertTrue(Resultado.contains("1234"));


         */

    }

}
