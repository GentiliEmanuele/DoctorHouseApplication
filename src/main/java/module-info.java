module com.example.doctorhouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.doctorhouse to javafx.fxml;
    exports com.example.doctorhouse;
}