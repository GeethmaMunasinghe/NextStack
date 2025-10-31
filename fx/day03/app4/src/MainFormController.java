import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainFormController {
    public TableColumn<StudentTM,String> colNic;
    public TableColumn<StudentTM,String> colName;
    public TableColumn<StudentTM,Integer> colAge;
    public TableColumn<StudentTM,Button> colOption;
    public TableView<StudentTM> tblStudent;

    public void initialize(){
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("btn"));
        ObservableList<StudentTM> studentObList= FXCollections.observableArrayList();
        for (Student st:Database.studentDb
             ) {
            Button btn=new Button("Delete");
            studentObList.add(new StudentTM(
                    st.getNic(),
                    st.getName(),
                    st.getAge(),
                    btn
            ));

        }
        tblStudent.setItems(studentObList);
    }
}
