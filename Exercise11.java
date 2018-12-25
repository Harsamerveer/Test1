
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise11 extends Application {

    RadioButton red = new RadioButton("Red");
    RadioButton blue = new RadioButton("Blue");
    RadioButton green = new RadioButton("Green");
    CheckBox bold = new CheckBox("Bold");
    CheckBox italic = new CheckBox("Italic");
    CheckBox underline = new CheckBox("Underline");
    RadioButton f1 = new RadioButton("10pt");
    RadioButton f2 = new RadioButton("12pt");
    RadioButton f3 = new RadioButton("14pt");
    RadioButton f4 = new RadioButton("18pt");
    RadioButton f5 = new RadioButton("24pt");

    @Override
    public void start(Stage primaryStage) {

        Label top = new Label("Top");
        Label bottom = new Label("Bottom");
        Label right = new Label("Right");
        Label left = new Label("Left");

        BorderPane root = new BorderPane();
        StackPane sp = new StackPane();
        FlowPane fp = new FlowPane();
        GridPane gp = new GridPane();

        //Center   
        Label center = new Label("Hello");
        sp.setStyle("-fx-border-color: black");
        root.setCenter(sp);
        sp.getChildren().add(center);

        //Right  
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setVgap(20);
        gp.add(red, 0, 0);
        gp.add(blue, 0, 1);
        gp.add(green, 0, 2);
        red.setStyle("-fx-text-fill:red");
        blue.setStyle("-fx-text-fill:blue");
        green.setStyle("-fx-text-fill:green");
        root.setRight(gp);

        //Top
        fp = new FlowPane();
        fp.setPadding(new Insets(10, 10, 10, 10));
        fp.setHgap(20);
        Label lText = new Label("Enter a new Text");
        TextField tText = new TextField();
        fp.getChildren().addAll(lText,tText);
        root.setTop(fp);
        fp.setAlignment(Pos.CENTER);

        //Left
        gp = new GridPane();
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setVgap(20);

        gp.add(bold, 0, 0);
        gp.add(italic, 0, 1);
        gp.add(underline, 0, 2);
        bold.setStyle("-fx-font-weight: bold;");
        italic.setStyle("-fx-font-style: italic;");
        underline.setStyle("-fx-underline: true;");
        root.setLeft(gp);

        //Bottom
        gp = new GridPane();
        gp.setPadding(new Insets(20, 10, 20, 80));
        gp.setHgap(50);
        gp.add(f1, 0, 0);
        gp.add(f2, 1, 0);
        gp.add(f3, 2, 0);
        gp.add(f4, 3, 0);
        gp.add(f5, 4, 0);
        root.setBottom(gp);

        //Display Window
        Scene scene = new Scene(root, 600, 250);
        primaryStage.setTitle("Exercise11");
        primaryStage.setScene(scene);
        primaryStage.show();

        ToggleGroup colours = new ToggleGroup();
        red.setToggleGroup(colours);
        green.setToggleGroup(colours);
        blue.setToggleGroup(colours);

        ToggleGroup size = new ToggleGroup();
        f1.setToggleGroup(size);
        f2.setToggleGroup(size);
        f3.setToggleGroup(size);
        f4.setToggleGroup(size);
        f5.setToggleGroup(size);

        f3.setSelected(true);

        tText.setOnAction(e -> {
                String text = tText.getText();
                center.setText(text);
            });
    
        red.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        blue.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        green.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        f1.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        f2.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        f3.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        f4.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        f5.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        bold.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        underline.setOnAction(e -> {
            center.setStyle(checkStyles());
        });
        italic.setOnAction(e -> {
            center.setStyle(checkStyles());
        });

    }

    public String checkStyles() {
        String styles = "";

        if (red.isSelected()) {
            styles += "-fx-text-fill:red;";
        }
        if (green.isSelected()) {
            styles += "-fx-text-fill:green;";
        }
        if (blue.isSelected()) {
            styles += "-fx-text-fill:blue;";
        }
        if (f1.isSelected()) {
            styles += "-fx-font-size:10pt;";
        }
        if (f2.isSelected()) {
            styles += "-fx-font-size:12pt;";
        }
        if (f3.isSelected()) {
            styles += "-fx-font-size:14pt;";
        }
        if (f4.isSelected()) {
            styles += "-fx-font-size:18pt;";
        }
        if (f5.isSelected()) {
            styles += "-fx-font-size:24pt;";
        }
        if (italic.isSelected()) {
            styles += "-fx-font-Style:italic;";
        }

        if (bold.isSelected()) {
            styles += "-fx-font-weight:bold;";
        }
        if (underline.isSelected()) {
            styles += "-fx-underline: true;";
        }
        return styles;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
