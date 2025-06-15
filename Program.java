//imports java
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

//meus imports
import utils.MyFileHandle;
import utils.Colors;
import src.model.entity.Docente;

public class Program
{
  public static void main( String[] args )
  {
    String path = "src/data/docentes.csv";

    ArrayList<String> archive = new ArrayList<String>();
    ArrayList<Docente> docentes = new ArrayList<Docente>();

    archive.addAll( MyFileHandle.read(path) );



    //TODO: Transformar isso em um método ou métodos
    //formatando as linhas do CSV em um ArrayList
    for( int counter = 1; counter < archive.size() ; ++counter )
    {
      //Este código está MUITO feio
      String[] element = archive.get(counter).split(";");

      ArrayList<String> final_element = new ArrayList<String>();
      final_element.add(element[0]);
      final_element.add(element[1]);
      final_element.add(element[6]);
      final_element.add(element[8]);
      final_element.add(element[10]);

      //TODO: criar método para isto
      //Tratamento das aspas duplas (");
      for( int i = 0 ; i < final_element.size() ; ++i )
      {
        String string = final_element.get(i);
        final_element.set(i, string.replace("\"", ""));
      }

      String[] time = final_element.get(4).split(" ");

      final_element.set( 4, time[0] );

      Docente docente = new Docente(final_element);

      docentes.add(docente);

      //System.out.println(Colors.ANSI_YELLOW + "ELEMENT " + counter + ": " + final_element + Colors.ANSI_RESET);
    }
    for( Docente docente : docentes )
    {
      System.out.println(docente.toString());
    }
    //System.out.println(docentes.get(1).toString());
  }
}
