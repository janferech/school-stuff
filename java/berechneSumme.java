import java.util.*;
class berechneSumme{
  public static void main(String [] agrs) {
    
    int zahlen[][] = new int [2][3];
    
    int summeZeilen[] = new int [4];
    int summeSpalten[] = new int [4];
    
    Scanner sc = new Scanner (System.in);
    for (int i = 0;i < zahlen.length ;i++ ) {
      for (int j = 0; j < zahlen[0].length ;j++ ) {
        System.out.print((i+1) +". .Zeile und " + (j+1) + ". Spalte ---- Zahl: ");
        zahlen[i][j] = sc.nextInt();
        summeZeilen[i] += zahlen[i][j];
      } // end of for
      System.out.println();
    } // end of for
     for (int i = 0;i < zahlen[0].length ;i++ ) {
      for (int j = 0; j < zahlen.length ;j++ ) {
        summeSpalten[i] += zahlen[j][i];
        }
      }
    
    for (int i = 0;i < zahlen.length ;i++ ) {
      for (int j = 0; j < zahlen[0].length ;j++ ) {
      System.out.print(zahlen[i][j] + "\t");
      }
      System.out.println();
     }
    System.out.print("\nZeilen (Links nach Rechts)" +summeZeilen[0] + "\t" + summeZeilen[1]);
    System.out.print("\nSpalten (Oben + unten) " + summeSpalten[0] + "\t" + summeSpalten[1]);
    }
  }                                        
