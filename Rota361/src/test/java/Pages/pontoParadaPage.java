package Pages;

import Drivers.DriversFactory;
import Metodos.MetodosDeTeste;
import org.openqa.selenium.By;

public class pontoParadaPage extends DriversFactory {
    MetodosDeTeste metodo = new MetodosDeTeste();

    By btnLatLong = By.xpath("//div[text()=' Latitude / Longitude ']");
    By campoNome = By.xpath("//input[contains(@class, 'q-field__native q-placeholder')][1]");
    By servico = By.xpath("//i[text()='check_box_outline_blank'][1]");
    By campoLatitude = By.xpath("/html/body/div[3]/div/div[2]/div/form/div[5]/div[1]/div/div[1]/label/div/div[1]/div/input[contains(@class,'q-field__native q-placeholder')]");
    By campoLongitude = By.xpath("/html/body/div[3]/div/div[2]/div/form/div[5]/div[1]/div/div[2]/label/div/div[1]/div/input[contains(@class,'q-field__native q-placeholder')]");
    By btnCadastrar = By.xpath("//span[text()='Cadastrar Item']");

    public void cadastrarPontoParada(String nome, String latitude, String longitude) {

        metodo.esperarElementoSerVisivel(By.xpath("//i[text()='menu']"), 2);
        metodo.clicar(By.xpath("//i[text()='menu']"));
        metodo.esperarElementoSerVisivel(By.xpath("//div[text()='Pontos de Parada']"), 2);
        metodo.clicar(By.xpath("//div[text()='Pontos de Parada']"));
        metodo.esperarElementoSerVisivel(By.xpath("//span[text()='Cadastrar']"), 2);
        metodo.clicar(By.xpath("//span[text()='Cadastrar']"));
        metodo.escrever(this.campoNome, nome);
        metodo.clicar(servico);
        metodo.clicar(btnLatLong);
        metodo.esperarElementoSerVisivel(this.campoLatitude, 1);
        metodo.escrever(this.campoLatitude, latitude);
        metodo.escrever(this.campoLongitude, longitude);
        metodo.clicar(btnCadastrar);
    }
    By consulta = By.xpath("//i[contains (@class,'q-icon text-grey-4 eva eva-eye-outline cursor-pointer')][1]");

    public void consultarPontoParada() {
        metodo.esperarElementoSerVisivel(By.xpath("//i[text()='menu']"), 2);
        metodo.clicar(By.xpath("//i[text()='menu']"));
        metodo.esperarElementoSerVisivel(By.xpath("//div[text()='Pontos de Parada']"), 2);
        metodo.clicar(By.xpath("//div[text()='Pontos de Parada']"));
        metodo.esperarElementoSerVisivel(By.xpath("//i[contains (@class,'q-icon text-grey-4 eva eva-eye-outline cursor-pointer')][1]"), 2);
        metodo.clicar(consulta);

    }
    By Deletar = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/main/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[1]/div/div[3]/i[contains(@class,'q-icon text-negative notranslate material-icons-outlined cursor-pointer')][1]");
    By confirmarDel = By.xpath("//span[text()='Confirmar']");

    public void excluirPontoParada() {
        metodo.esperarElementoSerVisivel(By.xpath("//i[text()='menu']"), 2);
        metodo.clicar(By.xpath("//i[text()='menu']"));
        metodo.esperarElementoSerVisivel(By.xpath("//div[text()='Pontos de Parada']"), 2);
        metodo.clicar(By.xpath("//div[text()='Pontos de Parada']"));
        metodo.esperarElementoSerVisivel(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/main/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[1]/div/div[3]/i[contains(@class,'q-icon text-negative notranslate material-icons-outlined cursor-pointer')][1]"),2);
        metodo.clicar(this.Deletar);
        metodo.esperarElementoSerVisivel(confirmarDel, 2);
        metodo.clicar(this.confirmarDel);

    }

    By editar = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/main/div/div[2]/div/div/div[1]/table/tbody/tr/td[1]/div/div[2]/i[contains(@class, 'q-icon text-grey-4 notranslate material-icons-outlined cursor-pointer')][1]");
    By situacao = By.xpath("//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--outline q-btn--rectangle text-positive q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn-dropdown q-btn-dropdown--simple q-mr-md full-width btn']");
    By btnPendente = By.xpath("//div[text()='Pendente']");
    By btnAtivo = By.xpath("//div[text()='Ativo']");
    By btnAtualizar = By.xpath("//span[text()='Atualizar']");

    public void editarPontoParada(String nome, String latitude, String longitude) {
        metodo.esperarElementoSerVisivel(By.xpath("//i[text()='menu']"), 2);
        metodo.clicar(By.xpath("//i[text()='menu']"));
        metodo.esperarElementoSerVisivel(By.xpath("//div[text()='Pontos de Parada']"), 2);
        metodo.clicar(By.xpath("//div[text()='Pontos de Parada']"));
        metodo.esperarElementoSerVisivel(editar, 2);
        metodo.clicar(editar);
        metodo.esperarElementoSerVisivel(this.campoNome, 2);
        //metodo.clicar(this.campoNome);
        metodo.apagarTextoJS(this.campoNome);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        metodo.apagarTextoJS(this.campoLatitude);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        metodo.apagarTextoJS(this.campoLongitude);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        metodo.escrever(this.campoNome, nome);
        metodo.escrever(this.campoLatitude, latitude);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        metodo.escrever(this.campoLongitude, longitude);
        metodo.esperarElementoSerVisivel(btnAtualizar, 1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        metodo.alterarElemento(btnAtualizar);
        metodo.esperarElementoSerVisivel(btnAtualizar, 1);
        metodo.clicar(btnAtualizar);

    }


}
