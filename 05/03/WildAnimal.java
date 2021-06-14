public enum WildAnimal {
  Monkey("Bananas", 12), Elephant("Apple", 666), Giraffe("Pineapple", 41), Raccoon("Rasp", 10);

  private String fruit;
  private int dailyAmount;

  WildAnimal( String f, int a ) {
    this.fruit = f;
    this.dailyAmount = a;
  }

  public String listAllAnimals() {
    StringBuilder sb = new StringBuilder();
    for( WildAnimal animal : WildAnimal.values() ) {
      sb.append( animal.ordinal() ).append(": ").append(animal.name()).append(dailyAmount * 7).append(":").append(animal.fruit);
    }
    return sb.toString();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.name()).append(": ").append(this.dailyAmount).append(this.fruit);
    return sb.toString();
  }

}

