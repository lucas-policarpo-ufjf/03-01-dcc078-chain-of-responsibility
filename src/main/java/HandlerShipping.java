public class HandlerShipping extends OrderHandler {
  public HandlerShipping(OrderHandler handler) {
    this.requiredOrderState = StateShipping.getStateShipping();
    this.setHandler(handler);
  }

  public String getDescription() {
    return "Shipping";
  }
}
