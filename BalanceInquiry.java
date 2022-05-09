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
public class BalanceInquiry extends Transaction{
    public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }
    
    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        
        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
        
        screen.displayMsgLine("\nBalance Information:");
        screen.displayMsg("- Available balance: ");
        screen.displayDollarAmount(availableBalance);
        screen.displayMsg("\n- Total balance: " );
        screen.displayDollarAmount( totalBalance );
        screen.displayMsgLine( "" );
    }
}