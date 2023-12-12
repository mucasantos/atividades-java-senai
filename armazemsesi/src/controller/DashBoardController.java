package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Produto;

public class DashBoardController {

	@FXML
	private TextField ModificarNome;
	
	@FXML 
	private TextField ModificarValor;

	@FXML
	private TextField ModificarQtd;
	
	@FXML
	private Button BotaoModificar;
	
	@FXML
	private Button BotaoLimpar;
	
	@FXML
	private TableView<Produto> TabelaProdutos;
	
	@FXML
	private TableColumn<Produto, Integer> TabelaProdutoId;
	
	@FXML
	private TableColumn<Produto, String> TabelaProdutoNome;
	
	@FXML
	private TableColumn<Produto, Integer> TabelaProdutoValor;

	@FXML
	private TableColumn<Produto, Integer> TabelaProdutoQtd;
	
	// ObservableList de Produtos = FXCollections para instanciar na coleção
	private ObservableList<Produto> listaProdutos = FXCollections.observableArrayList();
	
	@FXML
	void adicionarProduto() {
		Produto produto = new Produto();
		produto.setNome(ModificarNome.getText());
		produto.setQuantidade(Integer.parseInt(ModificarQtd.getText()));
		produto.setValor(Double.parseDouble(ModificarValor.getText()));
	
		listaProdutos.add(produto);
		
		TabelaProdutos.setItems(FXCollections.observableList(listaProdutos));
		TabelaProdutos.refresh();
	}
	
	
}
