import Base.Site;
import Paginas.SiteCadastro;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cadastramento extends Site
{
    // Cenário 2 - Caso 1
    @Test
    public void login_e_senha_valida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("valido")
                .CampoSenha("valido");


        String Resultado = access.BuscarResultado();
    }

    // Cenário 2 - Caso 2
    @Test
    public void login_valido_e_senha_invalida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());
        access.CampoLogin("valido")
                .CampoSenha("invalido");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 3
    @Test
    public void login_valido_e_senha_sem_informar()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("valido")
                .CampoSenha("");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 4
    @Test
    public void login_invalido_e_senha_valida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("invalido")
                .CampoSenha("valido");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 5
    @Test
    public void login_e_senha_invalida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("invalido")
                .CampoSenha("invalido");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 6
    @Test
    public void login_invalido_e_senha_sem_informar()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("invalido")
                .CampoSenha("");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 7
    @Test
    public void login_sem_informar_e_senha_valida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("")
                .CampoSenha("valido");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 8
    @Test
    public void login_sem_informar_e_senha_invalida()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("")
                .CampoSenha("invalido");


        String Resultado = access.BuscarResultado();
    }
    // Cenário 2 - Caso 9
    @Test
    public void login_e_senha_sem_informar()
    {
        SiteCadastro access = new SiteCadastro(GetDriver());

        access.CampoLogin("")
                .CampoSenha("");


        String Resultado = access.BuscarResultado();
    }

}
