package tugas1;



public class Menu {
    String namaMenu;
    int harga;
    String kategori;
    
    //contructor
    Menu(String namaMenu, int harga, String kategori){
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
        
    }
    
    //getter harga
    int getHarga(){
    return harga;
    }
    
    
    //Getter kategori
    String getKategori(){
    return kategori;
    }
    
   
}
