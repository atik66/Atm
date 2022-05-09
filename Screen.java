/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachin;

/**
 *
 * @author HP
 */
public class Screen {
     public void displayMsg(String message) {
        System.out.println(message);
    }
    
    public void displayMsgLine(String message) {
        System.out.println(message);
    }
    
    public void displayDollarAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }
}
