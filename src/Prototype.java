import PrototypeDesign.com.prototype.BookShop;

/**
 * Prototype design pattern is used when the Object creation is a costly affair and 
 * requires a lot of time and resources and you have a similar object already existing. 
 * Prototype pattern provides a mechanism to copy the original object to a new object 
 * and then modify it according to our needs. Prototype design pattern uses java cloning
 * to copy the object.
 */

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop = new BookShop();
        bookShop.setShopName("Tagore Edition");
        bookShop.loadData();
        

        BookShop newBookShop = bookShop.clone();
        bookShop.getBooks().remove(2);
        newBookShop.setShopName("Sukanta Enterprize");

        System.out.println(bookShop);
        System.out.println(newBookShop);
    }
}
