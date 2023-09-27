public class DeliveryOrder extends Order {
    private String Address;

    public DeliveryOrder() {
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "Address='" + Address + '\'' +
                '}';
    }
}
