package pohon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import uts.ListKu;
import uts.ListKuFungsi;

/**
 * Definisi beberapa fungsi/method dan contoh bagaimana mengelola pohon, termasuk juga
 * fungsi/method cetak (print)
 */
public class PohonAksi extends Pohon {

    /**
     * Menghitung tinggi dari pohon
     *@return tinggi dari pohon
     */
    public static int tinggi(Pohon p) {
        if (p.adalahKosong())
            return 0;
	else {   
            int kiriTinggi = tinggi(p.kiri());
            int kananTinggi = tinggi(p.kanan());
            
            return Math.max(kiriTinggi, kananTinggi) + 1;
        }
    }

    /**
     * Mendapatkan nilai pohon dengan masing-masing elemen dikalikan 3 (tiga) 
     * dari input Pohon
     */
    public static Pohon tigaKali(Pohon p) {
	if (p.adalahKosong()) {
	    return new Pohon();
        } else {
	    return new Pohon(3 * p.nilai(), tigaKali(p.kiri()), tigaKali(p.kanan()));
        }
    }

    /**
     * Mendapatkan nilai ListKu yang diperoleh dari penelusuran Pohon secara
     * INORDER, yaitu: cabang kiri dulu, lalu akar/simpul saat ini, lalu cabang kanan
     */
    public static ListKu inorder(Pohon p) {
        if (p.adalahKosong()) {
            return ListKu.kosong();
        } else {
            ListKu kiriElemen = inorder(p.kiri());
            ListKu kananElemen = inorder(p.kanan());
            return ListKuFungsi.sambung(kiriElemen, ListKu.buat(p.nilai(), kananElemen));
        }
    }
    
    /**
     * Sumber (dengan perubahan seperlunya) http://www.connorgarvey.com/blog/?p=82
     * Cetak representasi terformat dari pohon yang ingin dicetak. Formatnya adalah sbb.
<code>
10
   |
   |- 14
   |   |
   |   |- 17
   |   |
   |   |- 13
   |       |
   |       | - [kosong]
   |       |
   |       |- 12
   |
   |- 6
</code>

     * Di mana anak pohon paling bawah adalah cabang pohon kiri dan anak pohon paling atas
     * adalah cabang pohon kanan Jika kedua anak pohon adalah pohon kosong (nil) maka 
     * mereka tidak akan dicetak. Jika hanya satu anak pohon yang kosong, maka mereka akan
     * dicetak sehingga dapat diketahui mana yang anak pohon kanan, mana yang anak
     * pohon kiri.
     * @param pohon Obyek pohon yang boleh jadi tidak boleh null
     */
    public static void cetak(Pohon pohon) {
	System.out.print(PohonAksi.toString(pohon));
    }

    public static String toString(Pohon pohon) {
        final StringBuilder buffer = new StringBuilder();
        return toStringPohonBantu(pohon, buffer, 
				  new LinkedList<Iterator<Pohon>>()).toString();
    }
 
    private static String toStringPohonBuatBaris(
			    java.util.List<Iterator<Pohon>> indukIterators, 
			    boolean terakhir) {
        StringBuilder hasil = new StringBuilder();
        Iterator<Iterator<Pohon>> itr = indukIterators.iterator();
        while (itr.hasNext()) {
            Iterator<Pohon> it = itr.next();
            if (it.hasNext() || (!itr.hasNext() && terakhir)) {
                hasil.append("   |");
            } else {
                hasil.append("    ");
            }
        }
        return hasil.toString();
    }
 
    private static StringBuilder toStringPohonBantu(
		   Pohon p, StringBuilder buffer, 
		   java.util.List<Iterator<Pohon>> indukIterators) {
  
        if (!indukIterators.isEmpty()) {
            boolean terakhir = 
		!indukIterators.get(indukIterators.size() - 1).hasNext();
            String baris = toStringPohonBuatBaris(indukIterators, terakhir);
            buffer.append("\n").append(baris).append("\n").
		append(baris).append("- ");
        }
        
        if (p.adalahKosong()) {
            buffer.append("[kosong]");
            return buffer;
        } 
	else
            buffer.append(p.nilai());
        
        if (!(p.kiri().adalahKosong() && p.kanan().adalahKosong())) {
            Iterator<Pohon> it = getAnakIterator(p);
            indukIterators.add(it);
            while (it.hasNext()) {
                Pohon anak = it.next();
                toStringPohonBantu(anak, buffer, indukIterators);
            }
            indukIterators.remove(it);
        }
	return buffer;
    }
    
    private static Iterator<Pohon> getAnakIterator(Pohon p) {
        if (p.adalahKosong()) {
            return Collections.<Pohon>emptyList().iterator();
        } else {
	    return Arrays.asList(new Pohon[] { 
		    p.kanan(),
		    p.kiri()}).iterator();    
        }
    }

}