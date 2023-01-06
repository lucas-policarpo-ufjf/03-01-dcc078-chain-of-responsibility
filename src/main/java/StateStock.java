public class StateStock implements OrderState {
  private static StateStock state = new StateStock();

  private StateStock() {
  };

  public static StateStock getStateStock() {
    return state;
  }
}
