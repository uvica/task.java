public class questions {
    public static void main(String[] args) {

    // 1.  Write a Java program to input your full name and print a greeting message.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter your full name: ");
    // String fullName = scanner.nextLine();
    // System.out.println("Hello, " + fullName + "! Welcome to the Java programming world.");

    // 2.Take two numbers as input and print their sum, difference, product, and quotient.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter first number: ");
    // int num1 = scanner.nextInt();
        
    // System.out.print("Enter second number: ");
    // int num2 = scanner.nextInt();
    // int sum = num1 + num2;
    // int difference = num1 - num2;
    // int product = num1 * num2;
    // double quotient = (double) num1 / num2;
    // System.out.println("Sum: " + sum);
    // System.out.println("Difference: " + difference);
    // System.out.println("Product: " + product);
    // System.out.println("Quotient: " + quotient);
        
    // 3. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter your age: ");
    // int age = scanner.nextInt();
    // if (age >= 18) {
    //     System.out.println("You are eligible to vote.");
    // } else {
    //     System.out.println("You are not eligible to vote.");
    // }
    // 4. Write a program that takes a number and checks if it is divisible by both 5 and 11.


    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
        
    // int number = scanner.nextInt();
    // if (number % 5 == 0 && number % 11 == 0) {

    //     System.out.println(number + " is divisible by both 5 and 11.");
        
    // } else {
    //     System.out.println(number + " is not divisible by both 5 and 11.");
    // }

    // 5. Input three numbers and print the largest using if-else.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter first number: ");
    // int num1 = scanner.nextInt();
    // System.out.print("Enter second number: ");
    // int num2 = scanner.nextInt();
    // System.out.print("Enter third number: ");
    // int num3 = scanner.nextInt();
    // int largest;
    // if (num1 >= num2 && num1 >= num3) {
    //     largest = num1;
    // } else if (num2 >= num1 && num2 >= num3) {
    //     largest = num2;
    // } else {
    //     largest = num3;
    // }
    // System.out.println("The largest number is: " + largest);
        
    // 6. Take a number from the user and print whether it is even or odd.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
    // if (number % 2 == 0) {
    //     System.out.println(number + " is even.");
    // } else {
    //     System.out.println(number + " is odd.");
    // }
    // 7. Input the age of a person and check if they are eligible to vote (18 or older).
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter your age: ");
    // int age = scanner.nextInt();
    // if (age >= 18) {
    //     System.out.println("You are eligible to vote.");
    // } else {
    //     System.out.println("You are not eligible to vote.");
    // }
    // 8.Write a program to input a character and check if it is a vowel or a consonant using if-else.
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a character: ");
        
    // char ch = scanner.next().charAt(0);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    //     ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    //     System.out.println(ch + " is a vowel.");
    // } else {
    //     System.out.println(ch + " is a consonant.");
    // }

    // 9.Take marks of five subjects and calculate the total, percentage, and grade using if-else.
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter marks for subject 1: ");
    // int subject1 = scanner.nextInt();
    // System.out.print("Enter marks for subject 2: ");
    // int subject2 = scanner.nextInt();
    // System.out.print("Enter marks for subject 3: ");
    // int subject3 = scanner.nextInt();
    // System.out.print("Enter marks for subject 4: ");
    // int subject4 = scanner.nextInt();
    // System.out.print("Enter marks for subject 5: ");
    // int subject5 = scanner.nextInt();
    // int total = subject1 + subject2 + subject3 + subject4 + subject5;
    // double percentage = (double) total / 5;
    // String grade;
    // if (percentage >= 90) {
    //     grade = "A+";
    // } else if (percentage >= 80) {
    //     grade = "A";
    // } else if (percentage >= 70) {
    //     grade = "B+";
    // } else if (percentage >= 60) {
    //     grade = "B";
    // } else if (percentage >= 50) {
    //     grade = "C+";
    // } else if (percentage >= 40) {
    //     grade = "C";
    // } else {
    //     grade = "F";
    // }
    // System.out.println("Total marks: " + total);
    // System.out.println("Percentage: " + percentage + "%");
    // System.out.println("Grade: " + grade);
    

    // 10. Write a program to take a number from the user and print whether it is a leap year or not.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a year: ");
    // int year = scanner.nextInt();
    // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    //     System.out.println(year + " is a leap year.");
    // } else {
    //     System.out.println(year + " is not a leap year.");


        
    // 11.Input a number from the user and display whether it is a prime number using a  loop.
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
    // boolean isPrime = true;
    // for (int i = 2; i <= Math.sqrt(number); i++) {
    //     if (number % i == 0) {
    //         isPrime = false;
    //         break;
    //     }
    // }
    // if (isPrime && number > 1) {
    //     System.out.println(number + " is a prime number.");
    // } else {
    //     System.out.println(number + " is not a prime number.");
    // }
    

    // 12.Write a program to print the multiplication table of a given number using loop.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
    // System.out.println("Multiplication table of " + number + ":");
    // for (int i = 1; i <= 10; i++) {
    //     System.out.println(number + " x " + i + " = " + (number * i));

    // }
    // }


    // 13. Take a number n and print the sum of first n natural numbers using a loop.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int n = scanner.nextInt();
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    //     sum += i;
    // }

    // System.out.println("The sum of the first " + n + " natural numbers is: " + sum);


    // 14. Write a program that prints all even numbers from 1 to 100 using  loop.

    // System.out.println("Even numbers from 1 to 100:");
    // for (int i = 1; i <= 100; i++) {
    //     if (i % 2 == 0) {
    //         System.out.print(i + " ");
    //     }
    // }


    // 15.Input a number and display the factorial of that number using a  loop.


    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
        
    // int factorial = 1;
    // for (int i = 1; i <= number; i++) {
    //     factorial *= i;
    // }
    // System.out.println("The factorial of " + number + " is: " + factorial);


    // 16. Take two numbers and an operator (+, -, *, /) and perform the operation using switch.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter first number: ");
    // double num1 = scanner.nextDouble();
    // System.out.print("Enter second number: ");
    // double num2 = scanner.nextDouble();
    // System.out.print("Enter an operator (+, -, *, /): ");
    // char operator = scanner.next().charAt(0);
    // double result;

    // switch (operator) {
    //     case '+':
    //         result = num1 + num2;
    //         System.out.println("Result: " + result);
    //         break;   
    //     case '-':
    //         result = num1 - num2;

    //         System.out.println("Result: " + result);     
    //         break;   


    //     case '*':                

    //         result = num1 * num2;                    
    //         System.out.println("Result: " + result);
    //         break;
    //     case '/':
    //         if (num2 != 0) {
    //             result = num1 / num2;        
    //             System.out.println("Result: " + result);
    //         } else { 
    //             System.out.println("Error: Division by zero is not allowed.");   
    //         }    

    //         break;
    //     default:
    //         System.out.println("Error: Invalid operator.");  
    //         break;   
    // }

    // 17. Write a program to input a number from 1 to 7 and display the day of the week using switch.


    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number (1-7): ");
    // int day = scanner.nextInt();
    // String dayName;
    // switch (day) {
    //     case 1:
    //         dayName = "Monday";
    //         break;
    //     case 2:
    //         dayName = "Tuesday";
    //         break;
    //     case 3:
    //         dayName = "Wednesday";
    //         break;
    //     case 4:
    //         dayName = "Thursday";    
    //         break;
    //     case 5:  
    //         dayName = "Friday";  
    //         break;
    //     case 6:
    //         dayName = "Saturday";
    //         break;   
    //     case 7:
    //         dayName = "Sunday";
    //         break;   
    //     default:
    //         dayName = "Invalid day"; 
    //         break;
    // }    
    // System.out.println("Day " + day + " is " + dayName);
    
    
    // 18.Input a month number (1–12) and print the number of days in that month using switch.


    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a month number (1-12): ");   
    // int month = scanner.nextInt();
    // int days;
    // switch (month) {

    //     case 1: // January   
    //     case 3: // March
    //     case 5: // May
    //     case 7: // July
    //     case 8: // August
    //     case 10: // October  
    //     case 12: // December
    //         days = 31;
    //         break;
    //     case 4: // April 
    //     case 6: // June
    //     case 9: // September
    //     case 11: // November 
    //         days = 30;   
    //         break;
    //     case 2: // February
    //         days = 28; // Assuming non-leap year
    //         break;   
    //     default:
    //         days = 0; // Invalid month   
    //         break;
    // }    
        
        
    // if (days == 0) {
    //     System.out.println("Invalid month number."); 
    // } else { 
    //     System.out.println("Number of days in month " + month + ": " + days);                
    // }    


        
    // 19. Take a character input and use switch to display if it is a vowel (a, e, i, o, u).

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a character: "); 
        
    // char ch = scanner.next().charAt(0);                  
    // String result;           
        
    // switch (ch) {    
    //     case 'a':    
    //     case 'e':
    //     case 'i':    
    //     case 'o':
    //     case 'u':
    //     case 'A':
    //     case 'E':    
    //     case 'I':    
    //     case 'O':    
    //     case 'U':
    //         result = ch + " is a vowel.";
    //         break;   
    //     default:
    //         result = ch + " is a consonant.";
    //         break;   
    // }
    // }    

    // System.out.println(result);  



    // 20. Input a number and check if it is a perfect square using loop.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");    
    // int number = scanner.nextInt();  

    // boolean isPerfectSquare = false;
    // for (int i = 0; i <= number; i++) {  

    //     if (i * i == number) {
    //         isPerfectSquare = true;  
    //         break;
    //     }    
    // }
    // if (isPerfectSquare) {

    //     System.out.println(number + " is a perfect square.");    
    // } else { 
    //     System.out.println(number + " is not a perfect square.");
    // }    

    // 21. Input a number and check if it is a perfect square using loop.

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");    
    // int number = scanner.nextInt();  
    // boolean isPerfectSquare = false; 

    // for (int i = 0; i <= number; i++) {
    //     if (i * i == number) {
    //         isPerfectSquare = true;
    //         break;
    //     }
    // }
    // if (isPerfectSquare) {
    //     System.out.println(number + " is a perfect square.");
    // } else {
    //     System.out.println(number + " is not a perfect square.");
    // }


    // 22. Input a number and reverse it using loop.


    // Scanner scanner = new Scanner(System.in);    
    // System.out.print("Enter a number: ");    
    // int number = scanner.nextInt();
    // int reversedNumber = 0;
    // while (number != 0) {
    //     int digit = number % 10; 
    //     reversedNumber = reversedNumber * 10 + digit;
    //     number /= 10;
    // }    
    // System.out.println("Reversed number: " + reversedNumber);

    // 23. Take a number and check whether it is a palindrome or not using if-else and loop.

    // Scanner scanner = new Scanner(System.in);    
    // System.out.print("Enter a number: ");    
    // int number = scanner.nextInt();
    // int originalNumber = number;     
    // int reversedNumber = 0;
    // while (number != 0) {
    //     int digit = number % 10;
    //     reversedNumber = reversedNumber * 10 + digit;
    //     number /= 10;
    // }    
    // if (originalNumber == reversedNumber) {  
    //     System.out.println(originalNumber + " is a palindrome.");
    // } else { 
    //     System.out.println(originalNumber + " is not a palindrome.");
    // }                

    // 24. Input n and print the first n terms of the Fibonacci series.


    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the number of terms: ");
    // int n = scanner.nextInt();   

    // int firstTerm = 0, secondTerm = 1;   
    // System.out.println("Fibonacci Series: ");    

    // for (int i = 1; i <= n; i++) {

    //     System.out.print(firstTerm + " ");
    //     int nextTerm = firstTerm + secondTerm;
    //     firstTerm = secondTerm;

    //     secondTerm = nextTerm;
    // }                                                        
    // System.out.println();    
    // }            

    // 25. Write a program to count how many digits are in a given number using a loop.


    // Scanner scanner = new Scanner(System.in);        
    // System.out.print("Enter a number: ");    
    // int number = scanner.nextInt();  
    // int count = 0;   
    // while (number != 0) {    


    //     number /= 10;    
    //     count++;
    // }        
    // System.out.println("Number of digits: " + count);
    }
}