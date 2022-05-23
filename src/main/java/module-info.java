module com.brahimcah.uf5javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.brahimcah.uf5javafx to javafx.fxml;
    exports com.brahimcah.uf5javafx;
}