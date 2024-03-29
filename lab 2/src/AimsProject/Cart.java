package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] items_Ordered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qty_Ordered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qty_Ordered < MAX_NUMBERS_ORDERED) {
            Integer index = (Integer) qty_Ordered;
            items_Ordered[index] = disc;
            //added and check 
            qty_Ordered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i <= qty_Ordered; i++) {
            if (items_Ordered[i] == disc) items_Ordered[i] = null;
        }
        qty_Ordered--;
        // System.out.println("ok!");
    }

    public float totalCost() {
        float cost = 0;
        for (int i = 0; i < qty_Ordered; i++) {
            cost += items_Ordered[i].getCost();
        }
        // System.out.println("ok!");
        // System.out.println(cost + "");
        return cost;
    }
}