package latihaninsupovwisnu;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Elf e = new Elf();
        Orcs o = new Orcs();
        System.out.println("---------------- Pilih karakter --------------");
            System.out.println("1.Elf");
            System.out.println("2.Orc");
            System.out.println("-------------------------------------------------");
                System.out.print("Pilihanmu : ");
                int pilihanmu = input2.nextInt();
            
            switch(pilihanmu){
            case 1:
                System.out.println("---------------- Hai ELF --------------");
                System.out.print("Nama : ");
                e.nama = input.next();
                System.out.print("Usia : ");
                e.usia = input.nextInt();
                System.out.print("Kemampuan : ");
                e.kemampuan = input.next();
                System.out.print("Senjata ? [Panah, Tombak , Pedang] : ");
                e.senjata = input.next();
                System.out.print("Bisa terbang ? [Ya atau Tidak] : ");
                e.terbang = input.nextBoolean();  
                if (e.terbang = true) {  
               System.out.println("Ya");  
           } 
                else  {  
               System.out.println("Tidak");  
           }      
                System.out.println("-------------------------------------------------");

                Scanner waitForKeypress = new Scanner (System.in);
                System.out.print (" Tekan tombol Enter untuk melanjutkan ");
                waitForKeypress.nextLine ();
                
                System.out.println("---------------- Hai ELF --------------");
                System.out.println("Nama : "+e.nama);
                System.out.println("Usia : "+e.usia);
                System.out.println("Kemampuan : "+e.kemampuan);
                System.out.println("Senjata : " +e.senjata);
                System.out.println("Bisa Terbang : "+e.terbang);
                System.out.println("-------------------------------------------------");

            break;
            
            case 2:
                System.out.println("---------------- Hai ORC --------------");
                System.out.print("Nama: ");
                o.nama = input.next();
                System.out.print("Kemampuan : ");
                o.kemampuan = input.next();
                System.out.print("Warna ? [Hijau, Biru, Ungu] : ");
                o.warna = input.next();
                System.out.println("-------------------------------------------------");
                
                Scanner waitForKeypress2 = new Scanner (System.in);
                System.out.print (" Tekan tombol Enter untuk melanjutkan ");
                waitForKeypress2.nextLine ();
                
                System.out.println("---------------- Hai ORC --------------");
                System.out.println("Nama : "+o.nama);
                
                System.out.println("Kemampuan : "+o.kemampuan);
                
                System.out.println("Warna ? [Hijau, Biru, Ungu] : "+o.warna);
                
                System.out.println("-------------------------------------------------");
                
            break;
            
            default :
                System.out.println("Masukkan keyword yang benar");
                break;
            }  
    }
    
}
