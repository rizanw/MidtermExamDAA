package pohon;
/**
 * Kelas Pohon merupakan kelas rekursif. Beberapa constructor dan fungsi/method untuk
 * mengakses dijelaskan dalam kelas ini
 */
public class Pohon {
    protected final boolean kosong;
    protected final int nilai;
    protected final Pohon kiri, kanan;

    /**
     * Buat Pohon baru, di mana nilai akarnya adalah n,
     * cabang pohon ke kiri adalah kiri, cabang pohon ke kanan adalah kanan 
     */
    public Pohon (int n, Pohon kiri, Pohon kanan) {
        this.kosong = false;
        this.nilai = n;
        this.kiri = kiri;
        this.kanan = kanan;
    }
    
    /**
     * Buat Pohon kosong
     */
    public Pohon() {
        this.kosong = true;
        this.nilai = 0;
        this.kiri = null;
        this.kanan = null;
    }
    
    public Pohon (int n) {
        this.kosong = false;
        this.nilai = n;
        this.kiri = new Pohon();
        this.kanan = new Pohon();
    }
    
    /**
     * Mengembalikan nilai true jika pohon ini kosong (nilainya nil)
     */
    public boolean adalahKosong() {
        return kosong;
    }
    
    /**
     * Dapatkan nilai akar dari pohon ini
     */
    public int nilai() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                          "Mencoba untuk mengakses akar dari pohon kosong");
        }
        return nilai;
    }
    
    /**
     * Dapatkan cabang ke kiri dari simpul (node) ini
     */
    public Pohon kiri() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                          "Mencoba untuk mengakses cabang dari pohon kosong");
        }
        return kiri;
    }
    
    /**
     * Dapatkan cabang ke kanan dari simpul (node) ini
     */
    public Pohon kanan() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                          "Mencoba untuk mengakses cabang dari pohon kosong");
        }
        return kanan;
    }
    
    /**
     * Buat String dalam baris jamak untuk menampilkan pohon ini. Formatnya adalah sbb; 
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
     * @return String yang berisi pohon yang terformat
     */
    @Override public String toString() {
        return PohonAksi.toString(this);
    }

    @Override public boolean equals(Object o) {
	Pohon p = (Pohon) o;
	if (kosong) {
	    return p.kosong;
        } else {
	    return !p.kosong && nilai == p.nilai &&
		   kiri.equals(p.kiri) && kanan.equals(p.kanan);
        }
    }
    
}