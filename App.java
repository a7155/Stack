import java.util.Stack;
/**
 *
 * @author 4715
 */
public class App {
    public static void main(String[] args) {
        Stack<String> jurusan = new Stack<>();
        jurusan.push("Teknik Informatika");
        jurusan.push("Teknik Industri");
        jurusan.push("Teknik Mesin");
        jurusan.push("DKV");
        
        System.out.println("Stack item \t\t :" +jurusan);
        jurusan.pop();
        System.out.println("Stack after pop \t :" +jurusan);
        System.out.println("Pick \t\t\t :" +jurusan.peek());
        System.out.println("Cek Apakah Kosong? \t :" +jurusan);
        System.out.println("Lihat index ke 2\t:" +jurusan.get(1));
        System.out.println("Lihat index pertama \t :" +jurusan.firstElement());
        System.out.println("Lihat index terakhir \t :" +jurusan.lastElement());
        jurusan.remove(1);
        System.out.println("Stack item sebelum clear \t :" +jurusan);
        jurusan.clear();
        System.out.println("Stack item setelah clear \t :" +jurusan);
        
        for (String j : jurusan) {
            System.out.println("Stock Item \t :"+ j);
        }
    }
}
