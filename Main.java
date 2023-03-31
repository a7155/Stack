import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private ArrayList <Buku> dataBuku;
    
    public static void main(String[] args) throws Exception {
        Main Screen = new Main();
        Screen.inputData();
        Screen.cetakData();
    }
    public void inputData() {
        
        
        Scanner scan = new Scanner(System.in);
        dataBuku = new ArrayList<Buku>();
        String jawaban,judul,autor,penerbit;
        Integer tahun;
        double kategori;
        int number = 1;
        do {
            System.out.println("________________________________");
            System.out.println("Data Buku ke "+number);
            System.out.print("Judul : ");
            judul=scan.next();
            System.out.print("Author : ");
            autor=scan.next();
            System.out.print("Penerbit : ");
            penerbit=scan.next();
            System.out.print("Kategori : ");
            kategori = scan.nextInt();
            System.out.print("Tahun : ");
            tahun=scan.nextInt();
            Buku buku = new Buku(judul, autor, penerbit, kategori, tahun);
            dataBuku.add(buku);
            System.out.print("Apakah Anda Ingin Menambahkan Lagi? (Y/N): ");
            jawaban=scan.next();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    }
    public void cetakData() {
        Stack<String> data = new Stack<>();
        System.out.println("\n\n======================================================================================");
        System.out.println("DAFTAR BUKU YANG TERSEDIA");
        System.out.println("======================================================================================");
        System.out.println("No\tJUDUL\t\tAUTHOR\t\tPENERBIT\t\tTAHUN\tKATEGORI");
        System.out.println("======================================================================================");
        int t_sum = 0;
        int m_sum = 0;
        int f_sum = 0;
        int l_sum = 0;
        int b_sum = 0;

        for (int i = 0; i < dataBuku.size(); i++) {
            System.out.println((i+1)+"\t"+dataBuku.get(i).judul+"\t"+dataBuku.get(i).autor+"\t"+dataBuku.get(i).penerbit+"\t"+dataBuku.get(i).tahun+"\t"+dataBuku.get(i).keterangan);

            if (dataBuku.get(i).keterangan.equals("Teknik")) {
                t_sum++;
            } else if (dataBuku.get(i).keterangan.equals("Manajemen")) {
                m_sum++;
            }else if (dataBuku.get(i).keterangan.equals("Fiksi")) {
                f_sum++;
            }else if (dataBuku.get(i).keterangan.equals("Lainnya")) {
                l_sum++;
            }
            
            if (dataBuku.get(i).tahun >= 2020) {
                b_sum++;
            }
            data.push(dataBuku.get(i).keterangan);
        }

        System.out.println("======================================================================================");
        System.out.println("\n\nJumlah Buku : "+dataBuku.size());
        System.out.println("Jumlah Buku Teknik : "+t_sum);
        System.out.println("Jumlah Buku Manajemen : "+m_sum);
        System.out.println("Jumlah Buku Fiksi : "+f_sum);
        System.out.println("Jumlah Buku Lainnya: "+l_sum);
        System.out.println("Jumlah Buku Lawas : "+(dataBuku.size()-b_sum));
        System.out.println("Jumlah Buku Baru : "+b_sum);
        System.out.println("======================================================================================");
        System.out.println("                                       Stack                                          ");
        System.out.println("======================================================================================");
        for (String j : data) {
            int i=0;
            System.out.println("Stock Item \t : "+ j);
        }
        System.out.println("======================================================================================");
        System.out.println("Stack item \t\t :" +data);
        System.out.println("Lihat index pertama \t :" +data.firstElement());
        System.out.println("Lihat index terakhir \t :" +data.lastElement());
        data.pop();
        System.out.println("Stack after pop \t :" +data);
        System.out.println("Pick \t\t\t :" +data.peek());
        System.out.println("Cek Apakah Kosong? \t :" +data.isEmpty());
        System.out.println("Lihat index ke 2 \t :" +data.get(1));
        System.out.println("Hapus index ke 2 \t :" +data.remove(1));
        System.out.println("Stack item sebelum clear \t :" +data);
        data.clear();
        System.out.println("Stack item setelah clear \t :" +data);
        System.out.println("Cek Apakah Kosong? \t :" +data.isEmpty());
        
    }
}
