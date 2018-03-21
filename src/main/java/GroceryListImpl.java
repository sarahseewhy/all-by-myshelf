import java.util.ArrayList;
import java.util.List;

public class GroceryListImpl implements GroceryList {

    private List<Item> items = new ArrayList<>();

    public GroceryListImpl() {
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }
}
