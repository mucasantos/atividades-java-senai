package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Cliente;

public class ViewController implements Initializable {

	@FXML
	private Button apagarBtn;

	@FXML
	private Text valorDoNome;

	@FXML
	private TextField nome;

	@FXML
	private TextField email;

	@FXML
	private TextField telefone;

	@FXML
	private Text valorDoEmail;

	@FXML
	private Text valorDoTelefone;

	@FXML
	private TableView<Cliente> TabelaClientes;

	@FXML
	private TableColumn<Cliente, String> TabelaNome;

	@FXML
	private TableColumn<Cliente, String> TabelaEmail;

	@FXML
	private TableColumn<Cliente, String> TabelaTelefone;

	private ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TabelaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		TabelaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		TabelaTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

		TabelaClientes.setOnMousePressed((EventHandler<? super MouseEvent>) new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
					Node node = ((Node) event.getTarget()).getParent();
					TableRow row;
					if (node instanceof TableRow) {
						row = (TableRow) node;
					} else {
						// clicking on text part
						row = (TableRow) node.getParent();
					}
					System.out.println(row.getItem());
				}
			}
		});
	}

	@FXML
	public void onBtnClick() {
		System.out.println("Cliquei no botao");
	}

	@FXML
	public void onBtnSalvar() {
		System.out.println("O nome digitado foi: " + nome.getText());

		valorDoNome.setText(nome.getText());
		valorDoEmail.setText(email.getText());
		valorDoTelefone.setText(telefone.getText());

		Cliente c = new Cliente();
		c.setNome(nome.getText());
		c.setEmail(email.getText());
		c.setTelefone(telefone.getText());

		listaClientes.add(c);

		TabelaClientes.setItems(listaClientes);
		TabelaClientes.refresh();

		nome.setText("");
		email.setText("");
		telefone.setText("");

	}

	@FXML
	public void onBtnApagar() {

		try {
			Cliente selectedCliente = TabelaClientes.getSelectionModel().getSelectedItem();

			listaClientes.remove(selectedCliente);

			TabelaClientes.setItems(listaClientes);
			TabelaClientes.refresh();

		} catch (Exception e) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro!");
			alert.setContentText("Acredito que não tenha dados na tabela...");
			alert.show();
		}

	}

}
