import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.JavaHome13.Book;
import ru.netology.statistic.JavaHome13.Product;
import ru.netology.statistic.JavaHome13.Smartphone;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(12, "Му-му", 500, "Иван Тургенев");
    Product book2 = new Book(10, "Harry Potter", 700, "J.Rolling");
    Product book3 = new Book(1, "Имя Розы", 670, "Умберто Эко");
    Product smartphone1 = new Smartphone(23, "galaxy5", 18_000, "Samsung");
    Product smartphone2 = new Smartphone(56, "Line", 49_000, "Xiaome");
    Product smartphone3 = new Smartphone(90, "Plus", 100_000, "Apple");


    @Test
    public void shouldAddAllProduct() {
            manager.add(book1);
            manager.add(book2);
            manager.add(book3);
            manager.add(smartphone1);
            manager.add(smartphone2);
            manager.add(smartphone3);

     Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};
     Product[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindNameBook() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {book3};
        Product[] actual = manager.searchBy("Имя Розы");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public  void ShouldNotFindIfNotAdd() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Blabla");
    }

}
