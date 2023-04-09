module simonstentoft_alla2297.mandatorysql_imdb_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens simonstentoft_alla2297.mandatorysql_imdb_system to javafx.fxml;
    exports simonstentoft_alla2297.mandatorysql_imdb_system;
    exports simonstentoft_alla2297.mandatorysql_imdb_system.Object;
    opens simonstentoft_alla2297.mandatorysql_imdb_system.Object to javafx.fxml;
}