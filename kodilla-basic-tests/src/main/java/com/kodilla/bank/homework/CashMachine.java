package com.kodilla.bank.homework;

public class CashMachine {
    int[] transactions = new int[10];

    private int saldo;
    private int countTransactions;

    public int getSaldo() {
        return saldo;
    }

    public int getCountTransactions() {
        return countTransactions;
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

/*    public double getAverageOfNegativeTransactions(){
        int numberOfNegativeTransaction = 0;
        double valueOfNegativeTransactions = 0.0;
        for (int i = 0; i < ; i++) {

        }
    } */

}
