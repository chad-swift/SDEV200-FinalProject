module org.example.sdev200finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sdev200finalproject to javafx.fxml;
    exports org.example.sdev200finalproject;
}