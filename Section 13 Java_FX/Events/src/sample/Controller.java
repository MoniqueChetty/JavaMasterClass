package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckbox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(helloButton)){
            System.out.println("Hello, "+ nameField.getText());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    String s= Platform.isFxApplicationThread()? " UI Thread" : " Background Thread";
                    System.out.println("I am going to sleep" + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s= Platform.isFxApplicationThread()? "UI Thread" : "Brackground Thread";
                            System.out.println("I am updating the Label" + s);
                            ourLabel.setText("We did something!");
                        }
                    });

                }catch (InterruptedException event){
                    //we dont care about this
                }
            }
        };
        new Thread(task).start();


        if(ourCheckbox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
        //System.out.println(" The following button was pressed " + e.getSource());
    }

    @FXML
    public void handelKeyRelease(){
        String text=nameField.getText();
        boolean disabledButtons = text.isEmpty() || text.trim().isEmpty() ;
        helloButton.setDisable(disabledButtons);
        byeButton.setDisable(disabledButtons);
    }
    @FXML
    public void handelChangeCheckbox(){
        System.out.println(("The Check box is " + (ourCheckbox.isSelected()? "Checked" : "Not Checked")));

    }

}

