/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nemsi
 */
public interface Observer {
    
    void setMessage(String message);
    boolean isPositioned();
    void update(String message,String name); 
    void setPosition(int value);
    void sendResourceInfo();
    void checkSoliderCount(int soliderCount);
    void setAllDisabled();

    
}
