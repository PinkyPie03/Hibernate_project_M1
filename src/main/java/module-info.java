module com.example.affectations {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires jakarta.persistence;
    requires java.sql;


    opens com.example.affectations to javafx.fxml;
    exports com.example.affectations;

    opens com.example.affectations.models to org.hibernate.orm.core;
    opens com.example.affectations.controllers to javafx.fxml;

}