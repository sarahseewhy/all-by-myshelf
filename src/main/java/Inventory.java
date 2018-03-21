import java.util.List;

public interface Inventory {
    List<Item> getItems();

    void add(Item item);
}
