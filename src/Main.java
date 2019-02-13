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
        b.setISBN(9780071772006L);
        System.out.println(b.toString());

        Book c = new Book();
        c.setISBN(9780071772006L);

        Book d = new Book();
        d.setISBN(9000071772111L);


        Software s = new Software();
        s.setCode(code);
        s.setOs("Mac");
        s.setOs("OS Mojave");
        s.setDescription("Notepad++");
        s.setPrice(9.99);
        System.out.println(s.toString());

//        System.out.println(b.equals(s));
//        System.out.println(b.equals(b));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));

    }
}
