module com.game2d.javafx2dgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game2d.javafx2dgame to javafx.fxml;
    exports com.game2d.javafx2dgame;
}