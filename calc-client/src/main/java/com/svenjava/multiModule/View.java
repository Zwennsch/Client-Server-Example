package com.svenjava.multiModule;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class View extends VBox {

    public View(){
        var field1 = new TextField();
        var field2 = new TextField();

        var output = new Text();

        var btnAdd = new Button("ADD");
        var btnSub = new Button("SUB");

        setPadding(new Insets(15));
        setSpacing(15);

        getChildren().addAll(field1, field2, output, btnAdd,btnSub);
    }
}
