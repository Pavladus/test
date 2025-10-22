package lesson2_4;

public class Miska {
    private int foodAmount;

    public Miska(int foodAmount) {
        if (foodAmount < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = foodAmount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}
