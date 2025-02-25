package com.example.affectations.controllers;

import com.example.affectations.models.Employe;
import com.example.affectations.utils.HibernateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.w3c.dom.Text;

public class EmployeController {
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtPrenom;
    @FXML
    private TextField txtCodeemp;
    @FXML
    private TextField txtPoste;
    public void ajouterEmploye() {
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String codeemp = txtCodeemp.getText();
        String poste = txtPoste.getText();

        Session session;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Employe e = new Employe();
        e.setCodeEmp(codeemp);
        e.setNom(nom);
        e.setPrenom(prenom);
        e.setPoste(poste);

        session.save(e);
        session.getTransaction().commit();
        session.close();
    }
}
