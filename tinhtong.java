package lecaovan;
import java.util.Scanner;

public class tinhtong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhập số a: ");
		 int soA = scanner.nextInt();
		 System.out.print("Nhập số b: ");
		 int soB = scanner.nextInt();
		 int kq = soA + soB;
		 System.out.println("tổng của " + soA + " + " + soB + " = " + kq);

	}

}
