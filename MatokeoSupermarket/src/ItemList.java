import java.util.HashMap;

public class ItemList {

    HashMap<String, Integer> lists = new HashMap<String, Integer>();

    public void addData() {

        // Cereals
        lists.put("Maize", 20);
        lists.put("Rice", 100);
        lists.put("Sorghum", 120);
        lists.put("Oats", 235);
        lists.put("Millet", 145);

        // Beverages
        lists.put("Soda", 99);
        lists.put("Milk", 102);
        lists.put("Water", 40);

        // Vegetables
        lists.put("Kales", 40);
        lists.put("Spinach", 50);
        lists.put("Cabbage", 65);

        // Flour per 2kg
        lists.put("Jembe", 98);
        lists.put("Jogoo", 88);
        lists.put("EXE", 123);
        lists.put("Taifa", 120);

    }

    public int checkPrice(String name) {

        return lists.get(name);

    }

}
