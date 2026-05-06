module org.example.sdev200finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.sdev200finalproject to javafx.fxml;
    exports org.example.sdev200finalproject;
}