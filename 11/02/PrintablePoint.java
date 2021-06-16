public class PrintablePoint extends Point implements Printable {

  @Override
  public void print() {
    System.out.println(super.toString());
  }
}
