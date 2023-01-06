public class HandlerStock extends OrderHandler {
  public HandlerStock(OrderHandler handler) {
    this.requiredOrderState = StateStock.getStateStock();
    this.setHandler(handler);
  }

  public String getDescription() {
    return "Stock";
  }
}
