public class HandlerDelivery extends OrderHandler {
  public HandlerDelivery(OrderHandler handler) {
    this.requiredOrderState = StateDelivery.getStateDelivery();
    this.setHandler(handler);
  }

  public String getDescription() {
    return "Delivery";
  }
}
