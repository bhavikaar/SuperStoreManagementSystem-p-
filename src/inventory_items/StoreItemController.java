package inventory_items;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import store_main.Store;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreItemController implements Initializable {

    @FXML
    private TableView category_table;
    @FXML private TableColumn name;
    @FXML private TableColumn update;
    @FXML private TableColumn delete;
    private ObservableList<Store> data= FXCollections.observableArrayList(new Store("Electronics"));


    @Override
    public void initialize(URL url, ResourceBundle rb){
        name.setCellValueFactory(new PropertyValueFactory<Store, String>("category_name"));
        update.setCellValueFactory(new PropertyValueFactory<Store, String>("update"));
        delete.setCellValueFactory(new PropertyValueFactory<Store, String>("delete"));
        category_table.setItems(data);

    }

    public void SEARCH(ActionEvent actionEvent) {

    }

    public void ADDITEM(ActionEvent actionEvent) {

    }
}
