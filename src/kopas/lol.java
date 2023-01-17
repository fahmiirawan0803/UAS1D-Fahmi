package kopas;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.*;

public class lol {
    // Nama file : MembalikUrutanElemen.java
// Membalik urutan elemen larik

// Mengimpor Java predifined class

    // Deklarasi kelas

        // Metoda main
        public static void main(String[] args) {

            String tampilan = "Membalik Urutan Elemen Larik\n\n";
            JTextArea areaTampilan;
            char[] karakterSatu = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                    'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                    'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                    'Y', 'Z'};

            // Menampilkan elemen karakterSatu
            tampilan += "Urutan elemen larik karakterSatu :\n";
            for (int x = 0; x < karakterSatu.length; x++) {
                tampilan += karakterSatu[x] + "  ";
                if ((x + 1) % 10 == 0)
                    tampilan += "\n";
            }

            // Memberikan larik sebagai argumen metoda
            char[] karakterDua = membalikElemen(karakterSatu);

            // Menampilkan elemen karakterDua
            tampilan += "\n\nUrutan elemen larik karakterDua :\n";
            for (int x = 0; x < karakterDua.length; x++) {
                tampilan += karakterDua[x] + "  ";
                if ((x + 1) % 10 == 0)
                    tampilan += "\n";
            }

            // Menampilkan hasil
            areaTampilan = new JTextArea();
            areaTampilan.setText(tampilan);
            JOptionPane.showMessageDialog(null, areaTampilan,
                    "Membalik Urutan Elemen Larik", JOptionPane.INFORMATION_MESSAGE);

            // Mengakhiri program aplikasi
            System.exit(0);
        }

        // Mendefinisikan metoda
        public static char[] membalikElemen(char[] larikA) {

            char[] larikB = new char[larikA.length];

            // Membalik urutan elemen larik
            for (int a = 0, b = larikB.length - 1; a < larikA.length; a++, b--)
                larikB[b] = larikA[a];

            return larikB;
        }
}
