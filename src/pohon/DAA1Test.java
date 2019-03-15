package pohon;

import uts.ListKu;

class DAA1Test extends DAA1 { 
    public static void main (String args[]) {
        Pohon pohon = arrayKePohon(new
//                int[] {1, 9 ,2, 4, 0, 2, 9, 3, 0, 2, 4, 5, 6}
//                int[] {41, 20, 11, 29, 32, 65, 50, 91, 72, 99}
                int[] {1, 2, 3, 4}
        );

        cetak("pohon asli: Array ke Pohon", pohon);
               
        // 1. adalahBST()
        System.out.println("Soal 1: Binary Search Tree (BST) -> adalahBST()");
        if (adalahBST(pohon)) {
            System.out.println("pohon adalah BST");
        } else {
            System.out.println("pohon bukan merupakan BST");
        }
        
        // 2. cetakMenurun()
        System.out.println("Soal 2: cetakMenurun()");
        cetakMenurun(pohon);
        
        // 3. maks()
        System.out.println(" ");
        System.out.println("Soal 3: maks()");
        System.out.println("Nilai maks di pohon adalah: " + maks(pohon));
        
        // 4. hapus()
        System.out.println("Soal 4: hapus()");
//        cetak("hapusBST", hapus(pohon, 2));
    }

    static void cetak (String judul) {
        System.out.println( "-----------------------------" );
        System.out.println( "# " + judul + " #");
        System.out.println();
    }

    static void cetak (String judul, Pohon p) {
        cetak(judul);
        cetak(p);

        System.out.println();
    }

    static void cetak (String judul, ListKu list) {
        cetak(judul);
        cetak(list);

        System.out.println();
    }

    static void cetak (Pohon p) {
        PohonAksi.cetak(p);
        System.out.println();
    }

    static void cetak (ListKu list ) {
        for (ListKu l = list; ! l.adalahKosong(); l = l.ekor() ) {
            System.out.println( "- " + l.kepala() );
        }
    }
    
    private static Pohon arrayKePohon (int a[]) {
        Pohon p = new Pohon();
        for (int i = 0; i < a.length; i++) {
            p = sisipkan(a[i], p);
        }
        return p;
    }

    private static Pohon sisipkan(int n, Pohon p) {
        if (p.adalahKosong()) {
            return new Pohon(n, new Pohon(), new Pohon());
        } else if (n <= p.nilai()) {
            return new Pohon(p.nilai(), sisipkan(n, p.kiri()), p.kanan());
        } else {
            return new Pohon(p.nilai(), p.kiri(), sisipkan(n, p.kanan()));
        }
    }
    
}