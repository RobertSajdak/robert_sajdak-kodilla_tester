package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] cashMaschines;
    int indexOfCashMachine = 0;

    public Bank() {
        this.cashMaschines = new CashMachine[5];
    }

    public void addCashMachine(CashMachine numberOfCashMachine) {
        if (indexOfCashMachine < 5) {
            cashMaschines[indexOfCashMachine] = numberOfCashMachine;
            indexOfCashMachine++;
        }
    }

    public int getSaldoOfAllCashMaschines() {
        int result = 0;
        for (int i = 0; i < cashMaschines.length; i++) {
            CashMachine machine = cashMaschines[i];
            if (machine != null) {
                result += machine.getSaldo();
            }
        }
        return result;
    }

    public int getNumberOfDepositsFromAllCashMachines() {
        int numberOfDepositsFromAllCashMachines = 0;
        for (int i = 0; i < cashMaschines.length; i++) {
            if (this.cashMaschines[i] != null) {
                numberOfDepositsFromAllCashMachines += this.cashMaschines[i].getCountOfPositiveTransactions();
            }
        }
        return numberOfDepositsFromAllCashMachines;
    }

    public int getNumberOfWithdrawalsFromAllCashMachines() {
        int numberOfWithdrawalsFromAllCashMachines = 0;
        for (int i = 0; i < cashMaschines.length; i++) {
            if (this.cashMaschines[i] != null) {
                numberOfWithdrawalsFromAllCashMachines += this.cashMaschines[i].getCountOfNegativeTransactions();
            }
        }
        return numberOfWithdrawalsFromAllCashMachines;
    }

    public int getAverageOfDepositsFromAllCashMachines() {
        int sum = 0;
        int averageOfDepositsFromAllCashMachines;
        for (int i = 0; i < cashMaschines.length; i++) {
            if (this.cashMaschines[i] != null) {
                sum += this.cashMaschines[i].getCountOfPositiveTransactions();
            }
        }
        averageOfDepositsFromAllCashMachines = sum / getNumberOfDepositsFromAllCashMachines();

        return averageOfDepositsFromAllCashMachines;
    }

    public int getAverageOfWithdrawalsFromAllCashMachines() {
        int sum =0;
        int averageOfWithdrawalsFromAllCashMachines;
        for (int i = 0; i < cashMaschines.length; i++) {
            if (this.cashMaschines[i] != null) {
                sum+= this.cashMaschines[i].getCountOfNegativeTransactions();
            }
        }
        averageOfWithdrawalsFromAllCashMachines = sum / getNumberOfWithdrawalsFromAllCashMachines();

        return averageOfWithdrawalsFromAllCashMachines;
    }
}