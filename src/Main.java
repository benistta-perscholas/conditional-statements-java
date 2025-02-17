import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1. Write a program that declares 1 integer variable x, and then
    //assigns 7 to it. Write an if statement to print out “Less than 10” if x is
    //less than 10. Change x to equal 15, and notice the result (console
    //should not display anything).
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }

    //2. Write a program that declares 1 integer variable x, and then
    //assigns 7 to it. Write an if-else statement that prints out “Less than 10”
    //if x is less than 10, and “Greater than 10” if x is greater than 10.
    //Change x to 15 and notice the result.
        x = 15;
        if (x < 10){
            System.out.println("Less than 10");
        }
        if (x > 10) {
            System.out.println("Greater than 10");
        }

    //3. Write a program that declares 1 integer variable x, and then
    // assigns 15 to it. Write an if-else-if statement that prints out “Less than
    //10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but
    //less than 20, and “Greater than or equal to 20” if x is greater than or
    //equal to 20. Change x to 50 and notice the result.
        x = 50;
        if (x < 10){
            System.out.println("Less than 10");
        }
        else if (x >= 10 && x < 20){
            System.out.println("Between 10 and 20");
        }else{
            System.out.println("Greater than or equal to 20");
        }

    //4.Write a program that declares 1 integer variable x, and then
    //assigns 15 to it. Write an if-else statement that prints “Out of range” if
    //the number is less than 10 or greater than 20 and prints “In range” if
    //the number is between 10 and 20 (including equal to 10 or 20).
    //Change x to 5 and notice the result.
        x = 5;
        if (x < 10 || x > 20){
            System.out.println("Out of range");
        }else {
//        if (x >= 10 && x <= 20){
            System.out.println("In range");
        }
    //5. Write a program that uses if-else-if statements to print out grades
    //A, B, C, D, F, according to the following criteria:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: <60
    //Use the Scanner class to accept a number score from the user to
    //determine the letter grade. Print out “Score out of range” if the score
    //is less than 0 or greater than 100.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Grade: ");
         int grade = scanner.nextInt();
//         int grade = 101;
         if (grade <= 100 && grade >= 90) {
            System.out.println("A");
         }else if (grade < 90 && grade >= 80){
            System.out.println("B");
         }else if (grade < 80 && grade >= 70){
            System.out.println("C");
         }else if (grade < 70 && grade >= 60){
            System.out.println("D");
         }else if (grade < 0 || grade > 100) {
             System.out.println("Score out of range");
         }else{
             System.out.println("F");
         }
        scanner.close();

    //6.Write a program that accepts an integer between 1 and 7 from
    //the user. Use a switch statement to print out the corresponding
    //weekday. Print “Out of range” if the number is less than 1 or greater
    //than 7. Do not forget to include “break” statements in each of your
    //cases.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int integer = scanner.nextInt();

        switch(integer) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    //8.Create a program that lets the users input their filing status and
    //income. Display how much tax the user would have to pay
    //according to status and income.
    //The U.S. federal personal income tax is calculated based
    //on the filing status and taxable income.
    //There are four filing statuses: Single, Married Filing Jointly,
    // Married Filing Separately, and Head of Household.
    //The tax rates for 2009 are shown below.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your filing status(single, married filing jointly, married filing separately, and head of household): ");
        String status = scanner.nextLine();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;

             if ("single".equals(status)) {
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 82250) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 171550) tax = 16750 + (income - 182250) * 0.28;
                else if (income <= 372950) tax = 41754 + (income - 171550) * 0.33;
                else tax = 108216 + (income - 372950) * 0.35;
        }
            if ("married filing jointly".equals(status)) {
                if (income <= 16700) tax = income * 0.10;
                else if (income <= 67900) tax = 1670 + (income - 816700) * 0.15;
                else if (income <= 137050) tax = 9350 + (income - 67900) * 0.25;
                else if (income <= 208850) tax = 26637.50 + (income - 137050) * 0.28;
                else if (income <= 372950) tax = 46754 + (income - 208850) * 0.33;
                else tax = 88306 + (income - 372950) * 0.35;
            }
            if ("married filing separately".equals(status)) {
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 68525) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 104425) tax = 13318.75 + (income - 68525) * 0.28;
                else if (income <= 186475) tax = 23377 + (income - 104425) * 0.33;
                else tax = 44153 + (income - 186475) * 0.35;
        }
            if ("head of household".equals(status)) {
                if (income <= 11950) tax = income * 0.10;
                else if (income <= 45500) tax = 1195 + (income - 11950) * 0.15;
                else if (income <= 117450) tax = 6220 + (income - 45500) * 0.25;
                else if (income <= 190200) tax = 24222.50 + (income - 117450) * 0.28;
                else if (income <= 372950) tax = 44512.50 + (income - 190200) * 0.33;
                else tax = 106160.50 + (income - 372950) * 0.35;
        }
            System.out.println("You need to pay: " + tax);
            scanner.close();

    }
}