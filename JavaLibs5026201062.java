import javax.swing.JOptionPane;
public class JavaLibs5026201062 
{
	public static void main (String[]args)
	{
	double saku, pengeluaran;

        String ask1 = JOptionPane.showInputDialog("Nama kamu:");
        String ask2 = JOptionPane.showInputDialog("Jenis kelamin:");
        String ask3 = JOptionPane.showInputDialog("Tanggal kamu lahir:");
        String ask4 = JOptionPane.showInputDialog("Bulan kamu lahir: contoh : Januari");
        String ask5 = JOptionPane.showInputDialog("Tahun kamu lahir:");
        String ask6 = JOptionPane.showInputDialog("Apa jurusan kuliah kamu ?");
        String ask7 = JOptionPane.showInputDialog("Tahun masuk kuliah:");
        String ask8 = JOptionPane.showInputDialog("Kota asalmu:");
        String ask9 = JOptionPane.showInputDialog("Uang saku per bulan:");
        String ask10 = JOptionPane.showInputDialog("Pengeluaran perbulan:");
	String ask11 = JOptionPane.showInputDialog("Apa hobimu?");

        saku = Double.parseDouble(ask9);
        pengeluaran = Double.parseDouble(ask10);

        double sisa = (saku-pengeluaran)/30;
        double tabungan = sisa*4*365;

        int angkatan = Integer.parseInt(ask7);
        int tahun = Integer.parseInt(ask5);

        int lulus = angkatan+4;
        int usia = tahun+4;

        JOptionPane.showMessageDialog(null,"Hai mahasiswa baru. "
                +"\nBerikut biodata kamu! nama :"+" "+ask1+", "+ask2+", lahir "+ask3+" "+ask4+" "+ask5+"" + " " +"hobimu adalah"+" "+ask11+
                "\nKamu mengambil jurusan "+ask6+" angkatan "+ask7+". Kota asal kamu "+ask8+". " +
                "\nSelama kuliah kamu akan mampu menyisihkan uang saku sebesar Rp."+" "+sisa+" "+"perharinya. " +
                "\nSetelah kamu lulus di tahun "+lulus+", kamu akan berusia "+usia+" dan memiliki tabungan sebesar Rp."+" "+tabungan);
}
}
