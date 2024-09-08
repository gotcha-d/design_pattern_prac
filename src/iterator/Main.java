package iterator;

import java.util.Iterator;

public class Main {
    public static void main() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 明示的にIteratorを使う方法
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        // 拡張for文を使う方法
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
    }
    
}
