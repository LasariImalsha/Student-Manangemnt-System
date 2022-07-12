package controller;

import javafx.event.ActionEvent;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import java.sql.SQLException;
import util.CrudUtil;
import java.sql.*;

public class SearchStudentFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtEmail;
    public TextField txtNic;

    public void txtSearchOnAction(ActionEvent actionEvent) {
        try {
            search();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchOnAction(ActionEvent actionEvent) {
        try {
            search();
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        }
    }

    private void search() throws ClassNotFoundException, SQLException {
        ResultSet result = CrudUtil.execute("SELECT * FROM Student WHERE id=?",txtId.getText());
        if (result.next()) {
            txtName.setText(result.getString(2));
            txtAddress.setText(result.getString(3));
            txtContact.setText(result.getString(4));
            txtEmail.setText(result.getString(5));
            txtNic.setText(result.getString(6));
        } else {
            new Alert(Alert.AlertType.WARNING, "Empty Result").show();
        }
    }

}
