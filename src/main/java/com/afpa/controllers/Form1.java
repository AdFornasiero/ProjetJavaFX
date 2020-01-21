package com.afpa.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Form1 {
    public Button btn;
    public Label lbl;
    public TextField tf;

    public void initialize(URL url, ResourceBundle rb){

    }

    public void btn_click(ActionEvent actionEvent) {
        lbl.setText(tf.getText());
    }
}
