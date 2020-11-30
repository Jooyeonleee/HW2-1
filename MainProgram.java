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
}
