package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SiteCadastro extends BasePage
{
    public String nome = "dsaf";

    @FindBy(name = "")
        private WebElement txtnomeS;
    @FindBy(name = "")
        private WebElement txtlogin;
    @FindBy(name = "")
        private WebElement txtsenha;
    @FindBy(name = "")
        private WebElement txtemail;
    @FindBy(name = "")
        private WebElement txtendereco;
    @FindBy(name = "")
        private WebElement selestado;
    @FindBy(name = "")
        private WebElement selmunicipio;
    @FindBy(name = "")
        private WebElement marperfil1;
    @FindBy(name = "")
        private WebElement marperfil2;
    @FindBy(name = "")
        private WebElement marperfil3;

    ////
    public SiteCadastro CampoNomeCompleto(String nome)
    {txtnomeS.sendKeys(nome); return this;}

    public SiteCadastro CampoLogin(String login)
    {txtlogin.sendKeys(login); return this;}

    public SiteCadastro CampoSenha(String senha)
    {txtsenha.sendKeys(senha); return this;}

    public SiteCadastro CampoEmail(String email)
    {txtemail.sendKeys(email); return this;}

    public SiteCadastro CampoEndereco(String endereco)
    {txtendereco.sendKeys(endereco); return this;}

    public SiteCadastro CampoEstado(String estado)
    {
        Select select = new Select(selestado);
        select.selectByVisibleText(estado);
        return this;
    }

    public SiteCadastro CampoMunicipio(String municipio)
    {
        Select select = new Select(selmunicipio);
        select.selectByVisibleText(municipio);
        return this;
    }

    public SiteCadastro CampoPerfil1()
    {marperfil1.click(); return this;}

    public SiteCadastro CampoPerfil2()
    {marperfil2.click(); return this;}

    public SiteCadastro CampoPerfil3()
    {marperfil3.click(); return this;}

    public String BuscarResultado() {return driver.getPageSource();}

    public SiteCadastro(WebDriver driver) {super(driver);}
}
