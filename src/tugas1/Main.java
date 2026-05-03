package tugas1;


import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        
        Menu[] menu = new Menu[8];
        menu[0] = new Menu("Ayam bakar", 18000, "Makanan");
        menu[1] = new Menu("Ayam geprek", 16000, "Makanan");
        menu[2] = new Menu("Sate sapi", 23000, "Makanan");
        menu[3] = new Menu("Iga bakar", 25000, "Makanan");
        menu[4] = new Menu("Air mineral",3000 , "Minuman");
        menu[5] = new Menu("Jus melon", 14000, "Minuman");
        menu[6] = new Menu("Teh manis", 10000, "Minuman");
        menu[7] = new Menu("Es jeruk", 12000, "Minuman");
        
        System.out.println("========= MENU =========");
        System.out.println("Kategori: " +  menu[0].getKategori()+ "\n------------------");
        System.out.println("1. " + menu[0].namaMenu + " - Rp " + nf.format(menu[0].harga));
        System.out.println("2. " + menu[1].namaMenu + " - Rp " + nf.format(menu[1].harga));
        System.out.println("3. " + menu[2].namaMenu + " - Rp " + nf.format(menu[2].harga));
        System.out.println("4. " + menu[3].namaMenu + " - Rp " + nf.format(menu[3].harga));
        System.out.println("\nKategori: " +  menu[4].getKategori()+ "\n------------------");
        System.out.println("5. " + menu[4].namaMenu + " - Rp " + nf.format(menu[4].harga));
        System.out.println("6. " + menu[5].namaMenu + " - Rp " + nf.format(menu[5].harga));
        System.out.println("7. " + menu[6].namaMenu + " - Rp " + nf.format(menu[6].harga));
        System.out.println("8. " + menu[7].namaMenu + " - Rp " + nf.format(menu[7].harga));
        System.out.println("========================");
        
        //Array jumlah pesanan
        int[] jumlahPesanan = new int[5];        
        
        //PESANAN KE 1
        System.out.print("\nSilahkan masukan nomor menu yang anda pilih(1-8): ");
        int pesan1  = input.nextInt();
        System.out.print("Jumlah: ");
        int jumlah1 = input.nextInt();
        input.nextLine();
        
        //ambil harga
        int h1 = menu[pesan1 - 1].getHarga();      
        //simpan ke array
        jumlahPesanan[0] = jumlah1;
        
        System.out.print("\nApakah anda ingin lanjut pesan?(y/n): ");
        String jawab = input.nextLine();
             
        //inisialisasi
        int pesan2 =0; int jumlah2 = 0; int h2 = 0;
        int pesan3 = 0; int jumlah3 = 0; int h3 = 0;
        int pesan4 =0; int jumlah4 = 0; int h4 = 0;
        
        //PESANAN KE 2
        if (jawab.equalsIgnoreCase("y")){
            System.out.println("---------------------------------------------------------------");
            System.out.print("Silahkan masukan nomor menu yang anda pilih(1-8): ");      
            pesan2  = input.nextInt();
            System.out.print("Jumlah: ");
            jumlah2 = input.nextInt();
            input.nextLine();
            
            h2 = menu[pesan2 - 1].getHarga();
            jumlahPesanan[1] = jumlah2;
            
            
            System.out.print("\nApakah anda ingin lanjut pesan?(y/n): ");
            jawab = input.nextLine();
            
            //PESANAN KE 3
            if (jawab.equalsIgnoreCase("y")){
                System.out.println("---------------------------------------------------------------");
                System.out.print("Silahkan masukan nomor menu yang anda pilih(1-8): ");
                pesan3 = input.nextInt();
                System.out.print("Jumlah: ");
                jumlah3 = input.nextInt();
                input.nextLine();

                //ambil harga
                h3 = menu[pesan3 - 1].getHarga();
                //simpan ke array
                jumlahPesanan[2] = jumlah3;
                
                
                //PESANAN KE 4                
                System.out.print("\nApakah anda ingin lanjut pesan?(y/n): ");
                jawab = input.nextLine();
                if(jawab.equalsIgnoreCase("y")){
                    System.out.println("---------------------------------------------------------------");
                    System.out.print("Silahkan masukan nomor menu yang anda pilih(1-8): ");
                    pesan4 = input.nextInt();
                    System.out.print("Jumlah: ");
                    jumlah4 = input.nextInt();
                    input.nextLine();

                    h4 = menu[pesan4 - 1].getHarga();
                    jumlahPesanan[3] = jumlah4;
                }
            }    
        }   
        
        //hitung total
        int total = (h1 * jumlah1) + (h2 * jumlah2) + (h3 * jumlah3 ) + (h4 * jumlah4);
        
        //penawaran promo buy 1 get 1 setiap pembelian 50k
        int diskon = 0;
        int pesan5 = 0; int jumlah5 = 0; int h5 = 0; String k = "";
        if(total > 50000){
            System.out.println("\n=================================================================");
            System.out.println("\t\t\tPENAWARAN PROMO!");
            System.out.println("Anda mendapatkan penawaran promo buy 1 get 1 setiap pembelian 50k\n\t\t     untuk kategori minuman");
            System.out.println("=================================================================");
            System.out.print("Apakah anda ingin mengikuti promonya?(y/n): ");
            jawab = input.nextLine();
 
            if(jawab.equalsIgnoreCase("y")){
                System.out.println("\n---------------------------------------------------------------");
                System.out.print("Silahkan masukan nomor menu yang anda pilih(1-8): ");
                pesan5 = input.nextInt();
                System.out.print("Jumlah: ");
                jumlah5 = input.nextInt();
                
                h5 = menu[pesan5 - 1].harga;
                jumlahPesanan[4] = jumlah5;
                k = menu[pesan5 - 1].kategori;    
                
                if(!k.equalsIgnoreCase("Minuman")){            
                    System.out.println("\n===================================\nPilih menu dalam kategori minuman!\n===================================");
                    System.out.print("Masukan nomor menu yang anda pilih (Kategori minuman!): ");
                    pesan5 = input.nextInt();
                    System.out.print("Jumlah: ");
                    jumlah5 = input.nextInt();

                    h5 = menu[pesan5 - 1].harga;
                    jumlahPesanan[4] = jumlah5;
                    k = menu[pesan5 - 1].kategori;
                } 
                
            } else if(jawab.equalsIgnoreCase("n") && total > 100000){
                diskon = (total/100)*10;
                System.out.println("\n============================================================");
                System.out.println("\t\t\t  SELAMAT!\nAnda mendapatkan diskon 10% setiap pembelian lebih dari 100k");
                System.out.println("\n============================================================");
            }
        }
        
        
        int totalAwal  = 0;
        if(k.equalsIgnoreCase("Minuman")){
            totalAwal = total + (h5 * jumlah5);
        } else{
            totalAwal = total;
        }
        
        //hitung pajak 10&
        int pajak = (totalAwal/100)*10;
        //biaya pelayanan
        int biayaPelayanan = 20000;
        //total akhir setelah pajak dan diskon
        int totalAkhir = totalAwal + pajak - diskon + biayaPelayanan;
        
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Tagihan pembayaran (sudah termasuk pajak, biaya pelayanan dan diskon): Rp " + nf.format(totalAkhir));
        System.out.print("Dibayar: Rp ");
        int bayar = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        
        
        //Output
        System.out.println("\n\n======= RINCIAN PESANAN =======");
        System.out.println("- " + menu[pesan1 - 1].namaMenu + "(" + jumlah1 + "): Rp " + nf.format(h1*jumlah1));
        if(jumlah2 > 0){
           System.out.println("- " + menu[pesan2 - 1].namaMenu + "(" + jumlah2 + "): Rp " + nf.format(h2*jumlah2)); 
        }
        if(jumlah3 > 0){
            System.out.println("- " + menu[pesan3 - 1].namaMenu + "(" + jumlah3 + "): Rp " + nf.format(h3*jumlah3));
        }
        if(jumlah4 > 0){
            System.out.println("- " + menu[pesan4 - 1].namaMenu + "(" + jumlah4 + "): Rp " + nf.format(h4 * jumlah4));
        }
        if(jumlah5 > 0 && k.equalsIgnoreCase("Minuman")){
           System.out.println("- " + menu[pesan5 - 1].namaMenu + "(" + jumlah5 + ") Rp " + nf.format(h5 * jumlah5)); 
        }
        if(k.equalsIgnoreCase("Minuman")){
            System.out.println("    + 1 " + menu[pesan5 - 1].namaMenu + "(GRATIS!)");
        }
        System.out.println("--------------------------------");
        System.out.println("Total awal: RP " + nf.format(totalAwal));
        System.out.println("================================");
        if(diskon > 0){
            System.out.println("Diskon: -Rp " + nf.format(diskon));
        }
        System.out.println("Pajak: Rp " + nf.format(pajak));
        System.out.println("Biaya pelayanan: Rp " + nf.format(biayaPelayanan));
        System.out.println("================================");
        System.out.println("Total akhir: Rp " + nf.format(totalAkhir));
        System.out.println("Dibayar: Rp " + nf.format(bayar));
        System.out.println("--------------------------------");
        System.out.println("Kembalian: " + nf.format(bayar - totalAkhir));
        System.out.println("================================");
            
    }
    
}
