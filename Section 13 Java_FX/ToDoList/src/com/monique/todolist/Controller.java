package com.monique.todolist;

import com.monique.todolist.datamodel.TodoData;
import com.monique.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;
    @FXML
    private BorderPane mainBorderPain;

    public void initialize(){
//        Code used to Initialize txt file
//        TodoItem item1 = new TodoItem(" Mail Birthday card", " Buy a 30th Birthday card for Maison",
//                LocalDate.of(2020, Month.DECEMBER, 25));
//        TodoItem item2 = new TodoItem(" Dr Reddy", " Heart appointment John",
//                LocalDate.of(2020, Month.SEPTEMBER, 10));
//        TodoItem item3 = new TodoItem(" Design #1 ", " Complete layer 1",
//                LocalDate.of(2020, Month.APRIL, 05));
//        TodoItem item = new TodoItem(" Collect Report", " Collect Report for Jesse",
//                LocalDate.of(2020, Month.JULY, 12));
//        TodoItem item4 = new TodoItem(" Meet Terry ", "Meet Terry for Lunch at Gold reef ",
//                LocalDate.of(2020, Month.AUGUST, 21));
//        TodoItem item5 = new TodoItem(" Keeno Birthday", " Buy a 21st Birthday Cake",
//                LocalDate.of(2020, Month.DECEMBER, 14));
//
//        todoItems = new ArrayList<TodoItem>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if(newValue!=null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy"); //"dd MMMM yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
        //handleClickListView();
    }

    @FXML
    public void showNewItemDialog(){
        Dialog<ButtonType> dialog= new Dialog<>();
        dialog.initOwner((mainBorderPain.getScene().getWindow()));
        try{
            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
            dialog.getDialogPane().setContent(root);
        }catch (IOException e){
            System.out.println("Could not load dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result=dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            System.out.println("OK Pressed");
        }else{
            System.out.println("Cancel Pressed");
        }
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
//        //System.out.println("The selected items "+ item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append(("\n\n\n\n"));
//        sb.append(("Due: "));
//        sb.append((item.getDeadline().toString()));
//        itemDetailsTextArea.setText((sb.toString()));

   }

}
