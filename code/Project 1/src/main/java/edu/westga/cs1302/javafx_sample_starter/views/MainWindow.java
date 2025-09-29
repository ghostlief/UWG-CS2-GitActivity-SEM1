package edu.westga.cs1302.javafx_sample_starter.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {
    
	@FXML
    private TextArea taskDescription;

    @FXML
    private Button addTaskButton;

    @FXML
    private ComboBox<?> listView;

    @FXML
    private TextField taskName;

    @FXML
    private ComboBox<?> taskPriority;

    @FXML
    private Button viewTaskButton;
	
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	
    }

    @FXML
    void addTask(ActionEvent event) {

    }

    @FXML
    void listTasks(ActionEvent event) {

    }

    @FXML
    void viewTask(ActionEvent event) {

    }
}
