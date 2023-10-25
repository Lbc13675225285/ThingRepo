public class Shop {

    private Thing[] things;
    private int total = 0;  //dual purpose. 1) number of items stored in array, 2) next available index location

    public Shop(int numberItems) {
        things = new Thing[numberItems];
    }

    private boolean isFull() {
        return total == things.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }

    public boolean add(Thing thing) {
        if (isFull()) {
            return false;
        } else {
            things[total] = thing;
            total++;
            return true;
        }
    }

    public String list() {
        if (isEmpty()) {
            return "No products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < total; i++) {
                listOfProducts += i + ": " + things[i] + "\n";
            }
            return listOfProducts;
        }
    }
}
