import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter the book or software code");
        String code = keybd.nextLine();

        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Kathy Sierra");
        b.setPrice(49.99);
        b.setDescription("OCA/OCP Java SE 7 Programmer I & II Study Guide");
        System.out.println(b.toString());

        Software s = new Software();
        s.setCode(code);
        s.setOs("Mac");
        s.setOs("OS Mojave");
        s.setDescription("Notepad++");
        s.setPrice(9.99);
        System.out.println(s.toString());

    }
}
