package project4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OhmsLaw extends Application {
	
    //start method is main entry point for application. 
    //Stage is top-level container.
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Example 1");

        //GridPane for flexible layout of controls in rows and columns
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //Horizontal space between columns
        grid.setVgap(10); //Vertical space between rows
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Text control for instructions
        Text instrText = new Text("Give the values for V,R and I");
        instrText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        // In column 0, row 0, column span 2 and row span 1
        grid.add(instrText, 0, 0, 2, 1);

        // Label in column 0, row 1
        Label label1 = new Label("V:");
        grid.add(label1, 0, 1);

        // TextField in column 1, row 1
        TextField textField1 = new TextField();
        grid.add(textField1, 1, 1);

        Label label2 = new Label("R:");
        grid.add(label2, 0, 2);

        TextField textField2 = new TextField();
        grid.add(textField2, 1, 2);
        
        Label label3 = new Label("I:");
        grid.add(label2, 0, 2);

        TextField textField3 = new TextField();
        grid.add(textField3, 1, 2);

        Button btn = new Button("Calculate");
        grid.add(btn, 1, 4);

        Text resultText = new Text();
        grid.add(resultText, 0, 6, 2, 1);
        resultText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));

        // Event handling for button
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	if (textField3.getText().equals("")){
                double V = Double.parseDouble(textField1.getText());
                double R = Double.parseDouble(textField2.getText());
                double res2 = V/R;
                resultText.setText(val1 + " + " + val2 + " = " + res2);
            	}else if (textField1.getText().equals("")){
                double I = Double.parseDouble(textField3.getText());
            	double R = Double.parseDouble(textField2.getText());
                double res3 = RI;
                resultText.setText(val1 + " + " + val2 + " = " + res3);
            	}else if (textField2.getText().equals("")){
            	double I = Double.parseDouble(textField3.getText());
                double V = Double.parseDouble(textField1.getText());
                resultText.setText(val1 + " + " + val2 + " = " + res1);
                
                double res1 = V/I;
            	}
            }
        });

        //Scene is container for all content 
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}