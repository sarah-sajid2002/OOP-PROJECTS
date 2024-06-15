package emailApp;

import java.util.Scanner;

class email {
    private String firstName;
    private String lastName;
    private String Email;
    private String department;
    private int defaultPassLength = 10;
    private String company = "ehee";
    private String password;
    private int mailBoxCapacity = 1000;
    private String alternativeEmail;

    email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        //        department choices
        this.department = setDepartmentChoice();
        //        generate password
        this.password = randomPass(defaultPassLength);
        //        generate Email
        this.Email = generateEmail();
//        setAlternateEmail
        this.alternativeEmail = setAlternateEmail("myalternativeemail.com");

    }

    public String setDepartmentChoice() {
        System.out.println("choose department\n1: sales\n2: development\n3: marketing\nenter department: ");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "marketing";
        } else {
            return "";
        }
    }

    public String randomPass(int length) {
        String selectPass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(){}[]";
        char[] newPass = new char[length];

        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random() * selectPass.length());
            newPass[i] = selectPass.charAt(randomNumber);
        }
        return new String(newPass);
    }

    public String setPassword(String pass) {
        this.password = pass;
        return password;
    }

    public String setAlternateEmail(String ema) {
        String newEmail = ema;
        return "alternative email: " + newEmail;
    }

    public int setMailBoxCapacity(int capacity) {
        int newCapacity = capacity;
        return newCapacity;
    }

    public String generateEmail() {
        String email = firstName + "." + lastName + "@" + department + "." + company + ".com";
        return email;
    }

    public void displayInfo() {
        System.out.println("INFORMATION'S:");
        System.out.println("name: " + this.firstName + " " + this.lastName);
        System.out.println("email: " + this.Email);
        System.out.println("alternative email: " + this.alternativeEmail);
        System.out.println("password: " + this.password);
        System.out.println("department: " + this.department);
    }
}
