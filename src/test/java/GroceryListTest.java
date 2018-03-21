import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroceryListTest {

    @Test
    public void inventoryIsEmpty() {
        GroceryList groceryList = new GroceryListImpl();

        assertThat(groceryList.getItems(), is(new ArrayList<Item>()));
    }

    @Test
    public void addItemToInventory() {

        Item item = new ItemImpl();
        GroceryList groceryList = new GroceryListImpl();

        groceryList.add(item);

        Integer expectedGroceryListSize = groceryList.getItems().size();

        assertThat(expectedGroceryListSize, is(1));
    }
}