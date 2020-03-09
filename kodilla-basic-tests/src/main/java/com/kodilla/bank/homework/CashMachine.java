package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int numberOfTransaction = 0;

    public CashMachine() {
        this.transactions = new int[11];
    }

    public void addTransaction(int transaction) {
        if (numberOfTransaction < 11) {
            transactions[numberOfTransaction] = transaction;
            numberOfTransaction++;
        }
    }

    public int getSaldo() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] != 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }

    public void addDeposit(int deposit) {
        if (numberOfTransaction < 11 && deposit > 0) {
            transactions[numberOfTransaction] = deposit;
            numberOfTransaction++;
        }
    }

    public int getNumbersOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != 0) {
                transactions[i] = numberOfDeposits;
                numberOfDeposits++;
            }
        }
        return numberOfDeposits;
    }

    public void addWithdrawal(int withdrawal){
        if (numberOfTransaction < 11 && withdrawal < 0){
            transactions[numberOfTransaction] = withdrawal;
            numberOfTransaction++;
        }
    }

    public int getNumbersOfWithdrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != 0) {
                transactions[i] = numberOfWithdrawals;
                numberOfWithdrawals++;
            }
        }
        return numberOfWithdrawals;
    }

    public int getCountOfPositiveTransactions() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            int transaction = transactions[i];
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfNegativeTransactions() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            int transaction = transactions[i];
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }
}