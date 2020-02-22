package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] caschMaschines = new CashMachine[5];

    public int SaldoOfAllcaschMaschines() {
        int result = 0;
        for (int i = 0; i < caschMaschines.length; i++) {
            CashMachine machine = caschMaschines[i];
            if (machine != null) {
                result += machine.getSaldo();
            }
        }
        return result;
    }

    public int getCountOfPositiveTransactions() {
        int result = 0;
        for (int i = 0; i < caschMaschines.length; i++) {
            CashMachine machine = caschMaschines[i];
            if (machine != null) {
                result += machine.getCountOfPositiveTransactions();
            }
        }
        return result;
    }

    public int getCountOfNegativeTransactions() {
        int result = 0;
        for (int i = 0; i < caschMaschines.length; i++) {
            CashMachine machine = caschMaschines[i];
            if (machine != null) {
                result += machine.getCountOfNegativeTransactions();
            }
        }
        return result;
    }





}
