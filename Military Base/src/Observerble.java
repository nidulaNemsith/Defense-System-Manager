
import java.awt.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nemsi
 */

interface Observerble {

    public void addObserver(Observer observer);
    
    public void removeObserver(Observer observer);
    
    public void getMessage(String message,String name);
   
    public void notifyObservers();
    
    public void sendMessage(int num);
     
    public void isAreaClear(boolean b);
    
    public void notifyArea();
    
    public void getPosition(int num);
    
    public void powerNotify();
    
 
}
