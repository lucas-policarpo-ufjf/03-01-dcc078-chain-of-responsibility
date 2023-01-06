public class StateCancelled implements OrderState {
  private static StateCancelled state = new StateCancelled();

  private StateCancelled() {
  };

  public static StateCancelled getStateCancelled() {
    return state;
  }
}
