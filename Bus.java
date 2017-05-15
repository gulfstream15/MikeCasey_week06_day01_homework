class Bus {

  private String route;
  private Person[] passangers; 

  public Bus(String route){
    this.passangers = new Person[5];  
    this.route = route;
  }

  public String getRoute(){
    return this.route;
  }

  public int passengerCount() {
    int count = 0;
    for (Person passanger : passangers) {
      if (passanger != null) {
        count++;
      }
    }
    return count;
  }

  public void loadPassengers(Person person) {
    if (isBusFull()) { 
      return;         
    }
    int index = passengerCount();
    passangers[index] = person; 
  }

  public boolean isBusFull() {
    return passengerCount() == passangers.length;
  }

  public void BackToDepot() {
    for (int i = 0; i < passangers.length; i++) {
      passangers[i] = null;
    }
  }

}