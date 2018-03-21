import java.util.ArrayList;
import java.util.List;

public class InventoryImpl implements Inventory {

    private List<Item> items = new ArrayList<>();

    public InventoryImpl() {
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
