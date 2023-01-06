public class StateShipping implements OrderState {
  private static StateShipping state = new StateShipping();

  private StateShipping() {
  };

  public static StateShipping getStateShipping() {
    return state;
  }
}
