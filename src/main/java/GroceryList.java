import java.util.List;

public interface GroceryList {
    List<Item> getItems();

    void add(Item item);

    void remove(Item item);
}
