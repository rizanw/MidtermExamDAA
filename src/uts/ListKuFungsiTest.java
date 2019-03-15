package uts;

import static uts.ListKu.buat;
import static uts.ListKu.kosong;

public class ListKuFungsiTest {
    /**
     * Transformasikan array ke ListKu
     * @param array[] adalah masukan/input array
     * @param indeks adalah indeks awal dari array
     * @return ListKu adalah tipe pengembalian fungsi
     */
    public static ListKu arrayKeListKu(int array[], int indeks) {
        if (indeks == array.length) {
            return kosong();
        } else {
            return buat(array[indeks], arrayKeListKu(array, indeks + 1));
        }
    }
    public static void main(String args[]) {
        int a1[] = {5,2,-7,0};
        ListKu list1 = arrayKeListKu(a1, 0);
        System.out.println(list1);
        
        ListKu e0 = new ListKu(0, ListKu.kosong());
        ListKu e8 = ListKu.buat(8, e0);
        ListKu e_5 = ListKu.buat(-5, e8);
        ListKu list2 = ListKu.buat(2, e_5);
        System.out.println(list2);
        System.out.println("Dari @Override fungsi toString(): " + list2.toString());
        
        int a2[] = {2,-5,8,0};
        ListKu list3 = arrayKeListKu(a2, 0);
        if (list2.toString().equals(list3.toString())) {
            System.out.println("list2 sebanding dengan list3");
        } else {
            System.out.println("list2 tidak sebanding dengan list3");
        }
        
        System.out.println("Elemen dari list3, indeks ke-1: " + ListKuFungsi.pilih(1, list3));
        System.out.println("Elemen terakhir dari list3: " + ListKuFungsi.terakhir(list3));
    }
}