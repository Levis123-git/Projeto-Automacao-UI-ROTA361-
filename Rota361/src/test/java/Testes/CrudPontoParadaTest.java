package Testes;

import Metodos.MetodosDeTeste;
import Pages.LoginPage;
import Pages.pontoParadaPage;
import Runner.Executa;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;




    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class CrudPontoParadaTest {

        LoginPage login = new LoginPage();
        pontoParadaPage pp = new pontoParadaPage();
        MetodosDeTeste metodo = new MetodosDeTeste();

        @Test
        @Order(1)
        public void cadastroPPSucesso() {
            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.cadastrarPontoParada("PP teste", "-23.499146444551368", "-46.845637285819656");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.pegarTextoNaClass(By.xpath("//div[@class='q-notification__message col']"), "Item cadastrado");
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();

        }

        @Test
        @Order(5)
        public void cadastroPontoParadaInválido() {
            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.cadastrarPontoParada("PP teste", "000", "");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.pegarTextoNaClass(By.xpath("//div[@class='q-notification__message col']"), "Endereço Invalido");
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();

        }

        @Test
        @Order(6)
        public void cadastroPontoParadaBranco() {
            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.cadastrarPontoParada("", "", "");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.pegarTextoNoElemento(By.xpath("//div[@role='alert']"), "campo obrigatório");
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();

        }

        @Test
        @Order(3)
        public void consultarPontoParada() {
            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.consultarPontoParada();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.esperarElementoSerVisivel(By.xpath("//div[@class='card'][1]"), 2);
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();

        }
        @Test
        @Order(2)
        public void editarPontoParada() {

            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.editarPontoParada("PP Atualizada", "-23.499146444551368", "-46.845637285819656");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.pegarTextoNaClass(By.xpath("//div[@class='q-notification__message col']"), "Item atualizado");
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();
        }

        @Test
        @Order(4)
        public void excluirPontoParada() {
            Executa.antesDosTestes();
            login.logar("teste@tra.com", "Rota@2025");
            pp.excluirPontoParada();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            metodo.pegarTextoNaClass(By.xpath("//div[@class='q-notification__message col']"), "Item removido");
            //metodo.capturarScreenshot();
            Executa.depoisDosTestes();
        }

    }





