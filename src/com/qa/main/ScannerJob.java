package com.qa.main;


public class ScannerJob {
	
		public static void scannerjob() {
			
			Calculator cal = new Calculator();
			
			
			String result;
			double x;
			double y;
			
			System.out.println("\nType a number:");
			
			result = Runner.numb.nextLine();
			x = Double.parseDouble(result);
			
			System.out.println("\nType another number:");
			
			result = Runner.numb.nextLine();
			y = Double.parseDouble(result);
			
			System.out.println("\nChoice\r Add\r Sub\r Times\r Div\n");
			
			result = Runner.numb.nextLine();
			
			switch(result) {
				case "Add":
					System.out.println(cal.add (x, y));
					break;
				case "Sub":
					System.out.println( cal.sub (x, y));
					break;
				case "Times":
					System.out.println(cal.times (x, y));
					break;
				case "Div":
					System.out.println(cal.div (x, y));
					break;
				default:
					System.out.println("Trash try again");
					break;
			}
				
		}
			
	
}
