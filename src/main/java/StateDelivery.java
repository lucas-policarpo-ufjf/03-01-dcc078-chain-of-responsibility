public class StateDelivery implements OrderState {
  private static StateDelivery stateDelivery = new StateDelivery();

  private StateDelivery() {
  };

  public static StateDelivery getStateDelivery() {
    return stateDelivery;
  }
}
