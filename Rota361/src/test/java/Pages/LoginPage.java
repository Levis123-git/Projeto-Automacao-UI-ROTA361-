package Pages;

import org.openqa.selenium.By;

import Drivers.DriversFactory;
import Metodos.MetodosDeTeste;

public class LoginPage extends DriversFactory {
	MetodosDeTeste metodo = new MetodosDeTeste();

	By usuario = By.xpath("//input[@type='text']");
	By senha = By.xpath("//input[@type='password']");
	By btnLogar = By.xpath("//span[text()='Acessar Sistema']");

	public void logar(String usuario, String senha) {
		
		metodo.escrever(this.usuario, usuario);
		metodo.escrever(this.senha, senha);
		metodo.clicar(btnLogar);

	}

}
