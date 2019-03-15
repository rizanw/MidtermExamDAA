package uts;
/** 
 * Kelas ListKu mendefinisikan tipe rekursif dari ListKu
 * Menyediakan constructor dan fungsi/metode pengaksesan
 */
public class ListKu {
    protected boolean kosong;
    protected int kepala;
    protected ListKu ekor;
    public ListKu(int kepala, ListKu ekor) {
        kosong = false; 
        this.kepala = kepala;
        this.ekor = ekor;
    }
    public ListKu() {
        kosong = true;
    }
    /**
     * Buat list baru dari elemen kepala dan ListKu ekor
     * @param kepala adalah elemen yang ditambahkan di awal list
     * @param ekor adalah bagian akhir list yang berupa list
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu buat(int kepala, ListKu ekor) {
        return new ListKu(kepala, ekor);
    }
    /**
     * Buat ListKu kosong yang baru
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu kosong() {
        return new ListKu();
    }
    /**
     * Mengecek kondisi list, memberikan nilai true jika list-nya memang kosong
     * @return kosong adalah tipe boolean: true atau false
     */
    public boolean adalahKosong() {
        return kosong;
    }
    /**
     * Mendapatkan nilai kepala dari list ini, atau menberikan eksepsi/protes jika list-nya kosong
     * @return kepala bernilai bulat (integer) sebagai nilai yang didapat
     * @throws IllegalStateException jika list-nya kosong
     */
    public int kepala() {
        if (adalahKosong()) {
            throw new IllegalStateException("Coba akses kepala dari list yang kosong");
        }
        return kepala;
    }
    /**
     * Mendapatkan ekor dari list yang berupa list, atau memberikan eksepsi jika list-nya kosong
     * @return ekor bernilai list
     * @throws IllegalStateException jika list-nya kosong
     */    
    public ListKu ekor() {
        if (adalahKosong()) {
            throw new IllegalStateException("Coba akses ekor dari list yang kosong");
        }
        return ekor;
    }
    /**
     * Mendapatkan representasi/isi dari list, contoh: "[1, 2, 3]"
     * @return toString bernilai String
     */
    @Override
    public String toString() {
        return toStringBantuan(this, new java.util.ArrayList<Integer>()); // ArrayList of Integer
    }
    private String toStringBantuan(ListKu list, java.util.List<Integer> listSkr) {
        if (list == null) {
            throw new IllegalStateException(
                         "Elemen berikutnya dari list adalah null. " +
			 "Seharusnya adalah list yang lain atau nil. " +
			 "List sampai saat ini: " + listSkr);
        } else if (list.adalahKosong()) {
            return listSkr.toString();
        } else {
            listSkr.add(list.kepala());
            return toStringBantuan(list.ekor(), listSkr);
        }
    }
}