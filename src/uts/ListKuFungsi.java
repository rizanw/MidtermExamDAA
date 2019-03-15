package uts;
/**
 * Kelas ListKuFungsi mendefinisikan sejumlah fungsi static yang bekerja untuk list
 * menggunakan kelas ListKu.
 */
public class ListKuFungsi extends ListKu {
    /**
     * Pilih dan dapatkan nilai elemen ke-n dari list a.
     * Asumsikan bahwa elemen ke-n ada.
     * @param n indeks elemen yang akan dipilih
     * @param a adalah list yang diakses
     * @return Integer (bilangan bulat), yaitu bilangan yang terpilih
     */
    public static int pilih(int n, ListKu a) {
	if (a.adalahKosong()) {
	    throw new IllegalStateException(
		      "Pilih - list tidak memiliki elemen sama sekali.");
        } else if (n == 0) {
	    return a.kepala();
        } else {
            return pilih(n-1, a.ekor());
        }
    }
    /**
     * Mendapatkan elemen terakhir dari list a.
     * Asumsikan bahwa paling tidak ada satu elemen dalam list a
     * @param a adalah list yang diakses
     * @return  Integer (bilangan bulat), yaitu bilangan yang didapatkan
     */
    public static int terakhir(ListKu a) {
	if (a.adalahKosong()) {
	    throw new IllegalStateException("List tidak punya elemen sama sekali.");
        } else if (a.ekor().adalahKosong()) {
	    return a.kepala();
        } else {
	    return terakhir(a.ekor());
        }
    }
    /**
     * Tambahkan satu elemen pada akhir dari list  a.
     * Return the extended list.
     * @param a adalah list yang akan ditambahkan
     * @param e adalah elemen yang ditambahkan
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu tambahAkhir(ListKu a, int e) {
        if (a.adalahKosong()) {
            return buat(e, kosong());
        } else {
            return buat(a.kepala(), tambahAkhir(a.ekor(), e));
        }
    }
    /**
     * Buat sebuah list yang merupakan hasil dari penyambungan list b yang 
     * disambungkan ke akhir dari list a.
     * @param a adalah list pertama yang akan disambungkan sebagai list awal
     * @param b adalah list kedua yang akan disambungkan ke akhir dari list a
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu sambung(ListKu a, ListKu b) {
        if (a.adalahKosong()) {
            return b;
        } else {
            return buat(a.kepala(), sambung(a.ekor(), b));
        }
    }
    /**
     * tambahAkhir juga dapat didefinisikan menggunakan sambung tanpa perlu rekursif.
    public static ListKu tambahAkhir(ListKu a, int e) {
        return sambung(a, buat(e, kosong()));
    }
    */
    /**
     * Implementasi dari pembalikan urutan elemen list secara sederhana.
     * Membutuhkan waktu lama untuk list yang besar
     * @param a adalah list yang ingin dibalik urutan elemennya
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu pembalikanSederhana(ListKu a) {
        if (a.adalahKosong()) {
            return kosong();
        } else {
            return tambahAkhir(pembalikanSederhana(a.ekor()), a.kepala());
        }
    }
    /**
     * Implementasi yang efisien dari pembalikan urutan elemen list yang menggunakan
     * fungsi pembantu dan pengumpul
     * @param list adalah list yang ingin dibalik urutan elemennya
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu pembalikan(ListKu list) {
        return balikKumpul(list, kosong());
    }
    private static ListKu balikKumpul(ListKu asli, ListKu balikan) {
        if (asli.adalahKosong()) {
            return balikan;
        } 
	else {
            return balikKumpul(asli.ekor(), buat(asli.kepala(), balikan));       
        }
    }
}