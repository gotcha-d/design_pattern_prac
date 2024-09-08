package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf(int initialSize) {
        this.books = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
