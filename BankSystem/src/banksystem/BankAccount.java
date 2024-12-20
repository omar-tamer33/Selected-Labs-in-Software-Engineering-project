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
public class BankAccount {
    private double balance;
    private Client client;

    public BankAccount(){
        balance = 0;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BankAccount(double balance){
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Double withDraw(double amount){
        if (amount <= 0){
            System.out.println("Please enter a valid number to withdraw");
            JOptionPane.showMessageDialog(null,"Please enter a valid number to withdraw");
            return -1.0;
        }
        if (amount > balance){
            System.out.println("You don't have enough balance");
            JOptionPane.showMessageDialog(null,"You don't have enough balance");
            return -1.0;
        }
        balance -= amount;
        System.out.println("Transaction done successfully");
        JOptionPane.showMessageDialog(null,"Transaction done successfully");
        System.out.println("Your balance = " + balance);
        return balance;
    }

    public double deposit(double amount){
        if (amount <= 0){
            System.out.println("Please enter a valid number to deposit");
            JOptionPane.showMessageDialog(null,"Please enter a valid number to deposit");
            return -1;
        }
        balance += amount;
        System.out.println("Transaction done successfully");
        JOptionPane.showMessageDialog(null,"Transaction done successfully");
        System.out.println("Your balance = " + balance);
        return -1;
    }


}

