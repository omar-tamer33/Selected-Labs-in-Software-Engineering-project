/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

import javax.swing.JOptionPane;

/**
 *
 * @author OMAR
 */
public class SavingsBankAccount extends BankAccount{
    private static int minBalance;

    public SavingsBankAccount(){
        super(1000);
        minBalance = 1000;
    }

    public SavingsBankAccount(double balance){
        super(balance);
        minBalance = 1000;
        if (balance >= minBalance){
            setBalance(balance);
        }else {
            System.out.println("Saving bank account need minimum balance of 1000 EGP");
                        JOptionPane.showMessageDialog(null,"Saving bank account need minimum balance of 1000 EGP");

        }
    }

    public static int getMinBalance() {
        return minBalance;
    }

    @Override
    public Double withDraw(double amount){
        if (super.getBalance() - amount < minBalance){
            System.out.println("You can't withdraw : Saving bank account need minimum balance of 1000 EGP");
            JOptionPane.showMessageDialog(null,"You can't withdraw : Saving bank account need minimum balance of 1000 EGP");
            return -1.0;
        }
       return super.withDraw(amount);
    }

    @Override
    public double deposit(double amount){
        if (amount < 100){
            System.out.println("You can't deposit less than 100 EGP in saving accounts");
            JOptionPane.showMessageDialog(null,"You can't deposit less than 100 EGP in saving accounts");
            return -1;
        }
       return super.deposit(amount);
    }
}
