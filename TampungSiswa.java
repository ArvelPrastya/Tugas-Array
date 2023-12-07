import java.util.Scanner;

public class TampungSiswa {
    public static void main(String[] args) {
        String namaSiswa[] = new String [4];
        
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<namaSiswa.length;i++) {
            System.out.print("Masukkan Nama Siswa: ");
            String nama = scan.nextLine();
            namaSiswa[i] = nama;
        }
        for(int i=1;i<namaSiswa.length;i++) {
            System.out.println("Nama Siswa " + i + " : " + namaSiswa[i]);
            String nama =scan.nextLine();
            namaSiswa[i]=nama;
           }
        for(int j=0;j<namaSiswa.length;j++){
            System.out.println(namaSiswa[j]);
        }
    }
}