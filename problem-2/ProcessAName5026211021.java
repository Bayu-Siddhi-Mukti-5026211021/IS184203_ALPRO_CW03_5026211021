import java.util.Scanner;

public class ProcessAName5026211021 {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Type your name: ");
        	String fullName = sc.nextLine();
        	String processName = processName(fullName);
       		System.out.println("Your name is: " + processName);
	}

    	public static String processName(String fullName) {
 		String[] arrayName = fullName.split(" ");
        	String processName = arrayName[arrayName.length - 1] + ",";
        	for (int i = 0; i < arrayName.length - 1; i++) {
           		processName = processName + " " + arrayName[i].charAt(0) + ".";
        	}
        	return processName;
   	}
}
