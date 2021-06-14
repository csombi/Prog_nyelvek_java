public enum TelevisionShop {
  SAMSUNG(50, 30, 120), LG(50, 30, 130), SKYWORTH(0, 10, 20), SONY(30, 24, 60), SHARP(25, 40, 80);

  private final int count;
  private final int min_diameter;
  private final int max_diameter;

  private TelevisionShop( int c, int min, int max ) {
    this.count = c;
    this.min_diameter = min;
    this.max_diameter = max;
  }

  public static String allSize() {
    StringBuilder sb = new StringBuilder();
    for( TelevisionShop tv : TelevisionShop.values() ) {
      sb.append(tv.name()).append(" min: ")
      .append(tv.min_diameter).append(" max: ")
      .append(tv.max_diameter).append('\n');
    }
    return sb.toString();
  }

  public String sizes() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.name()).append(" min: ")
    .append(this.min_diameter).append(" max: ")
    .append(this.max_diameter).append('\n');
    return sb.toString();
  }

  public static String inStock() {
    StringBuilder sb = new StringBuilder();
    for( TelevisionShop tv : TelevisionShop.values() ) {
      sb.append(tv.name()).append(" in stock: ")
      .append(tv.count).append('\n');
    }
    return sb.toString();
  }
}
