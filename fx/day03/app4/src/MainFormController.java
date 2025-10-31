import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Optional;

public class MainFormController {
    public TableColumn<StudentTM,String> colNic;
    public TableColumn<StudentTM,String> colName;
    public TableColumn<StudentTM,Integer> colAge;
    public TableColumn<StudentTM,Button> colOption;
    public TableView<StudentTM> tblStudent;

    public void initialize() {
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("btn"));
        loadTable();
    }
        private void loadTable () {
            ObservableList<StudentTM> studentObList = FXCollections.observableArrayList();
            for (Student st : Database.studentDb
            ) {
                Button btn = new Button("Delete");
                studentObList.add(new StudentTM(
                        st.getNic(),
                        st.getName(),
                        st.getAge(),
                        btn
                ));
                btn.setOnAction(event -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?", ButtonType.YES, ButtonType.NO);
                    Optional<ButtonType> buttonType = alert.showAndWait(); //null point exception handle in Optional
                    if (buttonType.get() == ButtonType.YES) {
                        Database.studentDb.remove(st);
                        loadTable();
                        new Alert(Alert.AlertType.INFORMATION, "Student Deleted " + st.getName()).show();
                    }
                });
            }
            tblStudent.setItems(studentObList);
        }

}
