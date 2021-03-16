// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 5

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class FXMLDocumentController implements Initializable
{
    
    @FXML
    private TextField empidTextField;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField monthTextField;
    @FXML
    private TextField dayTextField;
    @FXML
    private TextField yearTextField;
    @FXML
    private Button addempButton;
    @FXML
    private TableView<Employee> empTable;
    @FXML
    private TableColumn<Employee, String> idTableColumn;
    @FXML
    private TableColumn<Employee, String> firstnameTableColumn;
    @FXML
    private TableColumn<Employee, String> lastnameTableColumn;
    @FXML
    private TableColumn<Employee, String> dohTableColumn;
    @FXML
    private Label statusupdateLabel;
    
    static int count = 0;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        
        Employee[] array = new Employee [100];
        String f = firstnameTextField.getText();
        String l = lastnameTextField.getText();
        int id = Integer.valueOf(empidTextField.getText());
        int y = Integer.valueOf(yearTextField.getText());
        int m = Integer.valueOf(monthTextField.getText());
        int d = Integer.valueOf(dayTextField.getText());
        Employee temp = new Employee( f , l , id , y , m , d );
        array[count].equals(temp);
        count++;
        idTableColumn.setCellValueFactory(new PropertyValueFactory <> ("ID"));
        firstnameTableColumn.setCellValueFactory(new PropertyValueFactory <> ("firstName"));
        lastnameTableColumn.setCellValueFactory(new PropertyValueFactory <> ("lastName"));
        dohTableColumn.setCellValueFactory(new PropertyValueFactory <> ("hireDate"));
        empTable.setItems(getEmployeeList(array));
        statusupdateLabel.setText("New Record Added.");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public ObservableList<Employee> getEmployeeList(Employee[] other)
    {
        ObservableList<Employee> empList = FXCollections.observableArrayList();
        for (int i = 0; i < count - 1; i++)
        {
            empList.add(new Employee(other[i].getFirstName(),
                                 other[i].getLastName(),
                                 other[i].getID(),
                                 other[i].getHireDate().getYear(),
                                 other[i].getHireDate().getMonth(),
                                 other[i].getHireDate().getDay()));
        }
        
        return empList;
    }
    
}
