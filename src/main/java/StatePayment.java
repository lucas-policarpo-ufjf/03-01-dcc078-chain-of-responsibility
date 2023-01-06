public class StatePayment implements OrderState {
  private static StatePayment state = new StatePayment();

  private StatePayment() {
  };

  public static StatePayment getStatePayment() {
    return state;
  }
}
