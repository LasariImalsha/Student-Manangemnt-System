package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class DashBoardFormController {
    public void saveOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SaveStudentForm");
    }

    public void searchOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SearchStudentForm");
    }

    public void updateOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UpdateStudentForm");
    }

    public void loadOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoadAllStudentsForm");
    }

    public void deleteOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DeleteStudentForm");
    }

    private void setUi(String URI) throws IOException {
        Parent parent  =FXMLLoader.load(getClass().getResource("../views/"+URI+".fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle(URI);
        stage.show();
    }

}
