import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if (studentID == 1515754){
            System.out.println("[Student ID: "+studentID+"]");
            hw2_1515754();
        }
        else if (studentID == 1612967){
            System.out.println("[Student ID: "+studentID+"]");
            hw2_1612967();
        }
        else if (studentID == 1610479){
            System.out.println("[Student ID: "+studentID+"]");
            hw2_1610479();
        }
        else {
            System.out.println("To be developed...\n");
        }
    }
    public void hw2_1515754() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Calculate min of two integer");
        System.out.println("2. Calculate max of two integer");

        System.out.print("Enter menu number: ");
        int menu = scan.nextInt();
        int a,b;
        if (menu == 1) {
            System.out.println("Enter first number");
            a = scan.nextInt();
            System.out.println("Enter second number");
            b = scan.nextInt();
            System.out.println("MIN: " +min(a,b));
        }
        else if (menu == 2) {
            System.out.println("Enter first number");
            a = scan.nextInt();
            System.out.println("Enter second number");
            b = scan.nextInt();
            System.out.println("Max: " +max(a,b));
        }
    }

    public int min(int a, int b) {
        int min;
        if (a>b) min = b;
        else min = a;
        return min;
    }
    public int max(int a, int b) {
        int max;
        if (a>b) max = a;
        else max = b;
        return max;
    }

    public void hw2_1612967() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Calculate factorial of integer x");
        System.out.println("2. Calculate absolute value of integer x");

        System.out.print("Enter menu number: ");
        int menu = scan.nextInt();
        int a;
        if (menu == 1) {
            System.out.print("Enter integer x: ");
            a = scan.nextInt();
            System.out.println( a+"! = " + factorial(a));
        }
        else if (menu == 2) {
            System.out.print("Enter integer x: ");
            a = scan.nextInt();
            System.out.println( "|"+a+"| = " + abs(a));
        }
    }

    public int factorial(int a) {
        if (a<=1){
            return a;
        }
        else{
            return factorial(a-1)*a;
        }
    }
    public int abs(int a) {
        if(a < 0){
            return -a;
        }
        else{
            return a;
        }
    }
    
    public void hw2_1610479() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Calculate max among two numbers");
        System.out.println("2. Calculate factorial of integer x");

        System.out.print("Enter menu number: ");
        int menu = scan.nextInt();
        int a,b;
        if (menu == 1) {
            System.out.println("Enter first number");
            a = scan.nextInt();
            System.out.println("Enter second number");
            b = scan.nextInt();
            System.out.println("Max number is: " +maxyeji(a,b));
        }
        else if (menu == 2) {
            System.out.println("Enter integer number");
            a = scan.nextInt();
            System.out.println("Factorial is: " +facyeji(a));
        }
    }

    public int maxyeji(int a, int b) {
        int max;
        if (a>=b) max = a;
        else max = b;
        return max;
    }
    public int facyeji(int fac) {
        int num=fac;
        if (fac==0) {
        	return 1;
        }
        while(fac!=1){
        	fac--;
        	num=num*fac;
        }
        return num;
    }
}