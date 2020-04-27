package Lesson1;

import Lesson1.Model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller
{
    @FXML
    public Button btnCreate;
    @FXML
    TextField txtName;
    @FXML
    TextField txtAge;
    @FXML
    TextField txtPhone;
    @FXML
    Label lblPersonInfo;

    public void React(ActionEvent actionEvent)
    {
        // txtOutput.setText(String.format("%5.0f", value));
    }

    public void btnCreatePersonClick(ActionEvent actionEvent)
    {
        String name = txtName.getText();
        int age = 0;
        String phone = txtPhone.getText();
        Person person = null;
        try
        {
            age = Integer.parseInt(txtAge.getText());
            person = new Person(name,age,phone);
            lblPersonInfo.setText(person.toString());
        }
        catch (Exception ex)
        {
            lblPersonInfo.setText("Error while data conversion: " + ex.getLocalizedMessage());
        }
    }
}
