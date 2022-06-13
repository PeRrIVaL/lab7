module pl.lublin.wsei.java.cwiczenia.lab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.test.lab7 to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.test.lab7;
}