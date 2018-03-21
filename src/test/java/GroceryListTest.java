import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroceryListTest {

    private Item item = new ItemImpl();
    private GroceryList groceryList = new GroceryListImpl();

    @Test
    public void groceryListIsEmpty() {

        assertThat(groceryList.getItems(), is(new ArrayList<Item>()));
    }

    @Test
    public void addItemToGroceryList() {

        groceryList.add(item);

        Integer expectedGroceryListSize = groceryList.getItems().size();

        assertThat(expectedGroceryListSize, is(1));
    }

    @Test
    public void removeItemFromGroceryListOfOneItem() {

        groceryList.add(item);
        groceryList.remove(item);

        Integer expectedGroceryListSize = groceryList.getItems().size();

        assertThat(expectedGroceryListSize, is(0));
    }

}
