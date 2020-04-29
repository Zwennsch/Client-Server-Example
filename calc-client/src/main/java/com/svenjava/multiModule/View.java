package com.svenjava.multiModule;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class View extends VBox {
    private Controller controller;

    public View(LocalController controller){
        this.controller = controller;
        var field1 = new TextField();
        var field2 = new TextField();

        var output = new Text();

        var btnAdd = new Button("ADD");
        btnAdd.setOnAction(e -> {
            var num1 = Integer.parseInt(field1.getText());
            var num2 = Integer.parseInt(field2.getText());
            var future = controller.onAdd(num1, num2);
            future.thenAccept(result -> output.setText(String.valueOf(result)));
        });

        var btnSub = new Button("SUB");
        btnSub.setOnAction(e -> {
            var num1 = Integer.parseInt(field1.getText());
            var num2 = Integer.parseInt(field2.getText());
            var future = controller.onSub(num1, num2);
            future.thenAccept(result -> output.setText(String.valueOf(result)));
        });

        setPadding(new Insets(15));
        setSpacing(15);

        getChildren().addAll(field1, field2, output, btnAdd,btnSub);
    }
}
