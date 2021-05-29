import javax.swing.JOptionPane;

public class DataTypes {
	public static void main (String[] args) {
		
		String namaDepan = "Muhammad";
		String namaTengah = "Ihsan";
		String namaBelakang = "Ramadhan";
		int usia = 20;
		int targetKuliah = 4;
		double ipk = 3.89764512;
		char nilaiAbjad = 'A';
		boolean statusAktif = true;
		
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