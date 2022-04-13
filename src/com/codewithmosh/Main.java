package com.codewithmosh;

import com.codewithmosh.memento.Editor;

public class Main {

    public static void main(String[] args) {
        // basic scaffolding
        User user = new User("Mosh");
        user.sayHello();

        /**
         * Interfaces : contract that specifies the capabilities
         * that a class should provide
         */
        System.out.println("--- Interfaces ---");
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        /**
         * Encapsulation : bundling the data and methods
         * that operate on the data within one unit (Class)
         * and hiding the values (state of an object) inside
         * the class
         */
        System.out.println("--- Encapsulation ---");
        var account = new Account();
        account.deposit(10);
        System.out.println(account.getBalance());

        account.withdraw(5);
        System.out.println(account.getBalance());

        /**
         * Abstraction : change the implementation details without
         * affecting others classes in the application
         */
        System.out.println("--- Abstraction ---");
        MailService mailService = new MailService();
        mailService.sendEmail();

        /**
         * Inheritance : mechanism to reduce code across our classes
         * allows the DRY principle (Don't Repeat Yourself)
         */
        System.out.println("--- Inheritance ---");
        var textBox = new TextBox();
        textBox.enable();

        /**
         * Polymorphism : ability of an object to take on many forms
         * in this case UIControl takes TextBox and CheckBox forms
         */
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2021();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
