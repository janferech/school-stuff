import java.util.*;

class filiale {
    public static void main(String[] args) {

        
        int[] endsumme = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************************************");
        System.out.println("\t\t\tQuartalumsaetze");
        System.out.println("*****************************************************************************\n");
        int sum2 = 0;    
    
        int menge = 0;
        System.out.print("Bitte geben Sie die Anzahl der Filialen an: ");
        menge = sc.nextInt();
    
        int[][] filiale = new int[menge][4];
        int[] summe = new int[menge];
        for (int i = 0; i < filiale.length; i++) {      
            for (int j = 0; j < filiale[0].length; j++) {
                System.out.print("Umsatz fuer Filiale " + (i + 1) + " (Quartal " + (j + 1) + "): ");
                filiale[i][j] = sc.nextInt();
                summe[i] += filiale[i][j];
            }
            sum2 += summe[i];         
        }
    
        for (int j = 0; j < filiale[0].length; j++) {
            int sum = 0;
        
            for (int i = 0; i < filiale.length; i++) {
                sum += filiale[i][j];
            }
            endsumme[j] = sum;
        }
         
        System.out.println("\n\n");
        System.out.println("\t   1. Quartal\t2. Quartal\t3. Quartal\t4. Quartal\tSumme");
        System.out.println("\t--------------------------------------------------------------------------");

        for (int i = 0; i < filiale.length; i++) {
            System.out.print("Filiale " + (i + 1));
            for (int j = 0; j < filiale[0].length; j++) {
                System.out.print("  " + filiale[i][j] + " TEUR \t");
            }
            System.out.print(summe[i] + "  TEUR");
            System.out.println();
        }
    

        System.out.println("\t--------------------------------------------------------------------------");
        System.out.print("Summe");
        summe[0] = 0; // das erste Element des Arrays summe wird auf 0 gesetzt
        for (int i = 0; i < endsumme.length - 1; i++) {
            System.out.print("\t  " + endsumme[i] + " TEUR");
            summe[0] += endsumme[i];
        }
        int addition = 0;
        for (int i = 0; i < endsumme.length; i++) {
          addition = addition + endsumme[i];
        }
        System.out.println("\t  " + addition + " TEUR"); // Gesamtsumme wird am Ende ausgegeben
    }
}
