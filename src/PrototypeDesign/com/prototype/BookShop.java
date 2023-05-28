package PrototypeDesign.com.prototype;
import java.util.*;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Book-" + i);
            getBooks().add(book);
        }
    }


    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    /**
     * Deep Cloning
     */
    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book book : getBooks()) {
            shop.getBooks().add(book);
        }
        return shop;
    }
    
}
