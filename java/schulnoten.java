import java.util.Scanner;

public class schulnoten{

String faecher[]={"Deutsch","Englisch","Geschichte"};
String notenTypen[] = {"1. Klausur","2. Klausur", "schriftliche Note", "mündliche Note", "Zeugnisnote"};

String namen = "";

int zahlen[][] = new int [3][5];

static Scanner sc = new Scanner(System.in);

void eingabe() {

System.out.print("SchuelerName: ");
namen = sc.next();
    
    
    int temp = 0;
    for (int i = 0; i < zahlen.length;i++){
    System.out.println("Fach : " + faecher[i] );
    for (int j = 0; j < zahlen[i].length; j++) {   
        do {
          
        if (j == 2 || j == 4) {

            }   else {
                System.out.print("Note: " + notenTypen[j]+" ");// [0][0-2] = Deutsch 1-2 Klausur + muendliche Not  
                zahlen[i][j] = sc.nextInt();                   // [1][0-2] = Englisch 1-2 Klausur + muendliche Note 
                temp = zahlen[i][j];    }
          
      }  while (temp > 15); // end of do-while                                     
      }  
    }
  }
 
void verarbeitung() {
    for (int i = 0; i < zahlen.length;i++) {
        zahlen[i][2] = Math.round((zahlen[i][0]+zahlen[i][1])/2);
        zahlen[i][4] = Math.round((zahlen[i][2]+zahlen[i][3])/2);
        }

}
                                                      //Umdrehen der Tabelle, sodass Faecher oben sind (Spalten)
void ausgabe() {
    for (int i = 0; i < zahlen[0].length; i++) {   //i < zahlen[0] weil wir wollen das die Ausgabe vertikal passiert und nicht horizontal
        for (int j = 0; j < zahlen.length; j++){
            System.out.print(zahlen[j][i] + "\t");
        } 
        if (i > 0 && i < (zahlen[0].length - 1)){
           System.out.println("\n-------------------------------------------");
                
          } System.out.println();   
    }
    System.out.println("---------------------------------------------------");
}   
    public static void main(String[] args) {
    
    char loop = 'j';
       
    schulnoten sn = new schulnoten();
    
    while (loop == 'j' || loop == 'J') { 
      
   
      
      System.out.println("****************************************************************");
      System.out.println("\t\tSchulnoten");
      System.out.println("****************************************************************");
    
      sn.eingabe();
      sn.verarbeitung();
      sn.ausgabe();
      
      System.out.println("\n\nMoechten Sie eine neue Berechnung durchfuehren? (j/n)");
      loop  = sc.next().charAt(0);
      System.out.print("\n");
      
      
     } // end of while
     sc.close();
      
    }
}
