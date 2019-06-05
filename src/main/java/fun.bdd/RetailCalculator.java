package fun.bdd;

public class RetailCalculator {
    double price = 0.0;
    private int numberOfItems = 0;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumberOfItems(int numberOfItems) throws InvalidArgumentException {
        if (numberOfItems > 0)
            this.numberOfItems = numberOfItems;
        else
            throw new InvalidArgumentException("Number of items must be greater than zero");
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public Double getOrderValue() {
        return numberOfItems * price;
    }
}
