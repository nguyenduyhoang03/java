import java.util.ArrayList;

public class Order {
    private String customerName;
    private String transactionTime;
    ArrayList<LineItem> lineItems = new ArrayList<>();
    public Order(){}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
    public void setCNameAndTransactionTime(String customerName, String transactionTime){
        this.customerName = customerName;
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", transactionTime='" + transactionTime + '\'' +
                ", lineItems=" + lineItems +
                '}';
    }
    public double cost(){
        double totalCost = 0;
        for (LineItem lineItem : lineItems) {
            totalCost += lineItem.cost();
        }
        return totalCost;
    }
    public boolean addProduct(Product product, int quantityToPurchase) {
        if (quantityToPurchase <= product.getQuantity()) {
            LineItem lineItem = new LineItem(product, quantityToPurchase);
            lineItems.add(lineItem);
            product.setQuantity(product.getQuantity() - quantityToPurchase);
            System.out.println("success");
            return true;
        } else {
            System.out.println("Fail");
            return false;
        }
    }
}
