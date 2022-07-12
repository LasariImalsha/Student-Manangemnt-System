package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import model.Student;
import util.CrudUtil;
import java.sql.*;

public class UpdateStudentFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtEmail;
    public TextField txtNic;

    public void txtSearchOnAction(ActionEvent actionEvent) {
        try {
            ResultSet result =  CrudUtil.execute("SELECT * FROM Student WHERE id=?",txtId.getText());
            if (result.next()) {
                txtName.setText(result.getString(2));
                txtAddress.setText(result.getString(3));
                txtContact.setText(result.getString(4));
                txtEmail.setText(result.getString(5));
                txtNic.setText(result.getString(6));
            } else {
                new Alert(Alert.AlertType.WARNING, "Empty Result").show();
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void updateOnAction(ActionEvent actionEvent) {
        Student s = new Student(
                txtId.getText(),txtName.getText(), txtAddress.getText(),txtContact.getText(),txtEmail.getText(),txtNic.getText());

        try{
            boolean isUpdated = CrudUtil.execute("UPDATE Student SET name=? , address=? , contact=? , email=?  WHERE id=?",s.getName(),s.getAddress(),s.getContact(),s.getEmail(),s.getId());
            if (isUpdated){
                new Alert(Alert.AlertType.CONFIRMATION, "Updated!").show();
            }else{
                new Alert(Alert.AlertType.WARNING, "Try Again!").show();
            }


        }catch (SQLException | ClassNotFoundException e){

        }
    }
}



