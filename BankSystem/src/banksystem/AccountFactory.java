/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

/**
 *
 * @author OMAR
 */
public class AccountFactory {

    public static BankAccount createAccount(String accountType, double initialBalance) {
        if (accountType.equalsIgnoreCase("savings")) {
            return new SavingsBankAccount();
        } else if (accountType.equalsIgnoreCase("Bank")) {
            return new BankAccount(initialBalance); 
        }
        return null;
    }
}
