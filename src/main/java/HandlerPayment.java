public class HandlerPayment extends OrderHandler {
  public HandlerPayment(OrderHandler handler) {
    this.requiredOrderState = StatePayment.getStatePayment();
    this.setHandler(handler);
  }

  public String getDescription() {
    return "Payment";
  }
}
