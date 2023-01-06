import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderTest {

  HandlerStock handlerStock;
  HandlerPayment handlerPayment;
  HandlerShipping handlerShipping;
  HandlerDelivery handlerDelivery;

  @BeforeEach
  void setup() {
    handlerDelivery = new HandlerDelivery(null);
    handlerShipping = new HandlerShipping(handlerDelivery);
    handlerPayment = new HandlerPayment(handlerShipping);
    handlerStock = new HandlerStock(handlerPayment);
  }

  @Test
  void shouldReturnStockProcessingStateStock() {
    Order order = new Order(StateStock.getStateStock());
    assertEquals("Stock", handlerStock.processOrder(order));
  }

  @Test
  void shouldReturnPaymentProcessingStatePayment() {
    Order order = new Order(StatePayment.getStatePayment());
    assertEquals("Payment", handlerStock.processOrder(order));
  }

  @Test
  void shouldReturnShippingProcessingStateShipping() {
    Order order = new Order(StateShipping.getStateShipping());
    assertEquals("Shipping", handlerStock.processOrder(order));
  }

  @Test
  void shouldReturnDeliveryProcessingStateDelivery() {
    Order order = new Order(StateDelivery.getStateDelivery());
    assertEquals("Delivery", handlerStock.processOrder(order));
  }

  @Test
  void shouldNotProcessStateCancelled() {
    Order order = new Order(StateCancelled.getStateCancelled());
    assertEquals("Pedido não foi processado!", handlerStock.processOrder(order));
  }

}
