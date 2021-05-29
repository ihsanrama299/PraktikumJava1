import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String namaDepan = "Muhammad";
		String namaTengah = "Ihsan";
		String namaBelakang = "Ramadhan";
		int usia = 20;
		int targetKuliah = 4;
		double ipk = 3.89764512;
		char nilaiAbjad = 'A';
		boolean statusAktif = true;
		
		System.out.print("Input Nama Depan : ");
		namaDepan = scanner.nextLine();
		System.out.print("Input Nama Tengah : ");
		namaTengah = scanner.nextLine();
		namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");
		System.out.print("Input Usia : ");
		usia = scanner.nextInt();
		System.out.print("Input IPK : ");
		ipk = scanner.nextDouble();
		System.out.print("Input Nilai Abjad : ");
		nilaiAbjad = scanner.next().charAt(0);
		System.out.print("Status kuliah aktif? : ");
		statusAktif = scanner.nextBoolean();

		System.out.println("========== OUTPUT ==========");
		System.out.println("Nama depan : " + namaDepan);
		System.out.println("Nama tengah : " + namaTengah);		
		System.out.println("Nama belakang : " + namaBelakang);
		System.out.println("Usia : " + usia);
		System.out.println("Target kuliah : " + targetKuliah + " tahun");
		System.out.println("IPK : " + ipk);
		System.out.println("Nama PBO : " + nilaiAbjad);
		System.out.println("Status kuliah aktif : " + statusAktif);

		JOptionPane.showMessageDialog(null, "Hai, " + " " + namaDepan + " " + namaTengah + " " + namaBelakang);

	}
}