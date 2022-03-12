package TugasSDA3;

import java.util.LinkedList;

public class Tugas3_Linkedlist {
    public static void main(String[] args) {
        //create linked list
        LinkedList<String> No_BP = new LinkedList<>();
        LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();

        //menambahkan data
        System.out.println(">>>DATA<<<");
        System.out.println("---------");
        No_BP.add("2111522011");
        No_BP.add("2110523029");
        No_BP.add("2110952007");

        Nama_Mahasiswa.add("Nisa");
        Nama_Mahasiswa.add("Bunga");
        Nama_Mahasiswa.add("Nurul");

        Alamat.add("Lubuk Sikaping");
        Alamat.add("Batusangkar");
        Alamat.add("Lima Puluh Kota");

        System.out.println("Output NIM \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("Output Nama \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
        System.out.println("Output Alamat \t: "+Alamat+", Ukuran : " +Alamat.size());
        System.out.println("  \n");

        //add karakter lain
        System.out.println(">>>FUNGSI MENAMBAHKAN KARAKTER LAIN<<<");
        System.out.println("---------------------------------------");
        No_BP.add(2, "2110952018");
        Nama_Mahasiswa.addFirst("Aina");
        Alamat.add(1, "Bukittinggi");

        System.out.println("Output NIM setelah ditambahkan  \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("Output Nama setelah ditambahkan \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
        System.out.println("Output Alamat setelah ditambahkan \t: "+Alamat+", Ukuran : " +Alamat.size());
        System.out.println("  \n");

        //menyisipkan elemen
        System.out.println(">>>FUNGSI MENYISIPKAN ELEMEN<<<");
        System.out.println("---------------------------------------");
        No_BP.set(1, "2111523456");
        Nama_Mahasiswa.set(3, "Izzati");
        Alamat.set(0, "Pariaman");
        
        System.out.println("Output NIM setelah disisipkan   \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("Output Nama setelah disisipkan  \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
        System.out.println("Output Alamat setelah disisipkan \t: "+Alamat+", Ukuran : " +Alamat.size());
        System.out.println("  \n");

        //menghapus elemen
        System.out.println(">>>FUNGSI MENGHAPUS ELEMEN<<<");
        System.out.println("---------------------------------------");
        No_BP.removeFirst();
        Nama_Mahasiswa.remove("Bunga");
        Alamat.removeLast();

        System.out.println("Output NIM setelah dihapus  \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("Output Nama setelah dihapus \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
        System.out.println("Output Alamat setelah dihapus \t: "+Alamat+", Ukuran : " +Alamat.size());
        System.out.println("  \n");

         //fungsi pop
         System.out.println(">>>FUNGSI POP<<<");
         System.out.println("---------------------------------------");
         Nama_Mahasiswa.pop();
         No_BP.pop();
         Alamat.pop();
 
         System.out.println("Output NIM setelah fungsi pop   \t: "+No_BP+", Ukuran : " +No_BP.size());
         System.out.println("Output Nama setelah fungsi pop  \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
         System.out.println("Output Alamat setelah fungsi pop \t: "+Alamat+", Ukuran : " +Alamat.size());
         System.out.println("  \n");

        //fungsi push
        System.out.println(">>>FUNGSI PUSH<<<");
        System.out.println("---------------------------------------");
        Nama_Mahasiswa.push("Mutiara");
        No_BP.push("2111709785");
        Alamat.push("Payakumbuh");

        System.out.println("Output NIM setelah fungsi push  \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("Output Nama setelah fungsi push \t: "+Nama_Mahasiswa+", Ukuran : " +Nama_Mahasiswa.size());
        System.out.println("Output Alamat setelah fungsi push \t: "+Alamat+", Ukuran : " +Alamat.size());
        System.out.println("  \n");

        //menghapus semua data pada no.bp
        System.out.println(">>>FUNGSI MENGHAPUS SEMUA DATA PADA NIM<<<");
        System.out.println("---------------------------------------");
        No_BP.clear();

        System.out.println("Output NIM setelah dihapus semua  \t: "+No_BP+", Ukuran : " +No_BP.size());
        System.out.println("  \n");

        //fungsi isEmpty
        System.out.println(">>>FUNGSI IsEmpty<<<");
        System.out.println("--------------");
        System.out.println("Is NIM List empty? \t " +No_BP.isEmpty());
        System.out.println("Is Nama List empty? \t " +Nama_Mahasiswa.isEmpty());
        System.out.println("Is Alamat List empty? \t " +Alamat.isEmpty());

    }
}
