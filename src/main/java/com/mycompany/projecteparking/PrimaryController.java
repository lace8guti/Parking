package com.mycompany.projecteparking;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    /*
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    */
    @FXML
    ListView listView;
    
    @FXML
    Label labelEntraMat;
    
    @FXML
    Label labelPlaces;
    
    @FXML
    Label labelEstat;
    
    @FXML
    Label labelEstat2;
    
    @FXML
    TextField textfieldMatricula;
    
    @FXML
    TextArea textareaTicket;
    
    @FXML
    Button buttonAparcar;
    
    @FXML
    Button buttonDesaparcar;
    
    @FXML
    RadioButton radiobuttonCotxe;
    
    @FXML
    RadioButton radiobuttonMotocicleta;
    
    @FXML
    RadioButton radiobuttonFurgoneta;
    
    
    
    
    private Parking parking = new Parking(10);
    
    @FXML
    public void initialize(){
        //TODO
        listView.getItems().setAll(parking.getPlaces());
    }
    
    @FXML
    public void aparcar(){
        if(! textfieldMatricula.getText().equals("")){
            Vehicle vehicle;
            if(radiobuttonCotxe.isSelected()){
                vehicle = new Cotxe(0.1);
            }
            else if(radiobuttonMotocicleta.isSelected()){
                vehicle = new Motocicleta();
            }else{
                vehicle = new Furgoneta();
            }
            
            vehicle = new Furgoneta();
            
            vehicle.setMatricula(textfieldMatricula.getText());
            parking.aparcar(vehicle);
            
            //importante
            listView.refresh();
        }
        
        
        
    }
    
    @FXML
    public void desaparcar(){
        //esto contiene el elemento que tengo guardado un un listView
        int index = listView.getSelectionModel().getSelectedIndex();
        
        if(index != -1){
            textareaTicket.setText(listView.toString());
            
            
            
            
        }
        
        
        
    }
    
    
    
    
}
