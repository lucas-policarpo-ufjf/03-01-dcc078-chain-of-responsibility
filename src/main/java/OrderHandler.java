public abstract class OrderHandler {
  protected OrderState requiredOrderState;
  private OrderHandler handler;

  public OrderHandler getHandler() {
    return this.handler;
  }

  public void setHandler(OrderHandler handler) {
    this.handler = handler;
  }

  public abstract String getDescription();

  String processOrder(Order order) {
    if (order.getState() == this.requiredOrderState) {
      return this.getDescription();
    } else {
      if (this.handler != null) {
        return this.handler.processOrder(order);
      } else {
        return "Pedido não foi processado!";
      }
    }
  }

}
