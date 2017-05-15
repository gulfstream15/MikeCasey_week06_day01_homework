import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;
  Person person;

  @Before 
  public void before() {
    bus = new Bus("Balerno");
    person = new Person();
  }

  @Test
  public void hasRoute(){
    assertEquals("Balerno", bus.getRoute()); 
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount()); 
  }


  @Test
  public void canTakePassangers() {
    bus.loadPassengers(person);
    assertEquals(1, bus.passengerCount()); 
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 5; i++) {
      bus.loadPassengers(person);    
    }
    assertEquals(true, bus.isBusFull()); 
  }

  @Test
  public void cannotLoadPassangersWhenBusFull() {
    for (int i = 0; i < 10; i++) {
      bus.loadPassengers(person);    
    }
    assertEquals(5, bus.passengerCount()); 
  }

  @Test
  public void busEmptyAfterBacktoDepot() {
    bus.loadPassengers(person);    
    bus.BackToDepot();
    assertEquals(0, bus.passengerCount());
  }

}
