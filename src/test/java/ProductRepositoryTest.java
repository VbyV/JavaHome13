import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.JavaHome13.Book;
import ru.netology.statistic.JavaHome13.Product;
import ru.netology.statistic.JavaHome13.Smartphone;

public class ProductRepositoryTest {
    Product book1 = new Book(12, "Му-му", 500, "Иван Тургенев");
    Product book2 = new Book(10, "Harry Potter", 700, "J.Rolling");
    Product book3 = new Book(1, "Имя Розы", 670, "Умберто Эко");
    Product smartphone1 = new Smartphone(23, "galaxy5", 18_000, "Samsung");
    Product smartphone2 = new Smartphone(56, "Line", 49_000, "Xiaome");
    Product smartphone3 = new Smartphone(90, "Plus", 100_000, "Apple");

    @Test
    public void ShowSaveProductBook() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowSaveProductSmartphone() {
        ProductRepository repo = new ProductRepository();
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

        Product[] expected = {smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void DeletedId() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);
        repo.removeById(book3.getId());
        repo.removeById(smartphone3.getId());

        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.getItems();
    }
}
