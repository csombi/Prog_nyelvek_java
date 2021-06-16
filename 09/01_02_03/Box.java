public class Box<T> {
  T val;
  private T[] array;
  
  public Box( T param ) {
    this.val = param;
  }

  public T get() {
    return val;
  }
}
