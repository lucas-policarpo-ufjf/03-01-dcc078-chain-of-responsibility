public class Order {
  private OrderState state;

  public Order(OrderState state) {
    this.state = state;
  }

  public OrderState getState() {
    return state;
  }

  public void setState(OrderState state) {
    this.state = state;
  }

}
