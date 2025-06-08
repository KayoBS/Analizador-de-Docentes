import utils.MyFileHandle;

public class Program
{
  public static void main( String[] args )
  {
    MyFileHandle fileHandle = new MyFileHandle();
    String path = "src/data/docentes.csv";

    fileHandle.read(path);
  }
}
