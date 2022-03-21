package BookSorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books =new TreeSet<Book>(new BookNameCompare());
        books.add(new Book("Empati", "Adam Fawer", 690));
        books.add(new Book("Suç ve Ceza", "Fyodor Dostoyevski", 705));
        books.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali",  177));
        books.add(new Book("Dönüşüm", "Kafka",  422));
        books.add(new Book("Yer Altından Notlar", "Fyodor Dostoyevski", 705));

        System.out.println("Kitap Adına Göre Sıralam");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getBookName());
        }

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            //Sayfa sayısına göre sıralama işlemi için
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        }.reversed());

        books1.add(new Book("Empati", "Adam Fawer", 690));
        books1.add(new Book("Suç ve Ceza", "Fyodor Dostoyevski", 705));
        books1.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali",  177));
        books1.add(new Book("Dönüşüm", "Kafka",  422));
        books1.add(new Book("Yer Altından Notlar", "Fyodor Dostoyevski", 160));

        System.out.println("\n\nSayfa Sayısına Göre Sıralam");
        Book book;
        Iterator<Book> iterator1 = books1.iterator();
        while (iterator1.hasNext()){
            book = iterator1.next();
            System.out.println(book.getBookName()+":\t"+ book.getPageCount());
        }
        ArrayList<Integer> t = new ArrayList<>();

    }
}
