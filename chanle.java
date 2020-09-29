package lecaovan;
import java.util.Scanner;
 	
public class chanle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println(">> Kiểm tra số chẳn lẽ <<");
		 System.out.print("Nhập số cần kiểm tra: ");
		 int so = scanner.nextInt();
		 
		 if (so % 2 == 1) {System.out.println("Số " + so + " là số lẽ.");
		 } else 
		 {
			 System.out.println("Số " + so + " là số chẵn.");
		 }
		 
		}
	}


