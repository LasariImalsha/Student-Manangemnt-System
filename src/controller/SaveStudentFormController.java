package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Student;
import util.CrudUtil;

import java.sql.SQLException;

public class SaveStudentFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtEmail;
    public TextField txtNic;

    public void saveOnAction(ActionEvent actionEvent) {
        Student s = new Student(
                txtId.getText(),txtName.getText(), txtAddress.getText(),txtContact.getText(),txtEmail.getText(),txtNic.getText());

        try {
            if (CrudUtil.execute("INSERT INTO Student VALUES (?,?,?,?,?,?)",s.getId(),s.getName(),s.getAddress(),s.getContact(),s.getEmail(),s.getNic())){
                new Alert(Alert.AlertType.CONFIRMATION, "Saved!..").show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }



    }
}
