public class User {

    public static void main(String[] args) {
        ItemList items = new ItemList();

        try {
            items.checkPrice("Maize");
        } catch (NullPointerException e) {
            System.out.println("We don't have that");
        }

        items.totalPrice("Maize", "Soda");

    }

}