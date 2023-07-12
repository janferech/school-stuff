/******************************************************************************



*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main(String[] args) {
  int zahlen[][] = new int[2][4];
  int temp[] = new int[2];
  Scanner sc = new Scanner(System.in);
  
  for (int i = 0; i< zahlen.length;i++){
      for (int j = 0; j < zahlen[i].length;j++){
  
  System.out.print((i+1) + ". Monat\t"+(j+1)+". Tag");
  zahlen[i][j] = sc.nextInt();                         //Speicher Zahlen von Monat  0 1 2 3 4 5 
        temp[i] += zahlen[i][j];                       //Speichert Zahlen von Monat2 0 1 2 3 4 5 
      }    
  }
  for (int i = 0; i< zahlen[0].length;i++){            //Getauscht
      for (int j = 0; j < zahlen.length;j++){
        System.out.print(zahlen[j][i] + "\t");         //Gibt Zahlen aus von oben nach unten Monat1 Monat2
      }                                                //                                       0     0
      System.out.println();                            //                                       1     1
                                                       //                                       2     2
    }
    for (int i = 0;i < temp.length ;i++ ) {
      System.out.print(temp[i] + "\t");
    } // end of for
  }
}

