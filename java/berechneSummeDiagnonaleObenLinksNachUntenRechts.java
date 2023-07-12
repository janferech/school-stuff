import java.util.*;

class berechneSummeDiagnonaleObenLinksNachUntenRechts{
  public static void main(String [] args) {
    
    int zahlen[][] = new int[3][3];
    
    int summe = 0;
    
    Scanner sc = new Scanner (System.in);    
    for (int i = 0;i < zahlen.length ;i++ ) {
      for (int j = 0; j < zahlen[0].length ;j++ ) {
        System.out.print((i+1) + ". Spalte\t" + (j+1) + ". Zeile ---> Zahl: ");
        zahlen[i][j] = sc.nextInt();
        }
      }
    
     //for (int i = 5;i < zahlen[0].length ;i-- ) {
      //for (int j = 0; j < zahlen.length ;j++ ) {
        //summe += zahlen[j][i];
       //}
      //}
    for (int i = 0;i < zahlen.length ;i++ ) {
      for (int j = 0;j < zahlen[0].length ;j++ ) {
        summe += zahlen[i][j];
        i++;
        
      } // end of for
      
    } // end of for
    int summe2 = 0;
    int temp = zahlen.length-1;
    for (int i = 0;i < zahlen.length ;i++ ) {
        summe2 += zahlen[temp][i];
        temp--;
      }
    System.out.println(summe);
    System.out.println("\n" + summe2);
    }
  }
    
       
        
