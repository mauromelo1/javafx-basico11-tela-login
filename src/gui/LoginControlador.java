package gui;


import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginControlador {

	@FXML
	private TextField campoEmail;

	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("147258");

		if (emailValido && senhaValida) {
			Alerts.showAlert("Aviso", "", "Login realizado com Sucesso!", AlertType.INFORMATION);
		} else {
			Alerts.showAlert("Aviso", "", "Usuário e Senha inválidos!", AlertType.ERROR);
		}
	}

}
