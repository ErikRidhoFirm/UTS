import java.util.Scanner;

public class pembayaran090 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        double totalhargaMinuman = 0;
        double totalhargaMakanan = 0;
        int totalHarga = 0;

        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = input09.nextInt();

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Jenis barang (minuman atau makanan): ");
            String jenisBarang = input09.next();
            System.out.print("Nama barang: ");
            String namaBarang = input09.next();
            System.out.print("Harga barang: ");
            double hargaBarang = input09.nextDouble();

            if (jenisBarang.equals("minuman")) {
                totalhargaMinuman += hargaBarang;
            } else if (jenisBarang.equals("makanan")) {
                totalhargaMakanan += hargaBarang;
            }
        if (totalhargaMinuman >= 3) {
            totalhargaMinuman -= totalhargaMinuman * 0.05;
        }
        System.out.print("Apakah ingin membeli kantong plastic? (y / t)? ");
        String Membelikantong = input09.next();
        if (Membelikantong.equals("y")) {
            totalHarga += 200;
        }
        if (totalhargaMinuman + totalhargaMakanan >= 1000000) {
            totalHarga += (totalhargaMinuman + totalhargaMakanan) * 0.07;
        }
        System.out.println("Total harga yang harus dibayar : " + totalHarga);
        }
    }
}

