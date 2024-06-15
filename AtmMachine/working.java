//working.java

package AtmMachine;


import java.util.Scanner;

public class working {
    int balance = 9000;
    int pin = 3210;
    String name;
    int age;

    int chosenOption;
    public void showOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("choose options: \n1. check Information \n2. check balance \n3. deposit money \n4. withdraw amount \n");
        this.chosenOption = scanner.nextInt();
    }

    public int inputPin() {
        System.out.println("enter pin: ");
        Scanner scanner = new Scanner(System.in);
        int pinEntered = scanner.nextInt();
        return pinEntered;
    }

    public void depositMoney() {
        System.out.println("deposit money");
        System.out.println("enter amount");
        Scanner scanner = new Scanner(System.in);
        int depAmount = scanner.nextInt();
        balance = balance + depAmount;
        System.out.println("Amount deposited successfully!\n your balance: " + checkBalance());
    }

    public int checkBalance() {
        System.out.println("check balance");
        return this.balance;
    }

    public void withDrawMoney() {
        if (balance > 500) {
            System.out.println("withdraw amount");
            System.out.println("enter amount");
            Scanner scanner = new Scanner(System.in);
            int withDrawAmount = scanner.nextInt();
            balance = balance - withDrawAmount;
            System.out.println("Amount withdrawn successfully!\n your balance: " + checkBalance());
        } else {
            System.out.println("your balance is less than 500 you can't with draw");
        }
    }

    public void displayInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("pin: " + this.pin);
    }

    public working(int pin, int balance, String name, int age) {
        this.pin = pin;
        this.balance = balance;
        this.name = name;
        this.age = age;

        int input_pin = inputPin();

        if (input_pin == this.pin) {
            showOption();
            if (chosenOption == 1) {
                displayInfo();
            } else if (chosenOption == 2) {
                System.out.println("your balance : " + checkBalance());
            } else if (chosenOption == 3) {
                depositMoney();
            } else if (chosenOption == 4) {
                withDrawMoney();
            }
        } else {
            System.out.println("wrong pin sorry try again!");
        }
    }
}
