package project5;


import javafx.application.Application;
import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Loan_Calculation extends Application {
	
   

    final TextField textField1 = new TextField();
    final TextField textField2 = new TextField();
    final TextField textField3 = new TextField();
    final TextArea textArea = new TextArea();
	
    final Label lebel1 = new Label("Loan amount");
    final Label lebel2 = new Label("Interest rate");
    final Label lebel3 = new Label("Period (years)");


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        FlowPane topbar = new FlowPane();
        topbar.setAlignment(Pos.CENTER);
        topbar.setPadding(new Insets(5, 5, 5, 5));
        topbar.setHgap(10);
		
        Button calcButton = new Button("Calculate");
		
        textArea.setFont(Font.font("Courier New", FontWeight.NORMAL, 12));
        
       
        
        topbar.getChildren().add(lebel1);
        topbar.getChildren().add(textField1);
       
     
        topbar.getChildren().add(lebel2);
        topbar.getChildren().add(textField2);
        topbar.getChildren().add(lebel3);
        topbar.getChildren().add(textField3);
        topbar.getChildren().add(calcButton);
      
		
        root.setTop(topbar);
				
        textArea.setEditable(false);
        root.setCenter(textArea);
		
        Scene scene = new Scene(root, 900, 400);
        primaryStage.setTitle("Calculator");
		
        primaryStage.setScene(scene);
        primaryStage.show();
		
        calcButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	double loan_amount = Double.parseDouble(textField1.getText());
                double interest_rate = Double.parseDouble(textField2.getText());
                int period = Integer.parseInt(textField3.getText());
                int year = 0, i;
                double repayment = 0, interest = 0, installment = 0, remaining = 0 ;
                
                		
                DecimalFormat twoDigits = new DecimalFormat(".00");//format for the decimal       
                
                textArea.appendText("Year\t\tRepayment\tInterest\tInstallment\tRemaining\n"); //Output of table listing line 1

         
                for (i = 1; i <= period; i++){//loop for monthly calculation
         
                   year++;
                   
                   repayment = loan_amount / period;
                   
                   interest = (remaining*interest_rate/100);
                   
                   installment = (repayment + interest);
                   
                   remaining = (remaining - repayment);
            
        
          
                  
          
                   
                   textArea.appendText("" + year + "\t\t" + twoDigits.format(repayment) + "\t\t"
                	        
                      + twoDigits.format(interest)+ "\t\t" + twoDigits.format(installment)+ "\t\t"
         
                      + twoDigits.format(remaining) + "\n");
          
                   
                } 
                
             }
          
          });

      }


    public static void main(String[] args) {
        launch(args);
    }
}
