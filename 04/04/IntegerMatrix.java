public class IntegerMatrix {
  private int rowNum, colNum;
  private int[][] matrix;

  public IntegerMatrix( int row, int col, int[] linearData ) {
    this.rowNum = row;
    this.colNum = col;
    matrix = new int[rowNum][colNum];

    for( int i = 0; i < rowNum; i++ ) {
      for( int j = 0; j < colNum; j++ ) {
        matrix[i][j] = linearData[i * colNum + j];
      }
    }
  }

  //  Figyelni kell arra, hogy karaktert vagy srtinget fűzünk-e hozzá
  //  StringBuilder nélkül
  public String toString_() {
    String s = "";
    for( int i = 0; i < rowNum; i++ ) {
      for( int j = 0; j < colNum; j++ ) {
        s += matrix[i][j] + ",";
      }
      s += ";\n";
    }
    return s;
  }

  //  StringBuilder
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for( int i = 0; i < rowNum; i++ ) {
      for( int j = 0; j < colNum; j++ ) {
        sb.append( matrix[i][j] );
        if( j < colNum - 1 ) sb.append(",");
      }
      if( i < rowNum - 1 ) sb.append(";\n");
    }
    return sb.toString();
  }

}
