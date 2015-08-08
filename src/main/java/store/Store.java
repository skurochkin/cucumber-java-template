package store;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VKurochkin on 8/6/2015.
 */
public class Store {
    private int location;

    public void setLocation(int location) {
        this.location = location;
    }

    public void sell(String product) {
    }

    public List<String> getProduct() {
        List<String> result = new ArrayList<String>();
        result.add("Computers");
        return result;
    }
}
