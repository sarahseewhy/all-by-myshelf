import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InventoryTest {

    @Test
    public void inventoryIsEmpty() {
        Inventory inventory = new InventoryImpl();

        assertThat(inventory.getItems(), is(new ArrayList<Item>()));
    }

    @Test
    public void addItemToInventory() {

        Item item = new ItemImpl();
        Inventory inventory = new InventoryImpl();

        inventory.add(item);

        Integer expectedInventorySize = inventory.getItems().size();

        assertThat(expectedInventorySize, is(1));
    }
}
