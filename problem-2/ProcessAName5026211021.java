import java.util.Scanner;

public class ProcessAName5026211021 {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter your name: ");
        	String fullName = sc.nextLine();
        	String processName = processName(fullName);
        	System.out.println("Your name is: " + processName);
        }

    	public static String processName(String fullName) {
        	String[] arrayName = fullName.split(" ");
        	String processName = arrayName[arrayName.length-1] + ",";
        	if (arrayName.length > 2) {
            		for (int i = 0; i < arrayName.length; i++) {
                		if (i == arrayName.length-2) {
                    			processName = processName + " " + arrayName[i].charAt(0) + ".";
                    			break;
                		} 
				processName = processName + " " + arrayName[i];
            		}
            		return processName;
        	} else {
            		return arrayName[arrayName.length-1] + ", " + arrayName[0].charAt(0) + ".";
        }
    }
}